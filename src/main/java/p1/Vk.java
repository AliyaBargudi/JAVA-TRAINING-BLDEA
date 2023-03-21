package p1;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Soheb
 *
 */
public class Vk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		
			for(int j=0;j<n;j++)
			{
				if(i==j&&i<=(n/2)||((i+j)==(n-1)&&j>=(n/2)))
			      System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0 ||(i+j)==(n/2)||(i-j)==n/2)
			      System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}
		sc.close();
	}

}
