package _02_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible
		JFrame SBframe = new JFrame();
		SBframe.setVisible(true);
		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
		SBframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Make a new JPanel
		JPanel SBPanel = new JPanel();
		// 4. Add your panel to your frame
		SBframe.add(SBPanel);
		// 8. DO THIS LAST: 
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Using a specific object for a static variable works, but is not usually recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!

		// 5. Make three Smiley objects and add them to your panel
		Smiley.setColor("green");
		Smiley happy1 = new Smiley();
		SBPanel.add(happy1);
		Smiley happy2 = new Smiley();
		SBPanel.add(happy2);
		Smiley happy3 = new Smiley();
		SBPanel.add(happy3);
		
		// 6. Pack your frame
		SBframe.pack();
		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
	}
}
