// Simple calculetor using java
import java .util.Scanner;
public class Calculator{
   public static void main(String[]args) {
       Scanner input = new Scanner(System.in);
       
       //Declaring variables
      
       char operator;
       Double Number1,Number2,Result;
       
       //asking the user to input the operator 
      
       System.out.println("Enter the operator(+,-,*,/):");
       operator = input .next().charAt(0);
        
       // Asking the  user  to input the numbers
       
       System.out.println("Enter the frist number:");
        Number1 =input.nextDouble();
       
        System.out.println("Enter the second number:");
        Number2 =input.nextDouble();

        switch(operator){
            //performing Adittion
        
        case '+':{
            Result = Number1+ Number2;
            System.out.println("Adition of "+Number1+"and"+ Number2+"is:"+Result);
        }
        break;
            //perfoming Subtraction
        case'-':{
            Result = Number1-Number2;
            System.out.println("Substrction of "+Number1+"and"+ Number2+"is:"+Result);
        }
        break;

        case'*':{
            Result = Number1* Number2;
            System.out.println("Multiplication of "+Number1+"and"+ Number2+"is:"+Result);
        }
        break;
        case'/':{
            Result = Number1/ Number2;
            System.out.println("Divison of "+Number1+"and"+ Number2+"is:"+Result);
        }
        break;
        //defult command
        default:{
            System.out.println("Unsupported/Invalid input");
        }
    }
       input.close();
   }
}




