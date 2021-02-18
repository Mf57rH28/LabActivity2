//This java code contains the following :
// 4 methods (without the main method)
//The method must be applying the concept of overloading methods
//Each method must apply either of these operations (+,/,*,-)
//2 methods must return results , and the other 2 must not return anything
//By using Scanner to enter the values to the method 
//-------------------------------------------------------------------------------
//Name:Mufarreh Salem Alshihrey 
//Course Name: 212CSS-4 Object Oriented Programming
//Section: 32
//Academic ID: 441102003
//Instructor: Ibrahim Hassan Ali Alyami
//Date: February 18,2021  - 6/7/1442
//Subject: Lab Activity 

import java.util.Scanner;

public class LabActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a Scanner object to receive inputs from the keyboard

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int firstNumber = input.nextInt();

		System.out.println("Enter the second number : ");
		int secondNumber = input.nextInt();

		Operation(firstNumber, secondNumber);
		

	}

	// Addition
	static int Operation(int firstNumber, int secondNumber) {
		System.out.println("Addition : first Number + secondNumber = " + (firstNumber + secondNumber));
	return(firstNumber + secondNumber);
	}

	// Substratcion
	static double Operation(double firstNumber, double secondNumber) {
		System.out.println("Substratcion : first Number - secondNumber = " + (firstNumber - secondNumber));
	return(firstNumber - secondNumber);	
	}

	// Multiplication
	static void Operation(double firstNumber, int secondNumber) {
		System.out.println("Multiplication : first Number * secondNumber = " + (firstNumber * secondNumber));
	}

	// Division
	static void Operation(int firstNumber, double secondNumber) {
		System.out.println("Division : first Number / secondNumber = " + (firstNumber / secondNumber));
	}

}