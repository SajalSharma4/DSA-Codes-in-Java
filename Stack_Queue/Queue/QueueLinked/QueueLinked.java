package Stack_Queue.QueueLinked;

import java.util.NoSuchElementException;

public class QueueLinked {
    public Node front;
    public Node rear;

    public QueueLinked() {
        front = rear = null;
    }

    public int size() {
        int s = 0;
        Node p = front;
        while (p != null) {
            s++;
            p = p.link;
        }
        return s;
    }

    public Boolean isEmpty() {
        return front == null;
    }

    public void Enqueue(int val) {
        Node temp = new Node(val);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.link = temp;
        }
        rear = temp;
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            throw new NoSuchElementException();
        }
        int del_ele = front.info;
        front = front.link;

        return del_ele;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            throw new NoSuchElementException();
        }
        return front.info;
    }

    public void display() {
        Node p = front;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue is : ");
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.link;
        }
        System.out.println();
    }

}
