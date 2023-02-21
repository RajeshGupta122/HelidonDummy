package com.csmtech;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CreateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> set = new TreeSet<Integer>(); 
		set.add(12);
		set.add(10);
		set.add(16);
		set.add(16);
		set.add(17);
		System.out.println(set);

	}

}
