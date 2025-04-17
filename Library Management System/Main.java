import java.util.InputMismatchException;
import java.util.Scanner;
//  Main.java  – Entry point with a console menu for user interaction.
public class Main{
    public static void main(String[] args) {
//    library object
    Library library = new Library();
Scanner sc = new Scanner(System.in);

while(true){
    // show menu

System.out.println("\n-------------Library Management System--------------------");
System.out.println("1. Add a Book");
System.out.println("2. Search a Book");
System.out.println("3. Remove a Book");
System.out.println("4. Lists of Book");
System.out.println("5. Exit ");

try {
  //  for wrong input  i use exception handling
    

System.out.println("Enter your Choice");
int choice = sc.nextInt();
//  user can ask repetately with the help of Swith
switch (choice) {
    case 1:

    library.addBook(sc);
        break;


        case 2:
        library.searchBook(sc);
        break;
    
    case 3:
    library.removeBook(sc);
       break;


    case 4 :
    library.showBooks();
    break;

    case 5:
    System.out.println("Thank you for using Library Management System.");

return;

    default:
    System.out.println("⚠️ Invalid choice. Try again.");
      
}
}
catch(InputMismatchException e){
System.out.println("Please! Enter a valid Number");

sc.nextLine();
   
}
}
}
    }
