package com.qa.java.calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class Calculator {

	public static void main(String[]args) {
		Frame window = new Frame("Calculator");
		Button B1,B2,B3,B4;
		TextField T1, T2,T3;
		Label L1,L2,L3;
		B1 = new Button ("+");
		B2 = new Button ("-");
		B3 = new Button ("*");
		B4 = new Button ("/");
		T1 = new TextField();
		T2 = new TextField();
		T3 = new TextField();
		L1 = new Label("Num1");
		L2 = new Label("Num2");
		L3 = new Label("Result");
		B1.setBackground(Color.blue);
		B2.setBackground(Color.red);
		B3.setBackground(Color.green);
		B4.setBackground(Color.yellow);
		window.setBackground(Color.gray);
		
		Operations e = new Operations(T1, T2, T3);
		FlowLayout fl = new FlowLayout();
		
		B1.addActionListener(e);
		B2.addActionListener(e);
		B3.addActionListener(e);
		B4.addActionListener(e);
		
		window.setLayout(fl);
		window.add(L1);
		window.add(T1);
		window.add(L2);
		window.add(T2);
		window.add(B1);
		window.add(B2);
		window.add(B3);
		window.add(B4);
		window.add(L3);
		window.add(T3);
		
		window.setVisible(true);
		window.setSize(400, 400);
	}
}
