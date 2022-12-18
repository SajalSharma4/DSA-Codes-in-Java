package LinkedList.DoubleLinkedList;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		int choice, data, x;
		Scanner scan = new Scanner(System.in);

		DoubleLinkedList List = new DoubleLinkedList();
		List.createList();

		while (true) {
			System.out.println("1.Display List");
			System.out.println("2.Insert in empty list");
			System.out.println("3.Insert a node in beginning of the list");
			System.out.println("4.Insert a node at the end of the list");
			System.out.println("5.Insert a node after a specified node");
			System.out.println("6.Insert a node before a specified node");
			System.out.println("7.Delete first node");
			System.out.println("8.Delete last node");
			System.out.println("9.Delete any node");
			System.out.println("10.Reverse the list");
			System.out.println("11.Quit");
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();

			if (choice == 11)
				break;

			switch (choice) {
				case 1:
					List.display();
					break;
				case 2:
					System.out.print("Enter the element to be inserted : ");
					data = scan.nextInt();
					List.InsertInEmpty(data);
					break;
				case 3:
					System.out.print("Enter the element to be inserted : ");
					data = scan.nextInt();
					List.InsertAtStart(data);
					break;
				case 4:
					System.out.print("Enter the element to be inserted : ");
					data = scan.nextInt();
					List.InsertAtEnd(data);
					break;
				case 5:
					System.out.print("Enter the element to be inserted : ");
					data = scan.nextInt();
					System.out.print("Enter the element after which to insert : ");
					x = scan.nextInt();
					List.InsertAfterVal(data, x);
					break;
				case 6:
					System.out.print("Enter the element to be inserted : ");
					data = scan.nextInt();
					System.out.print("Enter the element before which to insert : ");
					x = scan.nextInt();
					List.InsertBeforeVal(data, x);
					break;
				case 7:
					List.DeleteAtStart();
					break;
				case 8:
					List.DeleteLastNode();
					break;
				case 9:
					System.out.print("Enter the element to be deleted : ");
					data = scan.nextInt();
					List.DeleteNode(data);
					break;
				case 10:
					List.ReverseList();
					break;
				default:
					System.out.println("Wrong choice");
			}/* End of switch */
			System.out.println();
		} /* End of while */
		scan.close();
		System.out.println("Exiting");
	}/* End of main() */
}