package LinkedList;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue dequeue: " + queue.dequeue());
        System.out.println("Queue peek: " + queue.peek());
    }
}

