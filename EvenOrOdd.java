//Create a program that takes user input and checks if the number is even or odd.

import java.util.Scanner;

public class EvenOrOdd{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " "+"is Even");
        } else {
            System.out.println( number+ " " +"is Odd ");
        }

        scanner.close();

    }

}