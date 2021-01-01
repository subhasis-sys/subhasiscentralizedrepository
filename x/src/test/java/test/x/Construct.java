package test.x;

public class Construct {
	
	public Construct()
	{
	this(1,2,3,4);
		System.out.println("default constructor");
	}
	public Construct(String s)
	
	{
		this();
		System.out.println("1 parameter constructor");
	}
	public Construct(int a, int b)
	{
		this(1,2,3);
		
		System.out.println("2 parameter constructor");
	}
	public Construct(int a, int b, int c)
	{
	this("subhasis");
		System.out.println("3 parameter constructor");
	}
	public Construct(int a, int b, int c, int d)
	{
		
		System.out.println("4 parameter constructor");
	}
public static void main(String[] args) {
	
	Construct con = new Construct(1,2);
	
	
}
}
