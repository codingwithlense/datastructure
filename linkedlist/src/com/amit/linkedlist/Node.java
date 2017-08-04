package com.amit.linkedlist;

public class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}

	public boolean hasNext() {
		return next == null ? false : true;
	}
   
}
