
import java.util.Scanner;

//Implement a simple calculator using switch case statements.


public class Calculator {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
         
        
        do{  
    
        System.out.println("Enter first Number:- ");

        double number1=sc.nextDouble();

        System.out.println("Enter the Second Number:- ");

        double number2=sc.nextDouble();
        
       System.out.println("----------Choose your Arithmetic opertion--------- ");

       System.out.println("Press 1 for Addition:-");

       System.out.println("Press 2 for Subtraction:- ");

       System.out.println("Press 3 for Multiplication:-  ");

       System.out.println("Press 4 for Division:- ");

       System.out.println("Press 5 for Exit:- ");

       System.out.println("Your Arithmetic Opertions number is :- ");
       choice = sc.nextInt();

       double ans;

       switch (choice) {
           case 1: 

           ans=number1+number2;
           System.out.println("Your Answer is:- "+ans);
           break;

           case 2:
           ans=number1-number2;
             System.out.println("Your Answer is:- "+ans);
               break;
               case 3:
                   ans=number1*number2;
                   System.out.println("Your Answer is:- "+ans);
                   break;
               case 4:
               ans=number1/number2;
               System.out.println("Your Answer is:- "+ans);
                   
                   break;
                   case 5:
                   System.out.println("-----------------End program---------------------");
                       
                       break;
           default:
               System.out.println("Invalid Choice!");
               break;
       }
    }

       while(choice !=5);
       sc.close();
    }

}
