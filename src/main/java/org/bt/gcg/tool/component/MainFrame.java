package org.bt.gcg.tool.component;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.apache.log4j.Logger;
import org.bt.gcg.model.GURPSCharacter;

/** A Singleton class which represents the application.
 * 
 * @author thomas
 *
 */
public class MainFrame 
extends JFrame 
{

	private static final long serialVersionUID = 8581889913546028507L;
	
	private static final Logger logger = Logger.getLogger(MainFrame.class);
	
	private static MainFrame mainFrame;
	private MainPane userInterface;
	
	public static MainFrame instance(GURPSCharacter c) {
		if (mainFrame == null) {
			mainFrame = new MainFrame(c);
		}
		return mainFrame;
	}
	
	private MainFrame (GURPSCharacter c) {
	      
		super();
		
		//Make sure we have nice window decorations.
        setDefaultLookAndFeelDecorated(true);
        
        //JDialog.setDefaultLookAndFeelDecorated(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // set the app title
        String appTitle = "GURPS GURPSCharacter Generator v.01"; 
        setTitle(appTitle);
        
        /*
        //TODO: set image for app
        Image image = null;
        setIconImage(image); 
        */
        
        // the UI
		userInterface = MainPane.instance(c);
		userInterface.setFrame(this);
		
		getContentPane().add(userInterface);
		
		//setBorder(BorderFactory.createEtchedBorder());
		int height = new Integer(UIManager.getString("GUI.height")).intValue();
		int width = new Integer(UIManager.getString("GUI.width")).intValue();
		logger.debug(" Setting user pref size to height:"+height+" width:"+width);
		setPreferredSize(new Dimension(width, height));
	
	}
	
	// public final MainPane getUserInterface() { return userInterface; }
	
}
