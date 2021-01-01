package test.x;

public class Methodchainingb extends Methodchaininga
{
public void test5()
{
	super.test4(1, 2, 3, 4);
System.out.println("default child method");
}
public void test6(int a)
{
this.test8(1, 2, 3);
System.out.println(" 1 parameterized child method");	
}

public void test7(int a, int b)
{
	this.test6(1);
System.out.println("2 parametrized child method");
}
public void test8(int a, int b, int c)
{
	this.test5();                      
System.out.println("3 parameterized child method");	
}
public void test9(int a, int b, int c, int d)
{
	this.test7(1, 2);
System.out.println("4 parametrized child method");	
}

public static void main(String[] args) {

	Methodchainingb Me = new Methodchainingb();
	Me.test9(1,2,3,4);
	
	
}

}

	

