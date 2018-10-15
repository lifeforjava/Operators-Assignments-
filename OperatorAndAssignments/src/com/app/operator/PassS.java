package com.app.operator;

public class PassS {

	public static void main(String[] args) {
		PassS p = new PassS();
		p.start();
	}

	void start() {
		String s1 = "slip";
		System.out.println(s1);
		String s2 = fix(s1);
		System.out.println(s1 + " " + s2);
	}

	String fix(String s1) {
		s1 = s1 + "stream";
		System.out.println(s1 + " ");
		System.out.println("----------------");
		String s3 = s1 + "stream";
		System.out.println("s3 : " + s3 + " ");
		return s1 ;
	}
}
