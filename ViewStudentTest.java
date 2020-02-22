package studentAlgoritmos;

public class ViewStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objekt = new Student();
		StudentView window1 = new StudentView(objekt);
		ButtonController1 b = new ButtonController1();
		Student[] s= new Student[b.getAnzahl()];
		System.out.println(b.getAnzahl());
		
		

	}

}
