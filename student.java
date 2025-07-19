import java.util.*;

public class student {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your roll number:");
        int rollNumber = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter your Branch:");
        String branch = sc.nextLine();

        System.out.println("Enter your section:");
        String section = sc.nextLine();

        System.out.println("STUDENT INFORMATION");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
    }
}
