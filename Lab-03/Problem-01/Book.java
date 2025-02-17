
public class Book {
    private String id;
    private String title;
    private String author;
    private int avail_copy;
    private int borrow_copy;

    public Book(String id, String title, String author, int avail_copy) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.avail_copy = avail_copy;
        this.borrow_copy = 0;
    }

  
    public String getId() {
        return id;
    }
    public String setId(String id) {
        return this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public String setTitle(String title) {
        return this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public String setAuthor(String author) {
        return this.author = author;
    }

    public int getAvail_copy() {
        return avail_copy;
    }
    public int setAvail_copy(int avail_copy) {
        return this.avail_copy = avail_copy;
    }

    public int getBorrow_copy() {
        return borrow_copy;
    }
    public int setBorrow_copy(int borrow_copy) {
        return this.borrow_copy = borrow_copy;
    }

    public void borrowBook() {
        if (avail_copy > 0) {
            avail_copy--;
            borrow_copy++;
        }
        else{
            System.out.println("Nai re vai nai");
        }

    }
    public void returnBook() {
        if (borrow_copy > 0) {
            avail_copy++;
            borrow_copy--;
        }
        else{
            System.out.println("Already returned");
        }
    }

 
    public void displayBookInfo() {
        System.out.println("Book ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Available Copies: " + getAvail_copy());
        System.out.println("Borrowed Copies: " + getBorrow_copy());
    }

}