package com.gong.study;

public class ArraySortDemo{
	public static void main(String[] args){
		int[] arr = {34,79,55,28,88,66};
		System.out.println("排序之前");
		print(arr);
		//choose(arr);
		System.out.println("------------------");
		bubbleSort(arr);
		System.out.println("排序之后");
		print(arr);
	}
	
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j]	= arr[j+1];
					arr[j+1] = temp;
				}
			}
			print(arr);
		}
	}
	
	public static void choose(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void print(int[] arr){
		for(int a : arr){
			System.out.print(a+"\t");
		}
		System.out.println();
	}
}







