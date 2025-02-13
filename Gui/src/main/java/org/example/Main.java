import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your ID:");
        String id = scanner.nextLine();
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();
        System.out.println("Date Of Birth (YYYYMMDD):");
        String dob = scanner.nextLine();
        System.out.println("Enter Your Gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter Your Address:");
        String address = scanner.nextLine();
        System.out.println("Enter Your Contact:");
        String contact = scanner.nextLine();
        scanner.nextLine();
        //Academic Info

        System.out.println("Enter Your Enrollment Id:");
        String enrollId=scanner.nextLine();
        System.out.println("Enter Your class/grade/year:");
        String cgy=scanner.nextLine();
        System.out.println("Enter Your Course/subject:");
        String cs=scanner.nextLine();
        System.out.println("\nStudent Attendence Records:");
        String ar=scanner.nextLine();
        System.out.println("Enter Your Exam/Results:");
        String er=scanner.nextLine();
        System.out.println("Enter Your GPA:");
        double gpa=scanner.nextDouble();
        scanner.nextLine();
        //Parents Details

        System.out.println("Enter Your Mother Name:");
        String mn=scanner.nextLine();
        System.out.println("Enter Your Father Name:");
        String fn=scanner.nextLine();
        System.out.println("Enter Your Gaurdian Contact:");
        String gc=scanner.nextLine();
        System.out.println("Enter Your Student Relation With Gaurdian:");
        String sr=scanner.nextLine();
        scanner.nextLine();
        //Management details

        System.out.println("Enter Your Enrollment Date:");
        String ed=scanner.nextLine();
        System.out.println("Enter Your Tution Fee:");
        String tf=scanner.nextLine();
        System.out.println("Enter Your Scholarship Status:");
        String ss=scanner.nextLine();
        System.out.println("Enter Your Displinary Records:");
        String dr=scanner.nextLine();
        scanner.nextLine();
        //Extra-Circular Activities

        System.out.println("Enter Your Achievements:");
        String ac=scanner.nextLine();
        scanner.nextLine();
        //Library and resources


        System.out.println("Enter Your Books Issued:");
        String bi=scanner.nextLine();
        System.out.println("Enter Your Fine Details:");
        String fd=scanner.nextLine();
        scanner.nextLine();
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Enrollment Id: " + enrollId);
        System.out.println("Class/Grade/Year: " + cgy);
        System.out.println("Course/Subject: " + cs);
        System.out.println("Attendence Record: " + ar);
        System.out.println("Exam/Results: " + er);
        System.out.println("Enter your GPA: " + gpa);
        System.out.println("Mother Name: " + mn);
        System.out.println("Father Name: " + fn);
        System.out.println("Gaurdian Contact: " + gc);
        System.out.println("Student Realtion with Gaurdian: " + sr);
        System.out.println("Enrollment Date: " + ed);
        System.out.println("Tution Fee: " + tf);
        System.out.println("Scholarship Status: " + ss);
        System.out.println("Displinary Records: " + dr);
        System.out.println("Achievements: " + ac);
        System.out.println("Books Issued: " + bi);
        System.out.println("Fine Details: " + fd);
        scanner.close();


    }
}
