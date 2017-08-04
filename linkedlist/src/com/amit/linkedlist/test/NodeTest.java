package com.amit.linkedlist.test;

import com.amit.linkedlist.LinkNode;
import com.amit.linkedlist.Node;

public class NodeTest {
	public static void main(String[] args) {
		LinkNode linkedNode = new LinkNode();
		linkedNode.addNode(new Node(13));
		linkedNode.addNode(new Node(12));
		linkedNode.addNode(new Node(11));
		linkedNode.addNode(new Node(10));
		linkedNode.addNode(new Node(9));
		linkedNode.addNode(new Node(8));
		linkedNode.addNode(new Node(7));
		linkedNode.addNode(new Node(6));
		linkedNode.addNode(new Node(5));
		linkedNode.addNode(new Node(4));
		linkedNode.addNode(new Node(3));
		linkedNode.addNode(new Node(2));
		linkedNode.addNode(new Node(1));
//		linkedNode.printAllNodeValue();
//		linkedNode.removeNthNode(5);
		linkedNode.printAllNodeValue();
//		System.out.print(linkedNode.getNthNodeFromLast(5));
		System.out.print(linkedNode.getLinkedListMiddleNumber());
	}
}
