package com.gong.study;

public class Util{
	
	public static int add(int a,int b){
		return a + b;
	}
	
	public static void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void swap(Data d){
		int temp = d.a;
		d.a = d.b;
		d.b = temp;
	}
}
class Data{
	public int a;
	public int b;
}
class Too{
	public static void main(String[] args){
		//鍊间紶閫�
		int c = Util.add(1,2);
		System.out.println(c);
		int a = 10;
		int b = 20;
		Util.swap(a,b);
		System.out.println("main鏂规硶涓細a="+a+",b="+b);
		Data d = new Data();
		d.a = 30;
		d.b = 40;
		Util.swap(d);
		System.out.println("main鏂规硶涓細d.a="+d.a+",d.b="+d.b);
		System.out.println(d);
	}
}







