package com.ph3nx.java.bmi;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMI extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	JButton b;
	JCheckBox c1, c2;
	ButtonGroup bg;
	
	double groesse, gewicht, bmi;
	
	public BMI() {
		setTitle("BMI");
		setSize(300,300);
		setLocation(100,100);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Größe");
		l2 = new JLabel("Gewicht");
		l3 = new JLabel("Dein BMI beträgt:");
		l4 = new JLabel("");
		
		t1 = new JTextField(3);
		t2 = new JTextField(3);
		
		b = new JButton("Go");
		
		bg = new ButtonGroup();
		c1 = new JCheckBox("male");
		c2 = new JCheckBox("female");
		
		bg.add(c1); bg.add(c2);
		b.addActionListener(this);
		add(l1); add(t1);
		add(l2); add(t2);
		add(c1); add(c2); add(b); add(l3); add(l3);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s1 = t1.getText();
		String s2 = t2.getText();
		
		groesse = Double.parseDouble(s1);
		gewicht = Double.parseDouble(s2);
		
		// status checkbox auswerten
		if (c1.isSelected()) bmi = gewicht / (groesse*groesse);
		if (c2.isSelected()) bmi = gewicht / (groesse*groesse) - 1;
		
		l3.setText("Dein BMI beträgt: " + bmi);
		
		if (bmi > 25) {
			l4.setText("U got too much fat.");
		} else if ( bmi < 20) {
			l4.setText("U're skinny.");
		} else {
			l4.setText("You're alright.");
		}
		
	}

	public static void main(String[] args) {
		new BMI();
	}

}
