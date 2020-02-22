package studentAlgoritmos;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ButtonController2 implements ActionListener {
	
	private JTextField eingabeName, eingabeEcts;
	private JFrame prueba2;
	private Student s1;
	
	public ButtonController2(JTextField eingabeName, JTextField eingabeEcts, JFrame prueba2, Student s1) {
		this.eingabeName = eingabeName;
		this.eingabeEcts = eingabeEcts;
		this.prueba2 = prueba2;
		this.s1 = s1;
	}
	
	String name;
	int ects;
	
	public void actionPerformed(ActionEvent action) {
		
		if(action.getActionCommand().equals("Bestätigen")) {
			
			for(int i=0;i<eingabeArray.length;i++) {
				
				name= eingabeName.getText();
				ects= Integer.parseInt(eingabeEcts.getText());
				eingabeArray[i]= new Student(name, ects);	
			}
		}		
		ViewStudentDaten window = new ViewStudentDaten(s1);	
		
		prueba2.setVisible(false);	
		
		for(int i=0;i<eingabeArray.length;i++) {
			
			System.out.println(eingabeArray[i].getName() + " " + eingabeArray[i].getEcts());
		}		
	}
	
	
}
