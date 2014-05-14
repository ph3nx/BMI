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
	
	JLabel l1, l2, l3;
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
		
		l1 = new JLabel("Größe");
		l2 = new JLabel("Gewicht");
		l3 = new JLabel("Dein BMI beträgt:");
		
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
		add(c1); add(c2); add(b); add(l3);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	public static void main(String[] args) {
		new BMI();
	}

}
