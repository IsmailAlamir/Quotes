package GSON;

public class Quote {
    String author;
    String text;

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;

    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
