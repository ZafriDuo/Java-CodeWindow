package studentAlgoritmos;
import java.awt.*;

import javax.swing.*;

public class StudentView extends JFrame {
	
	public StudentView(Student objekt1) {
		
		JFrame myFrame = new JFrame("Studentenkonto");
		JLabel eingabe = new JLabel("Wie viele Studenten möchten Sie eintragen?");
		
		JTextField fieldAnzahl = new JTextField(10);
		
		JButton buttonBest = new JButton("Bestätigung");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panelColour = new JPanel();
		
		myFrame.add(panelColour);
		panelColour.setBackground(Color.black);
		
		myFrame.add(panel1, BorderLayout.NORTH);
		myFrame.add(panel2, BorderLayout.SOUTH);
		
		panel1.setLayout(new FlowLayout());
		panel1.add(eingabe);
		panel1.add(fieldAnzahl);
		
		panel2.add(buttonBest);
		panel2.setBackground(Color.black);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(600, 400, 450, 120);
		
		ButtonController1 ref = new ButtonController1(fieldAnzahl, myFrame, objekt1);
		buttonBest.addActionListener(ref);
	}

}
