package person;

import person.consciousness.Knowledge;

public class Student extends Knowledge{
	private Knowledge knowledge;
	private String name;
	
    public Student(String name, int level) {
    	super(level);
    	this.name = name;
    }

    public Knowledge getStudentKnowledge () {
    	return knowledge;
    }
    
    public String getName () {
    	return name;
    }
}