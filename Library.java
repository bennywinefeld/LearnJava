import java.util.ArrayList;
import java.util.Scanner;

public class Library {
  String name;
  String location;
  int selectedBook = -1;
  ArrayList<Book> bookList = new ArrayList<Book>();

  public Library(String passedName, String passedLocation) {
    this.name = passedName;
    this.location = passedLocation;
    bookList.add(new Book("Bible", "God", -10000));
    System.out.println(this.name + " at " + this.location + " created.");
  }

  public void addBook(Book book) {
    this.bookList.add(book);
  }


  public void printTitles() {
    System.out.println("\n" + this.name + " - " + this.location + "\n----------------");
    for (int i = 0; i < bookList.size(); i++) {
      if (i + 1 == this.selectedBook) {
        System.out.println(i + 1 + ") " + this.bookList.get(i).title + " - SELECTED");
      } else {
        System.out.println(i + 1 + ") " + this.bookList.get(i).title);
      }
    }
  }

  public void start() {
    System.out.println("\nBOOK DATABASE\n--------------");

    Scanner myScanner = new Scanner(System.in);
    int choice = 0;

    while (choice != 5) {

      System.out.println("\nPlease choose one of the options");
      System.out.println("Enter 1 to print all titles");
      System.out.println("Enter 2 to select a book");
      System.out.println("Enter 3 to add a book");
      System.out.println("Enter 4 to remove selected book");
      System.out.println("Enter 5 to exit\n");

      choice = Integer.parseInt(myScanner.nextLine());

      switch (choice) {
        case 1:
          this.printTitles();
          break;
        case 2:
          this.printTitles();
          System.out.println("\nPlease select book number:\n");
          this.selectedBook = Integer.parseInt(myScanner.nextLine());
          if (this.selectedBook <= bookList.size() && this.selectedBook >= 1) {
            this.printTitles();

            this.bookList.get(this.selectedBook - 1).getInfo();
          } else {
            System.out.println("\nSelection out of range");
          }
          break;
        case 3:
          System.out.println("\nEnter the name of the book:\n");
          String name = myScanner.nextLine();
          System.out.println("\nEnter the author:\n");
          String author = myScanner.nextLine();
          System.out.println("\nEnter the year written:\n");
          int yearWritten;
          yearWritten = Integer.parseInt(myScanner.nextLine());
          this.addBook(new Book(name, author, yearWritten));
          this.printTitles();
          break;
        case 4:
          if (this.selectedBook >= 1) {
            System.out.println("\nRemoving " + bookList.get(this.selectedBook - 1).title);
            bookList.remove(this.selectedBook - 1);
            this.selectedBook = -1;
            this.printTitles();
          } else {
            System.out.println("\nNo selection - enter 2 to select a book");
          }
          break;
        case 5:
          break;
        default:
          System.out.println("\nPlease choose one of the actions by entering an integer between 1 and 5");
      }
    }
  }
}
