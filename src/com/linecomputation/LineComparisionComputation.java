package com.linecomputation;
import java.util.Scanner;

public class LineComparisionComputation {
	public static int lineLengthCal() {
		int x1,y1,x2,y2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the co-ordinates of line!!: x1,x2,x3,x4"); 
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		int lineLength = (int)Math.sqrt(Math.pow((x1-x2), 2) 
				+ Math.pow((y1-y2), 2) );
		return lineLength;
		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line\r\n"
				+ "Comparison Computation\r\n"
				+ "Program on Master Branch");
		int lineLength = lineLengthCal();
		System.out.println("The length of line is: "+lineLength);
		

	}

}
