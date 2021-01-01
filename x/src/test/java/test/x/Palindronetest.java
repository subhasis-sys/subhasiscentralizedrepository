package test.x;

import java.util.Scanner;

public class Palindronetest {
	
	public void palindrone()
	{
		 int r,sum=0,temp,n;    
		   
		  System.out.println("Please enter a number");
		  Scanner sc = new Scanner(System.in);
		  n=sc.nextInt();
		  temp=n; 
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

	

	
	public static void main(String args[])
	{  
		Palindronetest pa = new Palindronetest();
		pa.palindrone();
}
}  
