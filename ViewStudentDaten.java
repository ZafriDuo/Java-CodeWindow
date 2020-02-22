package studentAlgoritmos;
import java.awt.*;
import javax.swing.*;

public class ViewStudentDaten extends JFrame {
	
	public ViewStudentDaten(Student s) {
	
		JFrame myFrame = new JFrame("Studentendaten");
		JLabel name = new JLabel("Name: ");
		JLabel ects = new JLabel("ECTS: ");
		
		JTextField fieldName = new JTextField(10);
		JTextField fieldEcts = new JTextField(10);
		
		JButton buttonBest = new JButton("Bestätigen");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Image myIcon = myScreen.getImage("src/studentAlgoritmos/zorro.png");
		setIconImage(myIcon);
		
		myFrame.add(panel1, BorderLayout.NORTH);
		myFrame.add(panel2, BorderLayout.CENTER);
		myFrame.add(panel3, BorderLayout.SOUTH);
		
		panel1.setLayout(new FlowLayout());
		panel1.add(name);
		panel1.add(fieldName);
		panel1.setBackground(Color.cyan.darker());
		
		panel2.setLayout(new FlowLayout());
		panel2.add(ects);
		panel2.add(fieldEcts);
		panel2.setBackground(Color.cyan.darker());
		
		panel3.add(buttonBest);
		panel3.setBackground(Color.cyan.darker());
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(600, 400, 300, 150);
		
		ButtonController2 ref = new ButtonController2(fieldName, fieldEcts, myFrame, s);
		buttonBest.addActionListener(ref);
	
	}

}
