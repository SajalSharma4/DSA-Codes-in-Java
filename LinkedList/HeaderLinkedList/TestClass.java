package LinkedList.HeaderLinkedList;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        int choice, data, x, k;
        Scanner scan = new Scanner(System.in);
        HeaderLinkedList List = new HeaderLinkedList();
        List.CreateList();

        while (true) {
            System.out.println("1.Display list");
            System.out.println("2.Insert a node at the end of the list");
            System.out.println("3.Insert a new node before a node");
            System.out.println("4.Insert at a given position");
            System.out.println("5.Delete a node");
            System.out.println("6.Reverse the list");
            System.out.println("7.Quit");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();

            if (choice == 7)
                break;

            switch (choice) {
                case 1:
                    List.display();
                    break;
                case 2:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    List.InsertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.print("Enter the element before which to insert : ");
                    x = scan.nextInt();
                    List.InsertBefore(data, x);
                    break;
                case 4:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.print("Enter the position at which to insert : ");
                    k = scan.nextInt();
                    List.InsertAtPosition(data, k);
                    break;
                case 5:
                    System.out.print("Enter the element to be deleted : ");
                    data = scan.nextInt();
                    List.DeleteNode(data);
                    break;
                case 6:
                    List.Reverse();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }

    }

}
