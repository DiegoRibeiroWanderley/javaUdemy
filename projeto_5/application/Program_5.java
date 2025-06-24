package projeto_5.application;

import projeto_5.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Student name: ");
        student.name = sc.nextLine();
        System.out.print("Grade 1: ");
        student.grade_1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        student.grade_2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        student.grade_3 = sc.nextDouble();

        System.out.println();
        System.out.println(student.finalResult());

        sc.close();
    }
}
