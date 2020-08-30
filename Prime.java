/* To check if a number is prime or not */
package Assignments;
import java.util.Scanner;

class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert any number");
		int num = sc.nextInt();

		boolean isPrime = true;

		for(int i = 2; i<num; i++){
			if(num%i==0){
			isPrime = false;
			break;
			}
		}
			
		if(isPrime){
			System.out.println(num + " is a Prime Number.");
		}
		else{
			System.out.println(num + " is not a Prime Number.");
		}	
	}
}