// Task 1: Student Class 

import java.util.Scanner;

class Student {
    String rollNo;
    String name;
    String course;
    double marks;
    String grade;

    Scanner sc = new Scanner(System.in);

    public void inputStudent() {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        sc.nextLine();

        calculateGrade();
    }

    public void calculateGrade() {
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public void displayStudent() {
        System.out.println("-----------------------------------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + grade);
        System.out.println("-----------------------------------");
    }
}