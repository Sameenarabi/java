package com.programsjava;

import java.util.Scanner;

public class If_BloodProgram {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER YOUR BLOOD GROUP(A+,B+,O+,AB+,A-,B-,O-,AB-):   ");
		String blood = s.next();
		
		if(blood.equals("A+")) {
			System.out.println("You can receive blood from A+,A-,O+,O-");	
		}
		else if(blood.equals("A-")) {
			System.out.println("You can receive blood from A-,O-");	
		}
		else if(blood.equals("B+")) {
			System.out.println("You can receive blood from B+,B-,O+,O-");	
		}
		else if(blood.equals("B-")) {
			System.out.println("You can receive blood from B-,O-");	
		}
		else if(blood.equals("O+")) {
			System.out.println("You can receive blood from O+,O-");
			System.out.println("YOU ARE UNIVERSAL DONORS");
		}
		else if(blood.equals("O-")) {
			System.out.println("You can receive blood from O-");	
		}
		else if(blood.equals("AB+")) {
			System.out.println("You can receive blood from EVERYONE");
			System.out.println("YOU ARE UNIVERSAL ACCEPTORS");
		}
		else if(blood.equals("AB-")) {
			System.out.println("You can receive blood from AB-,A-,B-,O-");	
		}
		else {
			System.out.println("INCORRECT BLOOD GROUP");
		}
	}
	
	
	
	

}
