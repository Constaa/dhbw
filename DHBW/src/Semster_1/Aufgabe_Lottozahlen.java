package Semster_1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aufgabe_Lottozahlen extends JFrame {

	Lottozahlen_Steuerung dieSteuerung;
	JPanel cP;
	JPanel jPEingabe;
	JPanel jPButton;
	JPanel jPGewinn;
	JLabel jLZahl1;
	JLabel jLZahl2;
	JLabel jLZahl3;
	JLabel jLZahl4;
	JLabel jLZahl5;
	JLabel jLZahl6;
	JLabel jLGZahl1;
	JLabel jLGZahl2;
	JLabel jLGZahl3;
	JLabel jLGZahl4;
	JLabel jLGZahl5;
	JLabel jLGZahl6;
	JLabel jLDeineZahlen;
	JLabel jLGezogeneZahlen;
	JLabel jLGewinn;
	JTextField jTZahl1;
	JTextField jTZahl2;
	JTextField jTZahl3;
	JTextField jTZahl4;
	JTextField jTZahl5;
	JTextField jTZahl6;
	JButton jBConfirm;
	
	public Aufgabe_Lottozahlen(Lottozahlen_Steuerung steuerung) {
	cP = new JPanel(new BorderLayout());
	jPEingabe = new JPanel(new GridLayout(2,7));
	jPButton = new JPanel(new FlowLayout());
	jPGewinn = new JPanel(new FlowLayout());
	jLZahl1 = new JLabel("1. Zahl");
	jLZahl2 = new JLabel("2. Zahl");
	jLZahl3 = new JLabel("3. Zahl");
	jLZahl4 = new JLabel("4. Zahl");
	jLZahl5 = new JLabel("5. Zahl");
	jLZahl6 = new JLabel("6. Zahl");
	jLGZahl1 = new JLabel();
	jLGZahl2 = new JLabel();
	jLGZahl3 = new JLabel();
	jLGZahl4 = new JLabel();
	jLGZahl5 = new JLabel();
	jLGZahl6 = new JLabel();
	jLDeineZahlen = new JLabel("Deine Zahlen: ");
	jLGezogeneZahlen = new JLabel("Gezogene Zahlen: ");
	jLGewinn = new JLabel("test");
	jTZahl1 = new JTextField();
	jTZahl2 = new JTextField();
	jTZahl3 = new JTextField();
	jTZahl4 = new JTextField();
	jTZahl5 = new JTextField();
	jTZahl6 = new JTextField();
	jBConfirm = new JButton("Confirm");
	
	cP.add(jPEingabe, BorderLayout.CENTER);
	cP.add(jPButton, BorderLayout.EAST);
	cP.add(jPGewinn, BorderLayout.SOUTH);
	
	jPEingabe.add(jLDeineZahlen);
	jPEingabe.add(jTZahl1);
	jPEingabe.add(jTZahl2);
	jPEingabe.add(jTZahl3);
	jPEingabe.add(jTZahl4);
	jPEingabe.add(jTZahl5);
	jPEingabe.add(jTZahl6);
	jPEingabe.add(jLGezogeneZahlen);
	jPEingabe.add(jLGZahl1);
	jPEingabe.add(jLGZahl2);
	jPEingabe.add(jLGZahl3);
	jPEingabe.add(jLGZahl4);
	jPEingabe.add(jLGZahl5);
	jPEingabe.add(jLGZahl6);
	jPButton.add(jBConfirm);
	jPGewinn.add(jLGewinn);
	
	setContentPane(cP);
	setVisible(true);
	pack();
	setTitle("Lotto");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	jTZahl1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
jTZahl2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
jTZahl3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
jTZahl4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
jTZahl5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
jTZahl6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
	}

}
