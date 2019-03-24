package main;

import java.util.ArrayList;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
	private static ArrayList <University> universityList = new ArrayList <University> ();
	private static ArrayList <Internship> internshipList = new ArrayList <Internship> ();
	static final Knowledge KNOWLEDGE_MIDDLE_LEVEL = new Knowledge (2);
	static Internship internship;
    public static void main(String[] args) {
    	
    	universityList.add(new University("CH.U.I.", "Andrew Kostenko", 4));
    	
    	universityList.add(new University("MyUniversity", "Julia Veselkina", 1));
    	universityList.add(new University("MyUniversity", "Anna Veselkina", 3));
    	universityList.add(new University("MyUniversity", "Julia Perechrest", 4));
    	
    	universityList.add(new University("LPNU", "Maria Perechrest", 3));
    	universityList.add(new University("LPNU", "Anna Perechrest", 5));
    	
    	for (University u: universityList) {
    		if (internshipList.size() != 0) {
    			if (internshipList.get(internshipList.size() - 1).getName() != u.getName()) {
    				internship = new Internship (u.getName());
    			}
    		} else {
    			internship = new Internship (u.getName());
    		}
    		
   			for (Student s: u.getStudentList()) {
    			if (u.getKnowledge() > KNOWLEDGE_MIDDLE_LEVEL.getKnowledge() ) {
    				internship.setStudent(s);
    			}
    		}

   			if (internship.getStudents().size() != 0) {
   				if (internshipList.size() != 0) {
   	    			if (internshipList.get(internshipList.size() - 1).getName() != u.getName()) {
   	    				internshipList.add(internship);
   	    			}
   	    		} else {
   	    			internshipList.add(internship);
   	    		}
   			}
    	}
    	
    	System.out.println("List of internship's students:");
    	
    	
    	for (Internship i: internshipList) {
    		if (i.getStudents().size() != 0) {
    			System.out.println();
    			System.out.print(i.getName() + ":\n");
    		}
    		for (Student s: i.getStudents()) {
    			System.out.print(s.getName() + ", " + s.getKnowledge() + 
    					" (" + s.getKnowledgeString() + ")" + "\n");
    		}
    	}
    }
}