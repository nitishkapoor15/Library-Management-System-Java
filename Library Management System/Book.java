// - Book.java – Represents each book with details like title, author, ID, and availability.

public class Book{

String title;
String author;
String id;
boolean isAvailable;


// Constructor to initialize the object

public Book(String title, String author, String id, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.id = id;
    this.isAvailable = isAvailable;
}



//   give output in String formate
@Override
public String toString() {
    return "Book [ title = " + title + " , author = " + author + " , id = " + id + " , isAvailable = " + isAvailable + "]";
}






}