package LinkedList.HeaderLinkedList;

import java.util.Scanner;

public class HeaderLinkedList {
	private Node head;
	Scanner input = new Scanner(System.in);

	public HeaderLinkedList() {
		head = new Node(0);
	}

	public void display() {
		if (head.link == null) {
			System.out.println("List is empty\n");
			return;
		}

		Node p = head.link;
		System.out.print("List is :\n");
		while (p != null) {
			System.out.print(p.info + " ");
			p = p.link;
		}
		System.out.println();
	}

	public void InsertAtEnd(int data) {
		Node temp = new Node(data);

		Node p = head;
		while (p.link != null)
			p = p.link;

		p.link = temp;
		temp.link = null;
	}

	public void CreateList() {
		int i, n, data;

		System.out.println("Enter the number of nodes : ");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.print("Enter the element to be inserted : ");
			data = input.nextInt();
			InsertAtEnd(data);
		}
	}

	public void InsertBefore(int data, int val) {
		Node temp;

		Node p = head;
		while (p.link != null) {
			if (p.link.info == val)
				break;
			p = p.link;
		}

		if (p.link == null)
			System.out.println(val + " not present in the list");
		else {
			temp = new Node(data);
			temp.link = p.link;
			p.link = temp;
		}
	}

	public void InsertAtPosition(int data, int pos) {
		Node temp;
		int i;

		Node p = head;
		for (i = 1; i <= pos - 1 && p != null; i++)
			p = p.link;

		if (p == null)
			System.out.println("You can insert only upto " + (i - 1) + "th position\n\n");
		else {
			temp = new Node(data);
			temp.link = p.link;
			p.link = temp;
		}
	}

	public void DeleteNode(int data) {
		Node p = head;
		while (p.link != null) {
			if (p.link.info == data)
				break;
			p = p.link;
		}

		if (p.link == null)
			System.out.println(data + "Element %d not found");
		else
			p.link = p.link.link;
	}

	public void Reverse() {
		Node prev, p, next;
		prev = null;
		p = head.link;
		while (p != null) {
			next = p.link;
			p.link = prev;
			prev = p;
			p = next;
		}
		head.link = prev;
	}

}
