package com.qa.java.calculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener{
	
	TextField txt1, txt2, txt3;
	
	public Operations( TextField a, TextField b, TextField c) {
		txt1 = a;
		txt2 = b;
		txt3 = c;
	}

	public void actionPerformed(ActionEvent e) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		if ( txt1.getText().length() >=1) {
			a = Double.parseDouble(txt1.getText());
		}
		if ( txt2.getText().length() >=1) {
			b = Double.parseDouble(txt2.getText());	
		}
		
		Button btn = (Button)e.getSource();
		String titleButton = btn.getLabel();
		
		if (titleButton.equals("+")) {
			c = a + b;
		}
		if (titleButton.equals("-")) {
			c = a - b;
		}
		if (titleButton.equals("*")) {
			c = a * b;
		}
		if (titleButton.equals("/")) {
			c = a / b;
		}
		
		String Result = String.valueOf(c);
		txt3.setText(Result);
		
	}
}
