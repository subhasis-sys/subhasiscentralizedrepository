package test.x;

public class Swappingwith3rdvariable 
{
	
	int a =5;
	int b =6;
	int c;
	public void swappingmethod()
	{

	c=a;
	a=b;
	b=c;
	System.out.println("Value of a =" +a);
	System.out.println("Value of b =" + b);
	}
	public static void main(String[] args) 
	{
Swappingwith3rdvariable	sw = new Swappingwith3rdvariable();
   sw.swappingmethod();
	}
}
