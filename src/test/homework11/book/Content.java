package test.homework11.book;

public class Content {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    void show() {
        System.out.println("Содержание книги: " + content);
    }
}
