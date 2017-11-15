package com.cap.boot;

public class SalesClass {
	int[] arr={1,2,3,4,5};
	
	public void display(){
		int sum=0;
		System.out.println("Display Method");
		for(int i=0;i<=arr.length;i++){
			System.out.println(arr[i]);
		sum+=arr[i];
		}
		System.out.println("the sum value:" +sum);
	}
		
}
