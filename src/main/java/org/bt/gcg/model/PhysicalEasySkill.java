/**
 * 
 */
package org.bt.gcg.model;

import java.util.Hashtable;

/**
 * @author thomas
 *
 */
public class PhysicalEasySkill 
extends AbstractSkill 
implements PhysicalSkill 
{

	private static final long serialVersionUID = 5315990112017627147L;

	protected static final Hashtable<Float,Integer> mod_array = new Hashtable<Float,Integer>();
	static {
		mod_array.put(new Float (0.5), new Integer(-1));
		mod_array.put(new Float (1.0), new Integer(0));
		mod_array.put(new Float (2.0), new Integer(1));
		mod_array.put(new Float (4.0), new Integer(2));
		mod_array.put(new Float (8.0), new Integer(3));
		mod_array.put(new Float (16.0), new Integer(4));
		mod_array.put(new Float (24.0), new Integer(5));
		mod_array.put(new Float (32.0), new Integer(6));
		mod_array.put(new Float (40.0), new Integer(7));
		mod_array.put(new Float (48.0), new Integer(8));
		mod_array.put(new Float (56.0), new Integer(9));
		mod_array.put(new Float (64.0), new Integer(10));
	}
	
	/* (non-Javadoc)
	 * @see org.bt.gcg.model.AbstractSkill#setDefaultLevel(org.bt.gcg.model.GURPSCharacter)
	 */
	@Override
	public int getDefaultLevel (GURPSCharacter c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getModLevel() {
		if (getCharacterPoints() > 0)
			return mod_array.get(new Float(this.getCharacterPoints())).intValue();
		else 
			return 0;
	}

}
