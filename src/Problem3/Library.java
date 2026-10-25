package Problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }

    public void displayDocuments() {
        for (int i = 0; i < documents.size(); i++) {
            System.out.println(documents.get(i));
        }
    }

    public boolean add(Document doc) {
        if (documents.size() >= capacity) {
            return false;
        }
        return documents.add(doc);
    }

    public boolean delete(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numEnrg) {
        for (int i = 0; i < documents.size(); i++) {
            Document d = documents.get(i);
            if (d.getNumRec() == numEnrg) {
                return d;
            }
        }
        return null;
    }

    public void displayAuthors() {
        for (int i = 0; i < documents.size(); i++) {
            Document d = documents.get(i);
            if (d instanceof Book) {
                Book b = (Book) d;
                System.out.println(b.getTitle() + " - " + b.getAuthor());
            }
        }
    }
}
