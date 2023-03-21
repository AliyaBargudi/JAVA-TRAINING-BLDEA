package p1;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author Soheb
 *
 */
public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the age ");
      int n=sc.nextInt();
     if(n<18)
    	 System.out.println("you are a minor");
     else if(n>65)
    	 System.out.println("you are senior citizen");
     else
      System.out.println("congratulations:) you are eligible for marrage");
     sc.close();
      }
}
     


