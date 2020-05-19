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

/**
 * @author thomas
 *
 */
public class SelectionPane 
extends JTabbedPane 
{

	private static final long serialVersionUID = 3452253379293979256L;

	public SelectionPane() {
		
		JPanel advantagesView = new JPanel();
		add(advantagesView, "Advantages");
		
		JPanel disadvantagesView = new JPanel();
		add(disadvantagesView, "Disadvantages");
		
		JPanel skillsView = new JPanel();
		add(skillsView, "Skills");
		
		JPanel spellsView = new JPanel();
		add(spellsView, "Spells");
		
		JPanel powersView = new JPanel();
		add(powersView, "Powers");
		
		JPanel manueversView = new JPanel();
		add(manueversView, "Manuevers");
		
	}
	
}
