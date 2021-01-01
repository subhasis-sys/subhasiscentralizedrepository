package test.x;

public class Methodprogram {

/* Method calling by using this keyword */

public void Method0()
{
	System.out.println("default method");
	}
public void Method1(int a)
{
	this.Method4(1, 2, 3, 4);
	this.Method0();
	this.Method2(1,2);
	this.Method3(1,2,3);
	System.out.println("1 parameter method");
	}
public void Method2(int a, int b)
{
	
	System.out.println("2 parameter method");
	}
public void Method3(int a, int b, int c)
{
	System.out.println("3 parameter method");
	}
public void Method4(int a, int b, int c, int d)
{
	System.out.println("4 parameter method");
	}
public static void main(String[] args) {
	
	Methodprogram M = new Methodprogram();
	M.Method1(5);
	
}

}
