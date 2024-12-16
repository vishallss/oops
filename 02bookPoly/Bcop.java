import java.util.Scanner;
abstract class Publication
{
String title;
int price,copies;
abstract void salecopy();
abstract void setPrice();
}
class Book extends Publication
{
String author;
void salecopy()
{
System.out.println("Book Name :"+title);
System.out.println("Author Name :"+author);
System.out.println("Price Per Book :"+price);
System.out.println("Copies Ordered :"+copies);
System.out.println("Total Sales :"+copies*price);
}
void orderCopies()
{
System.out.println("Enter The Quantity :");
Scanner sc1=new Scanner(System.in);
copies=sc1.nextInt();
}
void setPrice()
{
System.out.println("Enter Title Of Book :");
Scanner sc=new Scanner(System.in);
title=sc.nextLine();
System.out.println("Enter The Name Of Author :");
Scanner sc2=new Scanner(System.in);
author=sc2.nextLine();
System.out.println("Enter The Price Of Book :");
Scanner sc1=new Scanner(System.in);
price=sc1.nextInt();
}
} //Class book end
class Magazine extends Publication
{
String currIssue;
void salecopy()
{
System.out.println("Magazine Name :"+title);
System.out.println("Current Issue :"+currIssue);
System.out.println("Price Per Magazine :"+price);
System.out.println("Copies Ordered :"+copies);
System.out.println("Total Sales :"+copies*price);
}
void orderQty()
{
System.out.println("Enter The Quantity Of Magazine :");
Scanner sc=new Scanner(System.in);
copies=sc.nextInt();
}
void currentIssue()
{
System.out.println("The Current Issue Of Magazine Is :"+currIssue);
}
void receiveIssue()
{
System.out.println("\nYou Will Receive"+currIssue+"Magazine Soon !");
}
void setIssue()
{
System.out.println("Enter The Title Of Magazine :");
Scanner sc=new Scanner(System.in);
title=sc.nextLine();
System.out.println("Enter The Current Issue :");
Scanner sc1=new Scanner(System.in);
currIssue=sc1.nextLine();
}
void setPrice()
{
System.out.println("Enter The Price Of Magazine :");
Scanner sc=new Scanner(System.in);
price=sc.nextInt();
}
} //Class Magazine end
public class Bcop {
public static void main(String[] args) {
System.out.println("\n-----Book Department-----");
Book b=new Book();
b.setPrice();
b.orderCopies();
System.out.println("\n-----Details Of Book Registered Now-----");
b.salecopy();
System.out.println("\n-----Magazine Department-----");
Magazine m=new Magazine();
m.setIssue();
m.setPrice();
m.orderQty();
System.out.println("\n-----Details Of Magazine Registered Now-----");
m.salecopy();
m.receiveIssue();
}
} //main end





