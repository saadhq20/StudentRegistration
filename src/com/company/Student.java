package com.company;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course> course = new ArrayList<Course>() ;
    private String FirstName;
    private String LastName;
    private String email;
    private int age;
    private boolean registered = false;

    public Student(String Fname, String LName, int age,String email){
        this.FirstName = Fname;
        this.LastName = LName;
        this.email = email;
        this.age    = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname(){
        return getFirstName()+" " + getLastName();
    }

    public void courses(Course courses){
        if(this.getRegistered()==true){
        if(course.equals(null)){
            System.out.println("Student doesnt exist");
        }
        else if(course.contains(courses)){
            System.out.println("The Student is already enrolled");
        }
        else{
            course.add(courses);
           // System.out.println(getFullname() + " is now enrolled in "+ courses.getTitle());
        }
        }
        else{
            System.out.println("Student needs to register first.");
        }
    }
    public boolean getRegistered(){
        return this.registered;
    }

    public boolean register(){
        if(registered==false) {
            System.out.println("Registering the student....");
            System.out.println(getFullname()+ " is now a Registered student");
            this.registered = true;
        }
        else{
            System.out.println("Student is already registered.");
        }
        return this.registered;
    }

    public void printAll(){
        if(course.size()>0){
        System.out.println(this.getFirstName()+" "+ this.getLastName()+ " is registered for the following courses: \n");
        for(int i =0; i<course.size(); i++){
            System.out.println(course.get(i).getTitle());
        }

        }
        else{
            System.out.println(getFullname()+ " isnt registered for any course yet.");
        }
    }

}
