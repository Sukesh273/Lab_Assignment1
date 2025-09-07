// Task 3: Main Driver Class 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum number of students: ");
        int size = sc.nextInt();

        StudentManagementSystem sms = new StudentManagementSystem(size);

        int choice;
        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sms.addStudent();
                    break;
                case 2:
                    sms.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}