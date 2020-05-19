/**
 * 
 */
package org.bt.gcg.tool.component;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import org.bt.gcg.model.GURPSCharacter;

/**
 * @author thomas
 */
public class CharacterPane 
extends  JPanel
{

	private static final long serialVersionUID = 3452253379293979256L;
	
	// private GURPSCharacter character;
	
	public CharacterPane (GURPSCharacter c) 
	{
		
		// character = c;
		
		JLabel title = createLabel("Character View");
		add(title, BorderLayout.NORTH);
		JTabbedPane tabPane = new JTabbedPane(); 
		add(tabPane, BorderLayout.NORTH);
			
		JPanel statsView = new JPanel();
		tabPane.add(statsView, "Base Stats");
		
		JPanel advantagesView = new JPanel();
		tabPane.add(advantagesView, "Advantages");
		
		JPanel disadvantagesView = new JPanel();
		tabPane.add(disadvantagesView, "Disadvantages");
		
		JPanel skillsView = new JPanel();
		tabPane.add(skillsView, "Skills");
		
		JPanel spellsView = new JPanel();
		tabPane.add(spellsView, "Spells");
		
		JPanel powersView = new JPanel();
		tabPane.add(powersView, "Powers");
		
		JPanel manueversView = new JPanel();
		tabPane.add(manueversView, "Manuevers");
		
		// stats View
		JLabel name = createLabel("Name: "+c.getName());
		statsView.add(name, BorderLayout.NORTH);
		
		JLabel stats = createLabel("ST: "+c.getST()+" HT:"+c.getHT()+" DX:"+c.getDX()+" IQ:"+c.getIQ());
		statsView.add(stats, BorderLayout.NORTH);
		
		//Font labelFont = UIManager.getFont("Label.font");
		//Font bigFont = labelFont.deriveFont(Font.BOLD, labelFont.getSize()+1);
		
	}
	
	private static final JLabel createLabel (String str) 
	{
		JLabel label = new JLabel(str, SwingConstants.CENTER);
		label.setForeground(UIManager.getColor("Label.foreground"));
		Font labelFont = UIManager.getFont("Label.font");
		label.setFont(labelFont);
		return label;
	}
	
	// public final GURPSCharacter getCharacter() { return character; } 
	

}
