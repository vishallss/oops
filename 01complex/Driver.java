import java.util.Scanner;

class Complex
{
private float real;
private float img;

Complex()
{
real=0;
img=0;
}

Complex(float real,float img)
{
this.real=real;
this.img=img;
}
public void Add(Complex c1,Complex c2)
{
float areal,aimg;
areal=(c1.real+c2.real);
aimg=(c1.img+c2.img);
System.out.println("Additon Is :"+areal+"+"+aimg+"i");
} 

public void Sub(Complex c1,Complex c2)
{
float sreal,simg;
sreal=(c1.real-c2.real);
simg=(c1.img-c2.img);
System.out.println("Substraction Is :"+sreal+"+("+simg+")si");
} 

public void Multiply(Complex c1,Complex c2)
{
float mreal,mimg;
mreal=(c1.real*c2.real-c1.img*c2.img);
mimg=(c1.real*c2.img+c2.real*c1.img);
System.out.println("Multiplication Is :"+mreal+"+"+mimg+"i");
} 


void Divide(Complex c1,Complex c2)
{
float dreal,dimg,deno;
deno=(c2.real*c2.real+c2.img*c2.img);
dreal=(c1.real*c2.real+c1.img*c2.img)/deno;
dimg=(c2.real*c1.img-c1.real*c2.img)/deno;
System.out.println("Division Is:"+real+ "/"+deno+ "+" +img+ "i"+"/"+deno);
}
} //Class Complex end here


public class Driver {
public static void main(String[] args) {
int ch=0;
float num1,num2,num3,num4; 
Scanner input=new Scanner(System.in);

System.out.println("Enter First Number :");
num1=input.nextFloat();
num2=input.nextFloat(); 
Complex CO1=new Complex(num1,num2);

System.out.println("Enter Second Number:");
num3=input.nextFloat();
num4=input.nextFloat(); 
Complex CO2=new Complex(num3,num4);

Complex CO3=new Complex();

do
{
System.out.println("\n----------MENU----------");
System.out.println(" 1.Add");
System.out.println(" 2.Subtract");
System.out.println(" 3.Multiply");
System.out.println(" 4.Divide");
System.out.println(" 5.Exit");
System.out.println(" Enter Your Choice");
ch=input.nextInt();
switch(ch)
{
case 1:
CO3.Add(CO1,CO2);
break;
case 2:
CO3.Sub(CO1,CO2);
break;
case 3:
CO3.Multiply(CO1,CO2);
break;
case 4:
CO3.Divide(CO1,CO2);
break;
case 5:
System.out.println("\n Wrong Choice!!!");
return;
} //switch end
}while(ch!=5); //do-while end
}
} //main end


