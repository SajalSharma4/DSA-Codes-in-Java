
package LinkedList.SingleLinkedList;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        int choice, data, k, x;

        Scanner scan = new Scanner(System.in);

        SingleLinkedList List = new SingleLinkedList();

        List.CreateList();

        while (true) {
            System.out.println("1.Display list");
            System.out.println("2.Count the number of nodes");
            System.out.println("3.Search for an element");
            System.out.println("4.Insert in empty list/Insert in beginning of the list");
            System.out.println("5.Insert a node at the end of the list");
            System.out.println("6.Insert a node after a specified node");
            System.out.println("7.Insert a node before a specified node");
            System.out.println("8.Insert a node at a given position");
            System.out.println("9.Delete first node");
            System.out.println("10.Delete last node");
            System.out.println("11.Delete any node");
            System.out.println("12.Reverse the list");
            System.out.println("13.Quit");

            System.out.print("Enter your choice : ");
            choice = scan.nextInt();

            if (choice == 19)
                break;

            switch (choice) {
                case 1:
                    List.display();
                    break;
                case 2:
                    List.ListLength();
                    break;
                case 3:
                    System.out.print("Enter the element to be searched : ");
                    data = scan.nextInt();
                    List.search(data);
                    break;
                case 4:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    List.InsertAtStart(data);
                    break;
                case 5:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    List.InsertAtEnd(data);
                    break;
                case 6:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.print("Enter the element after which to insert : ");
                    x = scan.nextInt();
                    List.InsertAfter(data, x);
                    break;
                case 7:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.print("Enter the element before which to insert : ");
                    x = scan.nextInt();
                    List.InsertBefore(data, x);
                    break;
                case 8:
                    System.out.print("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.print("Enter the position at which to insert : ");
                    k = scan.nextInt();
                    List.InsertAtPos(data, k);
                    break;
                case 9:
                    List.DeleteFirst();
                    break;
                case 10:
                    List.DeleteLast();
                    break;
                case 11:
                    System.out.print("Enter the element to be deleted : ");
                    data = scan.nextInt();
                    List.DeleteNode(data);
                    break;
                case 12:
                    List.reverse();
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
