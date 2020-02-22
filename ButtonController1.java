package studentAlgoritmos;
import java.awt.event.*;
import javax.swing.*;

public class ButtonController1 implements ActionListener {
	
	private JTextField eingabeAnzahl;
	private JFrame prueba;
	private Student s;
	
	
	public ButtonController1(JTextField eingabeAnzahl, JFrame prueba, Student s) {
		
		this.eingabeAnzahl=eingabeAnzahl;
		this.prueba=prueba;
		this.s=s;
	}
	
	public ButtonController1() {
		
	}
	
	int eingabeArray;
	public void actionPerformed(ActionEvent action) {
		
		if(action.getActionCommand().equals("Bestätigung")) {
			
			ViewStudentDaten window = new ViewStudentDaten(s);
			
			prueba.setVisible(false);
			
			}
		
		eingabeArray = Integer.parseInt(eingabeAnzahl.getText());
	}
	
	public int getAnzahl(){
		
		return eingabeArray;
	}
}
