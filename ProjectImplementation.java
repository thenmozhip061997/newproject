package miniproject;

import java.util.ArrayList;
import java.util.List;

public class ProjectImplementation {

	public static void main(String[] args) {
		List<Subject> subjectlistStudent1=new ArrayList<Subject>();
		Subject s1physics=new Subject(1,"thenmozhi",40);
		Subject s1chemistry=new Subject(2,"thenmozhi",30);
		Subject s1maths=new Subject(3,"thenmozhi",20);
		
		subjectlistStudent1.add(s1physics);
		subjectlistStudent1.add(s1chemistry);
		subjectlistStudent1.add(s1maths);
		
		List<Subject> subjectlistStudent2=new ArrayList<Subject>();
		Subject s2physics=new Subject(1,"janani",60);
		Subject s2chemistry=new Subject(2,"janani",80);
		Subject s2maths=new Subject(3,"janani",90);
		
		subjectlistStudent2.add(s2physics);
		subjectlistStudent2.add(s2chemistry);
		subjectlistStudent2.add(s2maths);
		
		List<Subject> subjectlistStudent3=new ArrayList<Subject>();
		Subject s3physics=new Subject(1,"soundhar",90);
		Subject s3chemistry=new Subject(2,"soundhar",70);
		Subject s3maths=new Subject(3,"soundhar",50);
		
		subjectlistStudent3.add(s3physics);
		subjectlistStudent3.add(s3chemistry);
		subjectlistStudent3.add(s3maths);
		
		List<Student> noofstudents=new ArrayList<Student>();
		Student s1=new Student(1,"thenmozhi",10,subjectlistStudent1);
		Student s2=new Student(2,"janani",10,subjectlistStudent2);
		Student s3=new Student(3,"soundhar",10,subjectlistStudent3);
		
		noofstudents.add(s1);
		noofstudents.add(s2);
		noofstudents.add(s3);
		
		List<Student> studentlist=passedstudent(noofstudents,50);
		for(Student student:studentlist) {
			System.out.println("Name= "+student.getName()+" ,idno= "+student.getId()+" ,totalmark= "+student.getTotal()+" ,percentage= "+student.getPercentage());
		}
		

	}
	public static List<Student> passedstudent(List<Student> studentList,int passedmark){
	List<Student> passedList=new ArrayList<Student>();
	for(int i=0;i< studentList.size();i++) {
		Student student=studentList.get(i);
		List<Subject>subjectlist=student.getSubjectlist();
		int totalmark=0;
		boolean ispassed=true;
		for(Subject subject:subjectlist) {
			if(subject.getMarks()<passedmark) {
				ispassed=false;
				break;
				
			}
			totalmark=totalmark+subject.getMarks();
				
		}if(ispassed) {
			student.setTotal(totalmark);
			student.setPercentage(totalmark/(float)3);
			passedList.add(student);
			
		}
		
	}
	return passedList;
	}
}
