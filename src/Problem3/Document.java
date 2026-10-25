package Problem3;

public class Document {
    private static int count = 0;
    protected int numRec;
    protected String title;

    public Document(String title) {
        this.numRec = ++count;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Document [numRec=" + numRec + ", title=" + title + "]";
    }
}
