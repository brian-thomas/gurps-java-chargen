/**
 * 
 */
package org.bt.gcg.model;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * @author thomas
 *
 */
abstract public class AbstractSkill 
implements Serializable 
{

	private static final long serialVersionUID = -3710516479216433565L;
	
	enum Stat {ST, DX, IN, HT };
	
    private String name;
    private String desc;
    private Stat stat;
    private double characterPoints = 0.0;
    
    abstract public int getDefaultLevel(GURPSCharacter c);
    abstract public int getModLevel();
    
	public final String getName() { return name; }
	public final void setName(String name) { this.name = name; }
	
	public final String getDesc() { return desc; }
	public final void setDesc(String desc) { this.desc = desc; }
	
	public final Stat getStat() { return stat; }
	public final void setStat(Stat stat) { this.stat = stat; }
	
	public final double getCharacterPoints() { return characterPoints; }
	public final void setCharacterPoints(int characterPoints) { this.characterPoints = characterPoints; }

}
