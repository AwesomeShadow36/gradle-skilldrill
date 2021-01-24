package edu.isu.cs.cs2263;

public class Course {
    //local variables
    public int number;
    public String subject;
    public String title;

    //constructors
    public Course (){}
    public Course (int num, String subj, String titl) {
        number=num;
        subject=subj;
        title=titl;
    }

    //getters and setters

    public int getNumber() {
        return number;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Methods

    @Override
    public String toString() {
        //subject is the area of school such as Computer Science or Math
        // title is the actual name of the class
        return "Course: " + subject + " " + number + " " + title + "\n";
    }
}
