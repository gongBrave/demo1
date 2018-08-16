package com.gong.study;

public class Person{
	//成员变量
	public String name;//public protected private 
	public int age;
	//static final abstract
	public void sleep(){
		System.out.println("sleep ...");
	}
}

class Test{
	public static void main(String[] args){
		//Person.sleep();
		//Person.name = null;
		Person p = null;//new Person();
		/*
		F:\大讲台\讲课\java\材料\工具\1706\day04>java Test
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Person.java:16)

		*/
		p.name = "张三";
		p.age = 60;
		p.sleep();
		System.out.println(p.name+","+p.age);
	}
}







