package studentAlgoritmos;

public class Student {
	
	private String name;
	private int ects;
	
	public Student(String name, int ects) {
		this.name = name;
		this.ects = ects;
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}
	
	
	
	
}
