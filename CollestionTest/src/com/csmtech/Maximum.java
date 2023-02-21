package com.csmtech;

import java.util.ArrayList;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int[] num=new int[n+3];
        num[0]=0;
        num[1]=1;
        ArrayList<Integer> al = new ArrayList<>();
        if(n%2==0) {
        for(int i=1;i<=(n/2);i++) {
        	num[i*2]=num[i];
        	num[(i*2)+1]=num[i]+num[i];
        }}
        else {
        	for(int i=1;i<=(n/2)+1;i++) {
            	num[i*2]=num[i];
            	num[(i*2)+1]=num[i]+num[i];
            }
        }
        for(int i=0;i<n+1;i++) {
       System.out.println(num[i]);} 
	}

}
