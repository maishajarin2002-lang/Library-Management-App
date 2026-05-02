import java.util.*;
 class Library {
// ================= add book  =================
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // ================= view Books =================
    public void viewBooks() {
        System.out.println("Viewing all books...");
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }
 }
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library{
            // ================= add book  =================
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }
// mohua
    // ================= view Bookss =================
    public void viewBooks() {
        System.out.println("Viewing all books...");
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }
        };

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book ");
            System.out.println("2. View Books ");
            System.out.println("3. Search Book ");
            System.out.println("4. Issue Book ");
            System.out.println("5. Return Book ");
            System.out.println("6. Delete Book ");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    // library.addBook(new Book(id1, title, author));
                    break;

                case 2:
                    //library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    // library.searchBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    // library.issueBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    //library.returnBook(sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Book ID to delete: ");
                    // library.deleteBook(sc.nextInt());
                    break;

                case 7:
                    System.out.println("Exiting system... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
