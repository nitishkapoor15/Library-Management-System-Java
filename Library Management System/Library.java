import java.util.ArrayList;
import java.util.Scanner;

// Library.java – Manages book collection and includes logic to add, search, remove, and list books.

public class Library{
//  store the book object in ArrayLiST
    ArrayList<Book> books = new ArrayList<>();

//  add the book in list
public void addBook(Scanner sc){

System.out.print("Enter Book Title : ");
sc.nextLine(); // to consume newline
        String title = sc.nextLine();

        System.out.print("Enter Book Author : ");
        String author = sc.nextLine();

        System.out.print("Enter Book ID : ");
        String id = sc.nextLine();


     // Check if book with same ID exists or not
     for (Book book : books) {
        if (book.id.equals(id)) {
            System.out.println(" Book with this ID already exists!");
            return;
        }
    }
    
    books.add(new Book(title, author, id, true));
    System.out.println("✅ Book added successfully.");

}

   // Search Book by ID if id is there so book wiil found

public void searchBook(Scanner sc){
    System.out.print("Enter Book ID to serach : ");
    sc.nextLine(); // to consume newline
    String id = sc.nextLine();

    for(Book book :books){
      if(book.id.equals(id)){
        System.out.println("Book Found : " + book);
        return;
      }
    }
          System.out.println("Book not Found");
      

}

//  Remove book by ID
public void removeBook(Scanner sc){
    System.out.print("Enter Book ID to Delete : ");
    sc.nextLine(); // to consume newline
    String id = sc.nextLine();

    for (int i = 0; i < books.size(); i++) {
        if (books.get(i).id.equals(id)) {
            books.remove(i);
            System.out.println(" Successfully deleted.");
            return;
        }
    }
    
    System.out.println(" Book not found.");
}


// show all Books

public void showBooks(){
    if (books.isEmpty()) {
        System.out.println(" No books found in the library.");
    } else {
        System.out.println("\n List of Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }


}
}