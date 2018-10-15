package com.app.operator;

public class Test {

	public static void main(String[] args) {
		Test p = new Test();
		p.start();

	}

	void start() {
		boolean b1 = false;
		boolean b2 = fix(b1);
		System.out.println(b2 + " " + b1);
		long[] a1 = { 3, 4, 5 };
		System.out.println(a1[0] + a1[1] + a1[2]);
		System.out.println("a1[0] + a1[1] + a1[2] : " + a1[0] + a1[1] + a1[2]);
		// The reference variable a2 refers to the same array object.
		long[] a2 = fix1(a1);
		System.out.println(a1[0] + a1[1] + a1[2]);
		System.out.println(a2[0] + a2[1] + a2[2]);
		System.out.println("a2[0] + a2[1] + a2[2]: " + a2[0] + a2[1] + a2[2]);
	}

	long[] fix1(long[] a3) {
		// The reference variables a1 and a3 refer to the same long array
		// object.
		// When the [1] element is updated in the fix() method, it is updating
		// the array referred to by a1.
		a3[1] = 7;
		return a3;
	}

	boolean fix(boolean b1) {
	
		b1 = true;
		return b1;	
	}

}
