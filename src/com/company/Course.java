package com.company;

import java.util.ArrayList;

public class Course {
    private String title;
    private String description;
    private int capacity;
    private String code;
    private ArrayList<Student> enroll = new ArrayList<Student>();

    public Course(String title, String desc, int cap, String code){
        this.title = title;
        this.description = desc;
        this.capacity = cap;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void enroll(Student student) {
        if(student.getRegistered()==true){
        if(student.equals(null)){
            System.out.println("Student doesnt exist");
        }
        else if(enroll.contains(student)){
            System.out.println("The Student is already Registered");
        }
        else if(enroll.size()<(capacity+1) ){
            enroll.add(student);
            System.out.println(student.getFirstName() + " "+ student.getLastName() + " has been enrolled");
            setCapacity(getCapacity()-1);
            student.courses(this);
        }
        else{
            System.out.println(student.getFullname()+ " could not be enrolled.");
            System.out.println("Reason: Class has reached capacity");

        }
        }
        else{
            System.out.println("Student needs to be registered first.");
        }
    }

    public void Roster(){
        System.out.println("Following is a list of students in the class: \n");
        for(int i = 0; i< enroll.size(); i++){
            System.out.println(enroll.get(i).getFullname());
        }
    }
}
