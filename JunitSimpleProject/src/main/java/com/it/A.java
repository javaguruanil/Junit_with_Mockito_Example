package com.it;

public class A {
 private C c;
 
  public void branch_01_method1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("branch-01   ");
			}
			System.out.println();
		}
 }
 
 public C getC() {
	return c;
}

public void setC(C c) {
	this.c = c;
}

public B f1(){
	 return new B("Anil");
 }
 
 public int f2(int inp1, int inp2){
	 return 88;
 }
}
