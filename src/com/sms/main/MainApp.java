package com.sms.main;

import java.sql.Date;
import java.util.Scanner;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n1.Add 2.Update 3.Delete 4.View 5.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    System.out.print("DOB (yyyy-mm-dd): ");
                    Date dob = Date.valueOf(sc.nextLine());

                    System.out.print("Gender: ");
                    String gender = sc.nextLine();

                    dao.addStudent(new Student(name, email, phone, course, dob, gender));
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("1.Update Course  2.Update Email  3.Update Phone");
                    int updateChoice = sc.nextInt();
                    sc.nextLine();

                    if (updateChoice == 1) {
                        System.out.print("New Course: ");
                        String newCourse = sc.nextLine();
                        dao.updateCourse(id, newCourse);

                    } else if (updateChoice == 2) {
                        System.out.print("New Email: ");
                        String newEmail = sc.nextLine();
                        dao.updateEmail(id, newEmail);

                    } else if (updateChoice == 3) {
                        System.out.print("New Phone: ");
                        String newPhone = sc.nextLine();
                        dao.updatePhone(id, newPhone);

                    } else {
                        System.out.println("Invalid Update Option");
                    }
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int deleteId = sc.nextInt();
                    dao.deleteStudent(deleteId);
                    break;

                case 4:
                    dao.viewStudents();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
