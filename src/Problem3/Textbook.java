package Problem3;

public class Textbook extends Book {
    private String level;

    public Textbook(String title, String author, int nbrPages, String level) {
        super(title, author, nbrPages);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Textbook [numRec=" + numRec + ", title=" + title + ", author=" + author + ", nbrPages=" + nbrPages + ", level=" + level + "]";
    }
}
