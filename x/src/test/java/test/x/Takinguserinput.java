package test.x;

import java.util.Scanner;
//(((((x1+x2)-x3)+x4)*x5)/x6)
public class Takinguserinput {
	int x1;
	int x2;
	int x3;
	int x4;
	int x5;
	int x6;
	int x7; 
	int x8;
	int x9;
	int x10;
	int x11;
public void userinput()
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter first number");
 x1= sc.nextInt();
System.out.println("Please enter Second number");
 x2=sc.nextInt();
System.out.println("Please enter third number");
 x3=sc.nextInt();
System.out.println("Please enter fourth number");
x4=sc.nextInt();
System.out.println("Please enter fifth number");
x5=sc.nextInt();
System.out.println("Please enter sixth number");
x6=sc.nextInt();
x7 = x1+x2;
System.out.println("Total of (x1+x2) =" + x7);
x8 = x7-x3;
System.out.println("Total of ((x1+x2)-x3) =" + x8);
x9 = x8+x4;
System.out.println("Total of ((x1+x2)-x3)+x4)="+x9);                          
x10=x9*x5;
System.out.println("Total of (((x1+x2)-x3)+x4)*x5) ="+x10);
x11 = x10/x6;
System.out.println("Total of ((((x1+x2)-x3)+x4)*x5)/x6)  ="+ x11);
}

public static void main(String[] args) 
{
Takinguserinput ta = new Takinguserinput();
ta.userinput();

}
}
