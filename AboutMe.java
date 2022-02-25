import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;

/**
File Name:	AboutMe
Programmer:	Lorrin Shen
Date:		February 11, 2022
Description:	This program demonstrates the
use of graphics and Jframe.

*/
public class AboutMe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe frame = new AboutMe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutMe() {
		super("About Me");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel aboutMeText = new JLabel("<html>My name is Lorrin Shen. I go to Victoria Park Collegiate Institute.<br/>"
				+ " My favourite song is A-O-K by Tai Verdes. I do not watch many TV shows.<br/>"
				+ " but I do enjoy watching anime. I do not have a favourite anime,<br/>"
				+ " the one I watched recently is Violet Evergarden.<br/>"
				+ " My favourite colour is blue.<html/>");

        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(aboutMeText);
        setVisible(true);

	}

}



