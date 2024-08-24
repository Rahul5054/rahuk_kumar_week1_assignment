
import java.util.Scanner;

//WAP to perform basic arithmeticoperations (addition, subtraction, multiplication,division).

public class ArihmeticOperation{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First number:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Second Number:- ");
        int num2=sc.nextInt();


        //Addition
        int c=num1+num2;
        System.out.println("Sum of given number is:- "+c);

        //subtraction

        int d=num1-num2;

        System.out.println("subtraction of given number is :- "+d);

       //Multiplication

       int e=num1*num2;
       System.out.println("Multiplication of given number is :- "+e);


       //Division

       int f=num1/num2;

       System.out.println("Division of given number is :- "+f);

    }
    


}