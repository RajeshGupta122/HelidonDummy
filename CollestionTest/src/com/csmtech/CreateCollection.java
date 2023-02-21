package com.csmtech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class CreateCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> al = new ArrayList<>();
         al.add("Aman");
         al.add("Suman");
         al.add("Ramam");
         al.add("Mohit");
         al.add("Rohit");
         al.add("Mohan");
//         System.out.println(al);
//         for (String string : al) {
//        	 //System.out.println(string);
//			
//		}
//         al.remove(2);
//        // System.out.println(al);
//        Iterator<String> itr=al.iterator();
//        while(itr.hasNext()) {
//        	//System.out.println(itr.next());
//        }
//       ListIterator<String> str1=al.listIterator(3);
//       while(str1.hasPrevious())
//    	   System.out.println(str1.previous()+" value");
         
         List<Integer> vector = new Stack<Integer>();
         vector.add(12);
         vector.add(13);
         vector.add(14);
         System.out.println(vector);
         vector.addAll(0, vector);
         System.out.println(vector);
         
	}

}
