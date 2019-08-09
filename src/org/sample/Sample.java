package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(50);
		li.add(60);
		li.add(10);
		li.add(40);
		System.out.println(li);

		// copy one list to another list

		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(li);
		l1.add(200);
		l1.add(300);
		System.out.println(l1);
		
		//retaining  common valued form both list
		
		
		l1.retainAll(li);
		System.out.println(l1);
		
		
		
		//Iterating the  first list
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		
		
		
		//Enhanced for loop or foreach
		
		for(Integer x:l1) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
