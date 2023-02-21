package com.csmtech;



public class StringQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ktmrgjszhwxu";
		char[] sA = s.toCharArray();
         char[] q= {'z','w'};
        
         int len=0;
         String ss="";
         int index;
         for(int j=0;j<q.length;j++) {
        	index=0;
         
         for(int i=0;i<sA.length;i++) {
        	 if(sA[i]==q[j])
        	 index=i;
         }
         ss = s.substring(index, s.length());
         len+=ss.length();
         }
         
         System.out.println(len);
         }
	}


