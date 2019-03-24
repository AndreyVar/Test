package institution;

import java.util.ArrayList;

import person.Student;

public class University extends Student{
	private String name;
	private Student student;
	private ArrayList <Student> studentList = new ArrayList <Student> ();
	
    public University(String name, String studentName, int levelKnowlage) {
    	super (studentName, levelKnowlage);
    	this.student = new Student (studentName, levelKnowlage);
    	this.name = name;
    	addStudent(this.student);
    }
    
    public void addStudent(Student student) {
    	studentList.add(student);
    }

    public String getName () {
    	return name;
    }
    
    public ArrayList<Student> getStudentList () {
    	return studentList;
    }
}