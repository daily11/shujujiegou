package com.swust;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int a = 123;
		sop(a&(0x7fffffff));
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}

}

class A {
	public String name = "chen";
}

class B extends A {

	public void run() {
		System.out.println(name);
	}
}