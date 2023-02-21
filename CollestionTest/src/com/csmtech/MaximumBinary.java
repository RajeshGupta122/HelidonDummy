package com.csmtech;

import java.util.Arrays;

public class MaximumBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=2;
         int[][] arr={{101,1011},{1011,1011}};
         int[][] arr1=new int[n][n];
         int[] sumArray=new int[n];
         for(int i=0;i<n;i++) {
        	 for(int j=0;j<n;j++) {
        		 int rem,p=0,sum=0,rem1;
        		 while(arr[i][j]>0) {
        			 rem=arr[i][j]%10;
        		   rem1=(int) Math.pow(2, p)*rem;
        			 sum+=rem1;
        			 p++;
        			 arr[i][j]/=10;
        		 }
        		 arr1[i][j]=sum;
        	 }
         }
         for(int i=0;i<n;i++) {
        	 int sum=0;
        	 for(int j=0;j<n;j++) {
        		 sum+=arr1[i][j];
        	 }
        	 sumArray[i]=sum;
         }
         int max=sumArray[0];
         for(int i=0;i<n;i++) {
        	 if(sumArray[i]>max) {
        		 max=sumArray[i];
        	 }
        	 
         }
         max = 16;
         int s=0;
         boolean res = true;
         int check = 0;
         for(int i=max;i!=0;i/=2) {
        	 s = s*10;
        	 int rem=i%2;
        	 s+=rem;
         }
         System.out.print(s);
	}

}
