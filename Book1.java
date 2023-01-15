package project;

import java.util.Scanner;

public class Book1 {

 // Class data members
 public int sNo;
 public String bookName;
 public String authorName;
 public int bookQty;
 public int bookQtyCopy;

 // read input from users
 Scanner input = new Scanner(System.in);

 // To add book details
 // Constructor for Book1 class
 public Book1()
 {
     System.out.println("Enter Serial No of Book:");
     this.sNo = input.nextInt();
     input.nextLine();

     System.out.println("Enter Book Name:");
     this.bookName = input.nextLine();

     System.out.println("Enter Author Name:");
     this.authorName = input.nextLine();

     System.out.println("Enter Quantity of Books:");
     this.bookQty = input.nextInt();
     bookQtyCopy = this.bookQty;
 }
}
