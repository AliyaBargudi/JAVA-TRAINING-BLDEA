package p1;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author Soheb
 *
 */
public class Program6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int count;
		for(int i=1;i<=n;i++)
		{
			count=1;
			for(int j=1;j<=i;j++)
			{
			 System.out.print(count+" ");
			 count++;
			}
			System.out.println();
		}
		sc.close();
	}

}
