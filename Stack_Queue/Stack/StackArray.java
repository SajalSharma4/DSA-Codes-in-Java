package Stack_Queue.Stack;

import java.util.EmptyStackException;

public class StackArray {
    public int[] stack;
    public int top;

    public StackArray() {
        stack = new int[10];
        top = -1;
    }

    public StackArray(int length) {
        stack = new int[length];
        top = -1;
    }

    public void StackLength() {
        System.out.println("The length of the stack is : " + (top + 1));
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (stack.length - 1);
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("The stack is overflowed");
            return;
        }

        top += 1;
        stack[top] = val;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflowed");
            throw new EmptyStackException();
        }

        int x = stack[top];
        top -= 1;
        System.out.println("The element " + x + " has been deleted");
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is underflowed");
            throw new EmptyStackException();
        }

        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack is : ");
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

}
