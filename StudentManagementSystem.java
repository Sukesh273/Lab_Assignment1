// Task 2: Student Management System Class 

class StudentManagementSystem {
    Student[] students;
    int count;

    public StudentManagementSystem(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent() {
        if (count < students.length) {
            students[count] = new Student();
            students[count].inputStudent();
            count++;
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }

    public void displayAllStudents() {
        if (count == 0) {
            System.out.println("No student records available.");
        } else {
            System.out.println("\n===== Student Records =====");
            for (int i = 0; i < count; i++) {
                students[i].displayStudent();
            }
        }
    }
}