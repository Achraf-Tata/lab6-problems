package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {
        stack = new LinkedList<>();
    }

    public void push(Book book) {
        stack.addFirst(book);
    }

    public Book pop() {
        return stack.removeFirst();
    }

    public Book peek() {
        return stack.getFirst();
    }

    public void display() {
        System.out.println("Stack content (top to bottom):");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
