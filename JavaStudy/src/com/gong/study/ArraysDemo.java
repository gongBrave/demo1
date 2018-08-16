package com.gong.study;


import java.util.Arrays;

public class ArraysDemo{
	public static void main(String[] args){
		int[] arr = {34,79,55,28,88,66};
		method01(arr);
	}
	public static void method03(int[] arr){
		int[] arr2 = Arrays.copyOfRange(arr,2,4);//把数组arr下标2到3的元素复制到数组arr2
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	public static void method02(int[] arr){
		int[] arr2 = Arrays.copyOf(arr,arr.length+5);//多出来的长度用0补上
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	public static void method01(int[] arr){
		System.out.println("排序之前::");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("排序之后:");
		System.out.println(Arrays.toString(arr));
	}
}