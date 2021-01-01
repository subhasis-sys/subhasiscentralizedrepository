package test.x;

public class Thissuperconstructorprogram {
	public Thissuperconstructorprogram() {
		this(1,2);

		System.out.println("default parent constructor");
	}
     
	public Thissuperconstructorprogram(int a)
	{
		this(1,2,3);
		System.out.println("1 parametrized parent constructor");
	}

	public Thissuperconstructorprogram(int a, int b) {
		System.out.println("2 parameterized parent construcor");
	}

	public Thissuperconstructorprogram(int a, int b, int c) 
	{
		this(1,2,3,4);
		System.out.println("3 parameterized parent constuctor");
	}

	public Thissuperconstructorprogram(int a, int b, int c, int d) {
		this();
		System.out.println("4 parameterized constructor");
	}

}
