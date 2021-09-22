import java.util.Scanner;

/**
 * 
 */
//class is an area where you can write your data, methode,objects
/**
 * @author HELLO
 *
 */
public class Helloworld {
//when ever you have a public before a class then u call that as a main class
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////origin of any programming lang is main method
		System.out.println("hellow world");
		
		int num1, num2, sum;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter frist number");
		num1 = number.nextInt();
		
		System.out.println("Enter second number");
		num2 = number.nextInt();
		
		number.close();
		sum = num1+num2;
		System.out.println("sum is :- ");
		System.out.println(+sum);
		
		
	}

}
