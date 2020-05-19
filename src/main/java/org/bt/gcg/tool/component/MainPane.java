package org.bt.gcg.tool.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import org.apache.log4j.Logger;
import org.bt.gcg.model.GURPSCharacter;


/** A singleton application which is the Viper user interface. It organizes
 * various panes into the interface.
 *  
 * @author thomas
 *
 */
public class MainPane 
extends JPanel
{

	private static final long serialVersionUID = 3797969036661120336L;

	private static final Logger logger = Logger.getLogger(MainPane.class);

	private static MainPane userInterface = null;

	private static final int MAIN_PANEL_DIVIDE_SIZE = 5;

	private static JSplitPane mainPane;
	private static CharacterPane characterPane;
	private static SelectionPane selectionPane = new SelectionPane();
	private static JScrollPane statusPane;

	/**
	 * no public constructor is allowed
	 */
	private MainPane (GURPSCharacter c) 
	{
		
		//setBorder(BorderFactory.createEtchedBorder());
		
		characterPane = new CharacterPane(c);
		setLayout(new BorderLayout());

		JLabel projectTitleLabel = createProjectLabel();
		add(projectTitleLabel,BorderLayout.PAGE_START);
		
		mainPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				characterPane, selectionPane);
		
		//mainPane.setOneTouchExpandable(true);
		int divider_location = (new Integer(UIManager.getString("GUI.width")).intValue()/2);
		mainPane.setDividerLocation(divider_location);
		mainPane.setDividerSize(MAIN_PANEL_DIVIDE_SIZE);
		add(mainPane, BorderLayout.CENTER);
		
		/*
		statusPane = (StatusPane) StatusPaneController.instance().getView();
		add(statusPane, BorderLayout.PAGE_END);
		*/

		/*
		// configure delete key action
		AbstractViperAction deleteAction = new DeleteSelectedComponentAction();
		getActionMap().put(deleteAction.getActionKey(), deleteAction); 
		getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0), deleteAction.getActionKey()); 
		*/
		
	}
	
	private JLabel createProjectLabel () 
	{
		JLabel label = new JLabel("", SwingConstants.CENTER);
//		projectTitleLabel.setBackground(UIManager.getColor("Label.background"));
//		projectTitleLabel.setForeground(UIManager.getColor("Label.foreground"));
//		Font labelFont = UIManager.getFont("Label.font");
//		Font newFont = labelFont.deriveFont(Font.ITALIC|Font.BOLD,  labelFont.getSize()+4);
//		projectTitleLabel.setFont(newFont);
		return label;
	}
	
	/** Get an instance of the ViperUI
	 * 
	 * @return
	 */
	public final static MainPane instance(GURPSCharacter c) {
		if (userInterface == null) {
			userInterface = new MainPane(c);
		}
		return userInterface;
	}
	
	public final void setFrame (JFrame frame) { 
		// frame.setJMenuBar(createMenuBar()); 
	}
	
	/*
	private JMenuBar createMenuBar() {
		return new MenuBar(this);
	}
	*/
	

}
