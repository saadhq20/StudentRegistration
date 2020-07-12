package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student saad = new Student("Saad", "Haq", 30, "saadhq20@gmail.com");
        Student taha = new Student("Taha", "hamid", 30, "saadhq20@gmail.com");
        Student anwar = new Student("anwar", "pathan", 30, "saadhq20@gmail.com");
        Course MMAE = new Course("MMAE", "material science", 2,"1234");
        System.out.println(MMAE.getCapacity());
        MMAE.enroll(saad);
        System.out.println(MMAE.getCapacity());
        saad.register();
        MMAE.enroll(saad);
        taha.register();
        MMAE.enroll(taha);
        anwar.register();
        MMAE.enroll(anwar);
        System.out.println(MMAE.getCapacity());
        //saad.printAll();
        MMAE.Roster();

    }
}
