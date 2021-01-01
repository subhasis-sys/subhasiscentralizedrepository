package test.x;

public class Swappingwithoutusing3rdvariable {
	
	
		int a =5;
		int b =6;
		int c;
		public void swappingmethod()
		{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a =" +a);
		System.out.println("Value of b =" + b);
		}
		public static void main(String[] args) 
		{
			Swappingwithoutusing3rdvariable	sw = new Swappingwithoutusing3rdvariable();
	   sw.swappingmethod();
		}
	}

	
