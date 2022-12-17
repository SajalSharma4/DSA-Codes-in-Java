package LinkedList.SingleLinkedList;

import java.util.Scanner;

public class SingleLinkedList {
    private Node start;

    Scanner input = new Scanner(System.in);

    public SingleLinkedList() {
        start = null;
    }

    public void ListLength() {
        Node p;
        if (start == null)
            System.out.println("The list is empty");

        p = start;
        int ListLength = 0;
        while (p != null) {
            p = p.link;
            ListLength++;
        }
        System.out.println("The length of list is :" + ListLength);
    }

    public void display() {
        if (start == null) {
            System.out.println("The list is empty");
            return;
        }
        System.out.print("The list is : ");
        Node p = start;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.link;
        }
        System.out.println(" ");
    }

    public void search(int val) {
        Node p;
        if (start == null) {
            return;
        }
        if (start.info == val) {
            System.out.println("Found in position 1");
            return;
        }
        p = start;
        int pos = 1;
        while (p != null) {
            if (p.info == val) {
                break;
            }

            p = p.link;
            pos++;
        }
        if (p == null) {
            System.out.println("Element not present in list");
        } else {
            System.out.println("Element " + val + " found at position : " + pos);
        }
    }

    public void InsertAtEnd(int data) {
        Node p;
        Node temp = new Node(data);
        if (start == null) {
            start = temp;
            return;
        }
        p = start;
        while (p.link != null) {
            p = p.link;
        }
        p.link = temp;
    }

    public void InsertAtStart(int data) {
        Node temp = new Node(data);
        temp.link = start;
        start = temp;
    }

    public void InsertAfter(int val, int data) {
        Node p = start;
        while (p != null) {
            if (p.info == val) {
                break;
            }
            p = p.link;
        }
        if (p == null) {
            System.out.println(val + " is not present in the list");
        } else {
            Node temp = new Node(data);
            temp.link = p.link;
            p.link = temp;
        }
    }

    public void InsertBefore(int val, int data) {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        if (val == start.info) {
            Node temp = new Node(data);
            temp.link = start;
            start = temp;
            return;
        }

        Node p = start;
        while (p.link != null) {
            if (p.link.info == val) {
                break;
            }
            p = p.link;
        }
        if (p.link == null) {
            System.out.println(val + " is not present in the list");
        } else {
            Node temp = new Node(data);
            temp.link = p.link;
            p.link = temp;
        }
    }

    public void InsertAtPos(int pos, int data) {
        int i;
        if (pos == 1) {
            Node temp = new Node(data);
            temp.link = start;
            start = temp;
            return;
        }
        Node p = start;
        for (i = 1; i < pos - 1 && p != null; i++) {
            p = p.link;
        }
        if (p == null) {
            System.out.println("You can add element only upto " + i + "th position");
        } else {
            Node temp = new Node(data);
            temp.link = p.link;
            p.link = temp;
        }
    }

    public void CreateList() {
        int n;

        System.out.println("Enter the number of nodes :");
        n = input.nextInt();

        if (n == 0) {
            input.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the data for position " + i + " :");
            int a = input.nextInt();
            InsertAtEnd(a);
        }
    }

    public void DeleteFirst() {
        if (start == null) {
            System.out.println("No first element, List is empty");
            return;
        } else {
            start = start.link;
        }
    }

    public void emptyList() {
        if (start == null) {
            System.out.println("List is already empty");
            return;
        } else {
            start = null;
        }
    }

    public void DeleteLast() {
        if (start == null) {
            System.out.println("Empty list");
            return;
        }
        Node p = start;
        while (p.link.link != null) {
            p = p.link;
        }
        p.link = null;
    }

    public void DeleteNode(int val) {
        if (start == null) {
            System.out.println("Empty list");
            return;
        }

        if (start.info == val) {
            start = start.link;
            return;
        }
        Node p = start;
        while (p.link != null) {
            if (p.link.info == val) {
                break;
            }
            p = p.link;
        }
        p.link = p.link.link;
    }

    public void reverse() {
        Node prev, p, next;
        p = start;
        prev = null;

        while (p != null) {
            next = p.link;
            p.link = prev;
            prev = p;
            p = next;
        }
        start = prev;
    }

    public void BubbleSortData() {
        Node p, q, end;

        for (end = null; end != start.link; end = p) {
            for (p = start; p.link != end; p = p.link) {
                q = p.link;
                if (p.info > q.info) {
                    int temp = p.info;
                    p.info = q.info;
                    q.info = temp;
                }
            }
        }
    }

    public void BubbleSortLink() {
        Node r, p, q, end, temp;

        for (end = null; end != start.link; end = p) {
            for (r = p = start; p.link != end; r = p, p = p.link) {
                q = p.link;
                if (p.info > q.info) {
                    p.link = q.link;
                    q.link = p;
                    if (p != start)
                        r.link = q;
                    else
                        start = q;
                    temp = p;
                    p = q;
                    q = temp;
                }
            }
        }
    }

    public SingleLinkedList MergeUsingList(SingleLinkedList list) {
        SingleLinkedList mergeList = new SingleLinkedList();
        mergeList.start = merge1(start, list.start);
        return mergeList;
    }

    private Node merge1(Node p1, Node p2) {
        Node startM;
        if (p1.info <= p2.info) {
            startM = new Node(p1.info);
            p1 = p1.link;
        } else {
            startM = new Node(p2.info);
            p2 = p2.link;
        }
        Node pM = startM;

        while (p1 != null && p2 != null) {
            if (p1.info < p2.info) {
                pM.link = new Node(p1.info);
                p1 = p1.link;
            } else {
                pM.link = new Node(p2.info);
                p2 = p2.link;
            }
            pM = pM.link;
        }

        // if elements of p2 are finished while p1 still has elements
        while (p1 != null) {
            pM.link = new Node(p1.info);
            p1 = p1.link;
            pM = pM.link;
        }

        // if elements of p1 are finished while p2 still has elements
        while (p2 != null) {
            pM.link = new Node(p2.info);
            p2 = p2.link;
            pM = pM.link;
        }

        return startM;
    }

    public SingleLinkedList MergeUsingLink(SingleLinkedList list) {
        SingleLinkedList MergeList = new SingleLinkedList();
        MergeList.start = merge2(start, list.start);
        return MergeList;
    }

    private Node merge2(Node p1, Node p2) {
        Node startM;
        if (p1.info < p2.info) {
            startM = p1;
            p1 = p1.link;
        } else {
            startM = p2;
            p2 = p2.link;
        }

        Node pM = startM;
        while (p1 != null && p2 != null) {
            if (p1.info < p2.info) {
                pM.link = p1;
                p1 = p1.link;
                pM = pM.link;
            } else {
                pM.link = p2;
                p2 = p2.link;
                pM = pM.link;
            }
        }
        if (p1 == null)
            pM.link = p2;
        else
            pM.link = p2;

        return startM;
    }

    public void Concatenate(SingleLinkedList list) {
        if (start == null)
            return;
        if (list.start == null)
            return;

        Node p = start;
        while (p.link != null) {
            p = p.link;
        }
        p.link = list.start;

    }
}
