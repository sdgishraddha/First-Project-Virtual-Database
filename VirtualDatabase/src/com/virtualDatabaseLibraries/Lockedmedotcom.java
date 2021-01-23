package com.virtualDatabaseLibraries;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
public class Lockedmedotcom {
public static int option;
public static final String rootDir = "E:\\Lockedme.com\\Products";
public static String fName;


	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Welcome to Locked.com\nAuthor: Shraddha Singh version :1.0\n\n");// Application, Author and version name.
		System.out.println("Press 1 to see the list of products.\n");
		System.out.println("Press 2 to update product list.\n");
		System.out.println("Press 9 to close Application\n");
		System.out.println("Please enter the value as per your choice\n");
		option = input.nextInt();
		while (option != 9) {
			if (option == 1) {
				ListOfFiles listoffiles = new ListOfFiles();
				listoffiles.FileList();
				
				
			}
			else if(option == 2){
				fileOperationScreen fileOps = new fileOperationScreen();
				fileOps.fileOperation();
				
			}
			else {
				System.out.println("Please choose the correct options");
				System.out.println("\nPress 1 to see the list of products.\nPress 2 to update product list\nPress 9 to close Application\\n");
				option = input.nextInt();
			}
			
		}
		System.exit(0);
		input.close();
		
	}
	
    public static void optionNavigator(int a) throws InputMismatchException, IOException{
    	Scanner input = new Scanner(System.in);
    	while (a !=8 || a !=9) {
			
    		
 		   if (a == 8) {
 			   Lockedmedotcom.main(null);
 		   }
 		   else if (a == 9) {
 			   System.exit(0);
 		   }
 		   else {
 			   System.out.println("Please choose correct value from the list\n");
 			   System.out.println("Please 8 for the Welcome Screen\nPress 9 to say Good Bye\n");
 			   a = input.nextInt();
 		   }
    	}
    	input.close();
    }

}
