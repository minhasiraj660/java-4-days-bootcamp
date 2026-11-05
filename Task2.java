package Day1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for registering the event.");
        } else {
            System.out.println("You are not eligible for registering the event.");
        }

        sc.close();
    }
}
