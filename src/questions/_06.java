package questions;
import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		// Write a Java program that takes a number as input and prints its multiplication table upto 10
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(a+"x"+i+"="+a*i);
		}
		sc.close();
}
}