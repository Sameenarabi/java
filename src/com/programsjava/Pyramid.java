package com.programsjava;

public class Pyramid {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 6;
		int row = 6;
		
		for(a=0; a<row; a++) {
			for(b=row-a; b>1; b--) {
				System.out.print(" ");
			}
			for(b=0; b<=a; b++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
	
		
	}
}
