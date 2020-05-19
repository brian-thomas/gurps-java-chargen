package org.bt.gcg.tool;

import java.awt.Component;
import java.awt.Cursor;

import javax.swing.SwingUtilities;

import org.apache.log4j.Logger;
import org.bt.gcg.model.GURPSCharacter;
import org.bt.gcg.tool.component.MainFrame;

/** Main controller for the app. 
 * 
 * @author thomas
 *
 */
public class ApplicationController 
{

	private static final Logger logger = Logger.getLogger(ApplicationController.class);

	private static ApplicationController _userInterfaceWindowController;
	private MainFrame mainFrame = null;
	
	public static ApplicationController instance(GURPSCharacter c) {
		if (_userInterfaceWindowController == null) {
			_userInterfaceWindowController = new ApplicationController(c);
		}
		return _userInterfaceWindowController;
	}
	
	private ApplicationController(GURPSCharacter c) { mainFrame = MainFrame.instance(c); }

	public final void setCursor (Cursor cursor) { mainFrame.setCursor(cursor); }
	
	public final void setWaitCursor () { setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR)); }
	
	public final void setDefaultCursor() { setCursor(Cursor.getDefaultCursor()); }
	
	// the Configurer class.
	/** Update the UI after a UI property change. 
	 */
	public final void updateUI() { SwingUtilities.updateComponentTreeUI(mainFrame); }

	/** Show the main view.
	 */
	public final void showView() {
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	public Component getView() { return mainFrame; }
	
}
