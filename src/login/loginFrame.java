package login;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import regMember.regFrame;
import regMember.regPanel;

public class loginFrame extends JPanel {
	private JFrame frame;
	private loginPanel loginPanel;
	private regPanel regPanel;

	public loginFrame(JFrame frame) {
		super();
		FrameInit(frame);
		PanelInit();
	}
	private void FrameInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);

		frame.getContentPane().add(this);
		this.setLayout(null);
	}

	private void PanelInit() {

		loginPanel = new loginPanel(frame);

		loginPanel.setBounds(80, 200, 1100, 600);
		loginPanel.setBackground(new Color(242, 242, 242));
		loginPanel.setBorder(null); 
		regPanel = new regPanel(frame);
		regPanel.setVisible(false);

		this.add(loginPanel);
	}
}