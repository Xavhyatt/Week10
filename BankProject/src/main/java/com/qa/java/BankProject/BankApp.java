package com.qa.java.BankProject;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankApp {

	public static void main(String[] args) {
		
		Database db = new Database();
		
		Frame window = new Frame("Bank Options");
		Button CA, W,D;
		Panel bankOpt = new Panel();
		GridLayout g1 = new GridLayout(3,1);
		TextField Tx1,Tx2,Tx3;
		bankOpt.setLayout(g1);

		CA = new Button ("Create Account");
		D = new Button ("Deposit");
		W = new Button ("Withdraw");
	
		
		bankOpt.add(CA);
		bankOpt.add(D);
		bankOpt.add(W);
		window.add(bankOpt, BorderLayout.CENTER);
		
		window.setSize(400,400);
		window.setVisible(true);
		
		CA.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Frame windowCA = new Frame("Create Account Page");
				TextField T1,T2,T3;
				Label l1,l2,l3;
				Button bOk;
				Panel accountPage = new Panel();
				GridLayout g2 = new GridLayout(3,2);
				accountPage.setLayout(g2);
				
				T1 = new TextField();
				T2 = new TextField();
				T3 = new TextField();
				l1 = new Label("Name");
				l2 = new Label("Address");
				l3 = new Label("Account Number");
				bOk = new Button("OK");
/*				Tx1 = T1;
				bOk.addActionListener(new ActionListener(){
					
					
					public void actionPerformed(ActionEvent e) {
						BankMethods bm = new BankMethods();
						bm.createAccount(Tx1.getText(), Tx2.getText());
						
					}
					
				});*/
				
				accountPage.add(l1);
				accountPage.add(T1);
				accountPage.add(l2);
				accountPage.add(T2);
				accountPage.add(l3);
				accountPage.add(T3);
				windowCA.add(accountPage, BorderLayout.CENTER);
				windowCA.add(bOk, BorderLayout.SOUTH);
				
				
				windowCA.setSize(400,400);
				windowCA.setVisible(true);
				
			}
		});
		
		D.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Frame windowD = new Frame("Create Account Page");
				TextField T1,T2,T3,T4,T5;
				Label l1,l2,l3,l4,l5;
				Button bOk,b1;
				Panel accountPage = new Panel();
				Panel accountPage1 = new Panel();
				FlowLayout fl1 = new FlowLayout();
				GridLayout g2 = new GridLayout(5,2);
				accountPage1.setLayout(fl1);
				accountPage.setLayout(g2);
				
				T1 = new TextField();
				T2 = new TextField();
				T3 = new TextField();
				T4 = new TextField();
				T5 = new TextField();
				l1 = new Label("Name");
				l2 = new Label("Address");
				l3 = new Label("Balance");
				l4 = new Label("Deposit Amount");
				l5 = new Label("Enter Account Number");
				bOk = new Button("Submit");
				b1= new Button("Submit");
				
				accountPage1.add(l5);
				accountPage1.add(T5);
				accountPage1.add(b1);
				
				accountPage.add(l1);
				accountPage.add(T1);
				accountPage.add(l2);
				accountPage.add(T2);
				accountPage.add(l3);
				accountPage.add(T3);
				accountPage.add(l4);
				accountPage.add(T4);
				windowD.add(accountPage1, BorderLayout.NORTH);
				windowD.add(accountPage, BorderLayout.CENTER);
				windowD.add(bOk, BorderLayout.SOUTH);
				
				
				windowD.setSize(400,400);
				windowD.setVisible(true);
				
			}
		});
		
		W.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Frame windowW = new Frame("Create Account Page");
				TextField T1,T2,T3,T4,T5;
				Label l1,l2,l3,l4,l5;
				Button bOk,b1;
				Panel accountPage = new Panel();
				Panel accountPage1 = new Panel();
				FlowLayout fl1 = new FlowLayout();
				GridLayout g2 = new GridLayout(5,2);
				accountPage.setLayout(g2);
				accountPage1.setLayout(fl1);
				
				T1 = new TextField();
				T2 = new TextField();
				T3 = new TextField();
				T4 = new TextField();
				T5 = new TextField();
				l1 = new Label("Name");
				l2 = new Label("Address");
				l3 = new Label("Balance");
				l4 = new Label("Withdraw Amount");
				l5 = new Label("Enter Account Number");
				bOk = new Button("Submit");
				b1 = new Button("Submit");
				
				accountPage1.add(l5);
				accountPage1.add(T5);
				accountPage1.add(b1);
				
				accountPage.add(l1);
				accountPage.add(T1);
				accountPage.add(l2);
				accountPage.add(T2);
				accountPage.add(l3);
				accountPage.add(T3);
				accountPage.add(l4);
				accountPage.add(T4);
				windowW.add(accountPage1, BorderLayout.NORTH);
				windowW.add(accountPage, BorderLayout.CENTER);
				windowW.add(bOk, BorderLayout.SOUTH);
				
				
				windowW.setSize(400,400);
				windowW.setVisible(true);
				
			}
		});

		
		
		
	}

}
