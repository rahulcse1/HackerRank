package hacker.chalalnge;

import java.util.Stack;

public class AmarQueue {

	Stack<Integer> s1 = new Stack<Integer>();

	public void nqueue(int n) {
		s1.push(n);
	}

	public void dqueue() {
		s1.remove(0);
	}

	public static void main(String[] args) {
		AmarQueue q = new AmarQueue();
		q.nqueue(1);
		q.nqueue(2);
		q.nqueue(3);
		q.nqueue(4);
		q.dqueue();
		System.out.println(q.s1);
	}
}
