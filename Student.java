package miniproject;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private int standard;
	List<Subject>subjectlist;
	public List<Subject> getSubjectlist() {
		return subjectlist;
	}
	public void setSubjectlist(List<Subject> subjectlist) {
		this.subjectlist = subjectlist;
	}
	private int total;
	private float percentage;

	
	
	public Student() {
		
	}
	public Student(int id,String name,int standard,List<Subject> subjectlist) {
		this.setId(id);
		this.setName(name);
		this.setStandard(standard);
		this.subjectlist=subjectlist;
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
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
