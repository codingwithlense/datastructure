package com.amit.linkedlist;

public class LinkNode {
	int length;
	Node head;

	public void addNode(Node node) {
		node.next = head;
		head = node;
		length++;
	}

	public void removeNthNode(int nth) {
		int counter = 0;
		Node temp = head;
		while (temp != null) {
			if (nth == 0) {
				temp = temp.next;
				length--;
			} else if (counter == nth - 1) {
				temp.next = temp.next.next;
				length--;
			}
			temp = temp.next;

			counter++;

		}

	}

	public int getNthNodeFromLast(int nth) {
		int counter = 0;
		Node temp = head;
		while (temp != null) {
			if (counter == length - nth) {
				return temp.value;
			}
			temp = temp.next;
			counter++;
		}
		return -1;
	}

	public void printAllNodeValue() {
		int counter = 0;
		Node temp = head;
		while (counter < length) {
			System.out.print(temp.value);
			temp = temp.next;
			counter++;
		}
		System.out.println();
	}

	public Integer getLinkedListMiddleNumber() {
		Node firstNode = head;
		Node secondNode = head;
		int length = 1;
		while (firstNode.next != null && firstNode.next.next != null) {
			secondNode = secondNode.next;
			firstNode = firstNode.next.next;
			length++;
		}
		System.out.println("Middle Value " + secondNode.value);
		return length;
	}
}
