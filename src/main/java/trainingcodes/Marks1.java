
/**
 * 
 */
package trainingcodes;
import java.util.Scanner;
/**
 * @author Soheb
 *
 */
public class Marks1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the count of students");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	System.out.println("enter the marks of student" + (i+1));
	a[i]=sc.nextInt();
	}
for(int i=0;i<n;i++)
{
	System.out.println("The marks of student" + (i+1)+"is :"+a[i]);
	
	}
sc.close();
	}
}
