package com.it;

public class A {
 private C c;

 public C getC() {
	return c;
}

	public void setFoo(int foo) {
		for (int i = 1; i <= foo; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
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
