package LinkedList;

import java.util.NoSuchElementException;

class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T element) {
        list.add(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T element = list.get(0);
        list.delete(0);
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}

