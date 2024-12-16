import java.util.Scanner; 
abstract class Shape 
{ 
public double height,width; 
public void setValues(double height,double width) 
{ 
this.height=height; 
this.width=width; 
} 
public double getHeight() 
{ 
return height; 
} 
public double getWidth() 
{ 
return width; 
} 
abstract public double compute_area(); 
} 
class Triangle extends Shape 
{ 
public double compute_area() 
{ 
return(getHeight()*getWidth())/2; 
} 
} 
class Rectangle extends Shape 
{ 
public double compute_area() 
{ 
return (getHeight()*getWidth()); 
} 
} 
public class Shmain 
{ 
public static void main(String[] args) 
{ 
Scanner myObj=new Scanner(System.in); 
System.out.println("Enter Height for rectangle:"); 
double h=myObj.nextDouble(); 
System.out.println("Enter Width for rectangle:"); 
double w=myObj.nextDouble(); 
System.out.println("Enter Height for triangle:"); 
double h1=myObj.nextDouble(); 
System.out.println("Enter Width for triangle:"); 
double w1=myObj.nextDouble(); 
Shape s;//reference to class Shape 
Rectangle rect=new Rectangle(); 
s=rect; 
s.setValues(h,w); 
System.out.println("Area of Rectangle:"+s.compute_area()); 
Triangle tri=new Triangle(); 
s=tri; 
s.setValues(h1,w1); 
System.out.println("Area of Triangle:"+s.compute_area()); 
} 
}

