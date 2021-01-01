package test.x;

public class Thissuperinheritanceprogram extends Thissuperconstructorprogram  {
	
	public Thissuperinheritanceprogram()
	{ 
		super(4);
		System.out.println("default child constructor");
	}
	public Thissuperinheritanceprogram(int a)
	{
		this();
		
		System.out.println("1 parameterized child constructor");
	}
	public Thissuperinheritanceprogram(int a, int b)
	{
		this(1,2,3);
		System.out.println("2 parameterized child constructor");
	}
	public Thissuperinheritanceprogram(int a, int b, int c)
	{
		this(1);
		System.out.println("3 parametrized child constructor");
	}
	public Thissuperinheritanceprogram(int a, int b, int c, int d)
	{
		this(1,2);
		System.out.println("4 parameterized child constructor");
	}
	
	public static void main(String[] args) {
		
		Thissuperinheritanceprogram program = new Thissuperinheritanceprogram(1,2,3,4);
		
	} 
		
			
	
	}


