package com.csmtech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Knapsap {
	
	public static Float Max(Float[] pwRatio) {
		Float max=pwRatio[0];
		for(int i=0;i<pwRatio.length;i++) {
			if(pwRatio[i]>max) {
				max=pwRatio[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Float[] profit= { 25.0f, 24.0f,15.0f};
		Float[] weigth= {18.0f,15.0f,10.0f};
		Float[] pwRatio=new Float[3];
		int cap=20;
		Float p=0.0f;
		TreeMap<Float, Float> tree=new TreeMap<>();
		
		
		for(int i=0;i<profit.length;i++)
		{
		    pwRatio[i]=(Float) (profit[i]/weigth[i]);	
		}
		for(int i=0;i<profit.length;i++) {
			if(cap>0) {
				cap=cap-weigth[i];
			}
		}
		
//		Arrays.sort(pwRatio);
//		System.out.println(Arrays.toString(pwRatio));
//		
//		List<Float> ratioList = Arrays.asList(pwRatio);
//		
//		Collections.sort(ratioList);
//		Collections.reverse(ratioList);
		for(int i=0;i<3;i++)
		{
			if(cap>0) {
				
				
			}
		
		}
		
		
		
	     


	}

}
