package Stack_Queue.Stack;

import java.util.EmptyStackException;

public class StackLinked {

    private Node top;

    public StackLinked() {
        top = null;
    }

    public int Stacklength() {
        int s = 0;
        if (top == null) {
            System.out.println("The stack is empty");
        } else {
            Node p = top;
            while (p != null) {
                p = p.link;
                s++;
            }
        }
        return s;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int val) {
        Node temp = new Node(val);
        temp.link = top;
        top = temp;
    }

    public int pop() {
        int x = top.info;
        if (isEmpty()) {
            System.out.println("The stack is empty");
            throw new EmptyStackException();
        }
        top = top.link;
        return x;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            throw new EmptyStackException();
        }
        return top.info;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return;
        }

        Node p = top;
        while (p != null) {
            System.out.println(p.info);
            p = p.link;
        }
    }
}
