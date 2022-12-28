package Stack_Queue.QueueArray;

import java.util.NoSuchElementException;

public class QueueArray {

    public int[] queue;
    public int rear;
    public int front;

    public QueueArray() {
        queue = new int[10];
        rear = front = -1;
    }

    public QueueArray(int val) {
        queue = new int[val];
        rear = front = -1;
    }

    public boolean isEmpty() {
        return (front == -1 || front == rear + 1);
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }

    public void Enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        } else {
            if (front == -1)
                front = 0;
            rear += 1;
            queue[rear] = x;
        }
    }

    public int Dequeue() {
        int x;
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            throw new NoSuchElementException();
        }
        x = queue[front];
        front = front + 1;
        return x;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public void display() {
        int i;

        if (isEmpty()) {
            System.out.println("Queue is empty\n");
            return;
        }

        System.out.println("Queue is :\n\n");
        for (i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");

        System.out.println();
    }

}
