import java.util.NoSuchElementException;

import Stack_Queue.Stack.Node;

public class QueueCircularLinked {

    public Node rear;

    public QueueCircularLinked() {
        rear = null;
    }

    public boolean isEmpty() {
        return (rear == null);
    }

    public void Enqueue(int val) {
        Node temp = new Node(val);

        if (isEmpty()) {
            rear = temp;
            rear.link = rear;
        } else {
            temp.link = rear.link;
            rear.link = temp;
            rear = temp;
        }
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            throw new NoSuchElementException();
        }
        Node temp;
        if (rear.link == rear) {
            temp = rear;
            rear = null;
        } else {
            temp = rear.link;
            rear.link = temp.link;
        }
        return temp.info;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            throw new NoSuchElementException();
        }
        return rear.link.info;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue is : ");
        Node p = rear.link;
        do {
            System.out.print(p.info + " ");
            p = p.link;
        } while (p != rear.link);
        System.out.println();
    }

    public int size() {
        if (isEmpty())
            return 0;
        int s = 0;
        Node p = rear.link;
        do {
            s++;
            p = p.link;
        } while (p != rear.link);
        return s;
    }
}
