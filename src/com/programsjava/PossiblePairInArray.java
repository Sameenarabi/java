package com.programsjava;

public class PossiblePairInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int sum=10;
		
		int low=0; //low value of index will be taken
		int high= a.length-1;  //high value of index will be taken
		
		while(low<high) {
			if(a[low] + a[high] >sum) {
				high--;
			}
			else if(a[low] + a[high] < sum) {
				low++;
			}
			else if(a[low] + a[high] == sum) {
				System.out.println("pair (" + a[low] + "," + a[high] + ")");
				low++;
				high--;
			}
		}
		
		
		
	}
}
