package com.csmtech;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Deque<Object> ad = new ArrayDeque<>();
          Stack<Object> stack = new Stack<>();
          stack.push(10);
          stack.add(20);
          stack.push(30);
          stack.add(40);
          stack.pop();
          stack.remove(1);
          System.out.println(stack);
	}

}
