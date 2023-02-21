package com.csmtech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] n= {1,2,3,4,5};
         List<int[]> asList = Arrays.asList(n);
         ArrayList<Integer> al = new ArrayList<>();
         al.add(1);
         al.add(-2);
         al.add(3);
         al.add(-4);
         Collections.sort(al);
         Collections.reverse(al);
         System.out.println(al);
         int product=1;
         for(int i=0;i<3;i++) {
        	 product=product*(al.get(i));
         }
         System.out.println(product);
         
//         for(int i=0;i<n.length;i++) {
//        	 for(int j=0;i<n.length;j++) {
//        		 if(n[i]<n[j]) {
//        			 int temp=n[i];
//        			 n[i]=n[j];
//        			 n[j]=temp;
//        		 }
//        	 }
//         }
//         for(int i=0;i<n.length;i++) {
//        	 System.out.println(n[i]);
//         }
	}

}
