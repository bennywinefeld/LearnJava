class Main {
  public static void main(String[] args) {
    Library Library1 = new Library("Jacob's Library", "Palo Alto");
    System.out.println(Library1.name);
    Library1.addBook(new Book("Harry Potter", "J.K. Rowling", 1995));
    Library1.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1932)); 

    Library1.start();
  }
}
