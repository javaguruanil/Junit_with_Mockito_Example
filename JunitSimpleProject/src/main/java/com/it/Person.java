package com.it;

public class Person {
	private int age;

	public int getAge() {
		System.out.println("GETAge");
		return age;
	}

	public void setAge(int age) {
		System.out.println("SETAge");
		this.age = age;
	}

}
