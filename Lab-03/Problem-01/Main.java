public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("B_1", "C Programming", "Ramim", 10);
        Book book2 = new Book("B_2", "Java Programming", "Rahim", 5);
        
        System.out.println("______________________________________");
        book1.setBorrow_copy(1);
        book1.borrowBook();
        book1.getBorrow_copy();
        book1.returnBook();
        book1.getAvail_copy();
        book1.displayBookInfo();

        System.out.println("______________________________________");
        book2.setBorrow_copy(1);
        book2.borrowBook();
        book2.getBorrow_copy();
        book2.returnBook();
        book2.getAvail_copy();
        book2.displayBookInfo();
    }
}