package p1;
import java.util.Scanner;
import java.util.Arrays;/**
 * 
 */


/**
 * @author Soheb
 *
 */
/*Write a program to check if the given string anagram or not.
 * Anagram : An anagram is the string that are comprising of same character sets.
 */


/*Steps involved
 * 1.collect the strings
 * 2.convert the string into character array
 * 3.sort the arrays
 * 4.compare the arrays
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step-1
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string1");
		String s1=sc.next();
		System.out.println("enter the string2");
		String s2=sc.next();
		
		//step2
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		// step-3
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		//step-4
		if(Arrays.equals(c1, c2))
			System.out.println("Anagram");
		else 
			System.out.println("Not Anagram");
		sc.close();
	}

}
