
package Q2;

import Q1.UndergradStudent;
import Q1.GradStudent;
import java.util.Scanner;

public class PSUStudentExceptionTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        try {
            UndergradStudent u = new UndergradStudent(age, gpa);
            GradStudent g = new GradStudent(age, gpa);

            System.out.println("Both students created successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
