/**
 * 
 */
package org.bt.gcg.tool;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.UIManager;

import org.apache.log4j.Logger;
import org.bt.gcg.model.GURPSCharacter;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

/**
 * @author thomas
 *
 */
public class GUI 
implements Runnable
{

	private static final Logger logger = Logger.getLogger(GUI.class);

	@Option(name="-p", usage="Properties file")
	private String propertyFile = "gcg.properties";

	// A little wrapper for "run" which captures the command line args
	private static void runProgram (Runnable main, String[] args) {

		CmdLineParser parser = new CmdLineParser(main);
		try {
			parser.parseArgument(args);
			javax.swing.SwingUtilities.invokeLater(main); 
		} catch (CmdLineException e) {
			System.err.println(e.getMessage());
			System.err.println("Available command line flags:");
			parser.printUsage(System.err);
			System.exit(-1);
		}
	}

	// For thread safety, this method should be invoked from the
	// event-dispatching thread.
	public void run() 
	{ 

		if (!propertyFile.isEmpty()) {
			InputStream is = GUI.class.getClassLoader().getResourceAsStream(propertyFile);
			if (is != null)
			{
				Properties props = new Properties();
				try {
					props.load(is);
					Enumeration keys = props.keys();
					while (keys.hasMoreElements()) {
						String key = (String) keys.nextElement();
						logger.debug("Loading property:"+key+" value:"+props.getProperty(key));
						UIManager.put(key, props.getProperty(key));
					}

				} catch (IOException ie) {
					logger.error(ie.getMessage());
					System.exit(-1);
				}
			} else
					logger.warn("Cannot find propertyFile:"+propertyFile+", ignoring");
		}

		/*
		// TODO: configure fonts from props file??
		Font baseFont = new Font("Lucida Console", Font.PLAIN, 14);
		Font treeFont = baseFont.deriveFont(Font.BOLD, baseFont.getSize()-2);
		Font bigFont = baseFont.deriveFont(Font.PLAIN, baseFont.getSize()+1);
		Font compFont = baseFont.deriveFont(Font.BOLD, baseFont.getSize()+1);
		Font emphasisFont = compFont.deriveFont(Font.ITALIC, baseFont.getSize()+1);

		UIManager.put("Base.font", baseFont);
		UIManager.put("Label.font", baseFont);
		UIManager.put("Component.font", compFont);
		UIManager.put("Bigger.font", bigFont);
		UIManager.put("Emphasis.font", emphasisFont);
		UIManager.put("Tree.font", treeFont);
		 */

		GURPSCharacter character = new GURPSCharacter();
		character.setName("The Dude");
		ApplicationController ui = ApplicationController.instance(character);
		ui.showView();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		runProgram(new GUI(), args);
	}

}
