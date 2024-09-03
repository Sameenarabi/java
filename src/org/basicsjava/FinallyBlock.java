package org.basicsjava;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		int a = 15;
		int b = 0;
		int c = 10;
		
		//System.out.println(a/b);
		//System.out.println(c/b);
		
		try {
			System.out.println(a/b);
			}
		
		catch(ArithmeticException e) {
			System.out.println("SAM");
		}
		
		finally {
			System.out.println("EXCEPTION HANDLED 1");
		}
		
		
		
		
		try {
			System.out.println(c/b);
		}
		catch(ArithmeticException e) {
			System.out.println("HANA");
		}
		finally {
			System.out.println("EXCEPTION HANDLED 2");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
