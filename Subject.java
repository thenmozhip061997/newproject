package miniproject;

public class Subject {
	private int id;
	private String name;
	private int marks;

	public Subject() {
		
	}
	public Subject(int id,String name, int marks) {
		this.setId(id);
		this.setName(name);
		this.setMarks(marks);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
