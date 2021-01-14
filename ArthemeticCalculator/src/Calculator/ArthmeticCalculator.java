package Calculator;
import java.util.Scanner;
          public class ArthmeticCalculator {
          public static void main(String[] args) {
	      double a;
	      double b;
	      double sol;
	      char  k;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      a = sc.nextDouble();
	      b = sc.nextDouble();
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      k = sc.next().charAt(0);
	      switch(k) {
	         case '+': sol = a + b;
	            break;
	         case '-': sol = a - b;
	            break;
	         case '*': sol = a* b;
	            break;
	         case '/': sol = a / b;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      System.out.printf(a + " " + k + " " + b + " = " + sol);
	   }
	}