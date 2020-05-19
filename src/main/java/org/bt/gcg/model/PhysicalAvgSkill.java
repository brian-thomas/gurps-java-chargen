/**
 * 
 */
package org.bt.gcg.model;

/**
 * @author thomas
 *
 */
public class PhysicalAvgSkill 
extends AbstractSkill 
implements PhysicalSkill 
{

	private static final long serialVersionUID = 5315990112017627147L;

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
		// TODO Auto-generated method stub
		return 0;
	}

}
