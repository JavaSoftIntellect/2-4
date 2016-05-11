package odd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner reader= new Scanner(System.in);

	System.out.print("Enter number:");

	int theNumber = reader.nextInt();

	if (theNumber % 2 == 0){
	System.out.println("\n The number " + theNumber + " is even!");
	}
	else
	{
	System.out.println("\n The number " + theNumber + " is odd!");
	}
	}
	}