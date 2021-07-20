public class Book {
  String title;
  String author;
  int yearWritten;

  public Book(String title, String author, int yearWritten) {
    this.title = title;
    this.author = author;
    this.yearWritten = yearWritten;
  }

  public void getInfo() {
    System.out.println("\nTitle: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("Year Written: " + this.yearWritten);
  }
}
