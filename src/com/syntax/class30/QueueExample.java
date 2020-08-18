package com.syntax.class30;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(100);
		queue.add(1100);
		queue.add(1);
		queue.add(10);
		
		
		System.out.println(queue);
		queue.remove();
		
		
		System.out.println(queue);
		
		
	}

}
