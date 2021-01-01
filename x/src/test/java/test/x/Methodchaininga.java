package test.x;

public class Methodchaininga {
	
public void test()
{
	this.test3(1, 2, 3);
	System.out.println("parent default method");

}
public void test1(int a)
{
	this.test();
	System.out.println("1 prameterized method");
}
public void test2(int a, int b)
{
	this.test1(2);
System.out.println("2 parameterized method");
}
public void test3(int a, int b, int c)
{
System.out.println("3 parameterized method");
}
public void test4(int a, int b, int c, int d)
{
	this.test2(1, 2);
System.out.println("4 parameterized method");
}
}
