package learn.java.access1;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearnQueue {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque = new ArrayDeque<Integer>();
		Deque<Integer> deque1 = new ArrayDeque<Integer>();
		for (int i = 0; i < 10; i=i+2) {
			deque.push(i);
			
	
		}
		System.out.println(deque);
		System.out.println(deque.pop());System.out.println(deque);
		System.out.println(deque.pollLast());
		System.out.println(deque);
		
		for (int i = 0; i < 10; i++) {
			deque1.offer(i);
			
			
		}
		System.out.println(deque1);
		System.out.println(deque1.pop());
		System.out.println(deque1);
		
		
		
			
		
		

	}

}
