package com.programsjava;

public class LeftSideTriangle {
	
	public static void main(String[] args) {
	
		
		int row=6;
		
		for(int a=1; a<=row; a++) {
			
			for(int b=1; b<=row-a; b++) {
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}

}
