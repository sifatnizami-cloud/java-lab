class LibraryBook {
String title;
String author;
int bookID;
LibraryBook(String title, String author, int bookID) {
this.title = title;
this.author = author;
this.bookID = bookID;
}
void displayBookInfo() {
System.out.println("Book Title: " + this.title);
System.out.println("Author: " + this.author);
System.out.println("Book ID: " + this.bookID);
}
}

public class Main3 {
public static void main(String[] args) {
LibraryBook book1 = new LibraryBook("Java Programming", "Herbert Schildt", 101);
LibraryBook book2 = new LibraryBook("Clean Code", "Robert C. Martin", 102);
book1.displayBookInfo();
System.out.println();
book2.displayBookInfo();
}
}
