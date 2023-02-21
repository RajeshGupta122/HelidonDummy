package com.csmtech;

import java.util.ArrayList;

public class MoneyDistribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=20;
		int sum=0;
		for(int i=1;n>=0;i++) {
			n=n-i;
			sum++;
			if(n<0) {
				sum--;
			}
		}
		System.out.println(sum);
	}

}
