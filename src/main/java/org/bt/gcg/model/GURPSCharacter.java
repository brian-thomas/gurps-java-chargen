
package org.bt.gcg.model;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;


/* A GURPS character, either player or non-player.
 * 
 */
public class GURPSCharacter 
implements Serializable
{
	
	private static final long serialVersionUID = -5343163035556579911L;
	 
	static enum Sex { Male, Female, Other };
	static enum Wealth { DeadBroke, Poor, Struggling, Average, Comfortable, Wealthy, FilthyRich};
	static enum Appearance {Hideous, Ugly, Average, Beautiful};
	
	private String name;
	 
    private int character_points = 0; 
    private int age = 20; 
     
    private int status = 0; 
     
    private Sex sex = Sex.Male; 
    private Wealth wealth = Wealth.Average; 
    private Appearance appearance = Appearance.Average; 
    private int height = 60; // in inches 
    private int weight = 145; // in lbs 
     
    private int ST = 10; 
    private int DX = 10; 
    private int IQ = 10; 
    private int HT = 10; 
    
    private int sizeModifier = 3; 
     
    private int will = 0;
    private int perception = 0; 
     
    // based on stats/abilities 
    private int parry = 0; 
    private int block = 0; 
    private int dodge = 0; 
    private int swim = 0; 
     
    private int fatigue; 
    private int move; 
    private float speed; 
    private int hitPoints; 
    private String thrust_damage; 
    private String swing_damage; 
     
    private List<Ability> abilities = new Vector<Ability>(); 
    private List<AbstractSkill> skills = new Vector<AbstractSkill>(); 
    private List<GURPSCharacter> npcList = new Vector<GURPSCharacter>();
	
    public GURPSCharacter() {}
    
	public final String getName()   { return name; }
   	public final Sex getSex() { return sex; }
   	public final int getCharacter_points() { return character_points; }
   	public final int getAge() { return age; }
   	public final int getSizeModifier() { return sizeModifier; }
   	public final int getStatus() { return status; }
   	public final Wealth getWealth() { return wealth; }
   	
   	
   	public final int getST() { return ST; }
   	public final int getDX() { return DX; }
   	public final int getIQ() { return IQ; }
   	public final int getHT() { return HT; }
   	
   	public final Appearance getAppearance() { return appearance; }
   	public final int getWill() { return will; }
   	public final int getPerception() { return perception; }
   	public final int getParry() { return parry; }
   	public final int getBlock() { return block; }
   	public final int getDodge() { return dodge; }
   	public final int getSwim() { return swim; }
   	public final int getHeight() { return height; }
   	public final int getWeight() { return weight; }
   	public final int getFatigue() { return fatigue; }
   	public final int getMove() { return move; }
   	public final float getSpeed() { return speed; }
   	public final int getHitPoints() { return hitPoints; }
   	public final String getThrust_damage() { return thrust_damage; }
   	public final String getSwing_damage() { return swing_damage; }
   	
   	public final List<Ability> getAbilities() { return abilities; }
   	public final List<AbstractSkill> getSkills() { return skills; }
	public final List<GURPSCharacter> getNpcList() { return npcList; }

	public final void setName(String name) { this.name = name; }
	
}
