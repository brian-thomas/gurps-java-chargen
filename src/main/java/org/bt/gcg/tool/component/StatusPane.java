package org.bt.gcg.tool.component;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class StatusPane 
extends JScrollPane 
{
	
	private static final long serialVersionUID = 8545499366555078573L;
	
	private static StatusPane _statusPane = null;	
    private JLabel statusLabel = null;
    
    public static StatusPane instance() {
    	if (_statusPane == null) {
    		_statusPane = new StatusPane();
    	}
    	return _statusPane;
    }
    
	private StatusPane (){
		statusLabel = new JLabel();
		setViewportView(statusLabel);
	}

	public void statusWarn(String text) {
	   	statusLabel.setText(warnText(text));
	   	statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
	}
	  
	public void clearStatus() { setStatus(""); }
	
    public void setStatus(String text) {
    	statusLabel.setText(text);
    	statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
    }
	 
    public void statusInfo(String text) {
    	statusLabel.setText(text);
    	statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
    }
	
	private static String warnText (String text) {
		return "<html><FONT COLOR=RED>"+text+"</FONT> </html>";
	}
	
}
