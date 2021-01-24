package edu.isu.cs.cs2263;
import java.util.ArrayList;
import java.util.*;

public class Student {
    //Local variables
    private String firstName;
    private String lastName;
    private ArrayList<Course> courseList= new ArrayList<>();

    //constructors
    public Student () {}
    public Student (String fN, String lN) {
        firstName=fN;
        lastName=lN;
    }

    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Course> getCourseList(){
        return courseList;
    }
    public void setCourseList(ArrayList<Course> courses) {
        courseList=courses;
    }

    //methods

    @Override
    //we will need the courses seperate from the courses for the GUI
    public String toString() {
        return firstName + " " + lastName;
    }
    //add and remove individual courses
    public boolean addCourse(Course c) {
        return courseList.add(c);
    }
    public boolean removeCourse(Course c){
        return courseList.remove(c);
    }
}
