package com.song.exam;

public class ArrayTest {
	public static void main(String[] args) {
	int[] array= {4,5,6,8,7};	
	String[] array3=new String[5];
	int[] array2= new int[10];
		
 		
	printArrayValue(array2);
	//prnitArrayValue(array3);
	}
	
	public static  void printArrayValue(String[] array) {
		for(String str:array) {
			System.out.println(str);
		}
	}
	
	
	public static  int printArrayValue(int[] array) {
		
	
		int sum=0;
	/*			
	   for(int i=0;i<array.length;i++)
	   {
		   sum=sum+array[i];
	   }*/
		for(int asd:array) {
			sum+=asd;
			System.out.println(sum);
		}
		System.out.printf("%d",sum);
		
		return 0;
	}
	
	

}
