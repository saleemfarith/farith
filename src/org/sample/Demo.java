package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> a1=new ArrayList<Integer>();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(30);
		a.add(40);
		int i = a.lastIndexOf(30);
		
		System.out.println(i);
		System.out.println(a);
		a1.addAll(a);
		System.out.println(a1);
		
	}

}
