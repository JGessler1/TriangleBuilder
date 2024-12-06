package triangleNumbers;

import java.util.Scanner;
public class triangleNumbers {

	public static void main(String[] args) {
		String piece = "*";
		Scanner scan = new Scanner(System.in);
		System.out.println("how big do you want the triangle");
		int number = scan.nextInt();
		if(number < 1 ) {
			System.out.println("thats not a valid number");
		}
		for (int i = 1 ; i <= number ; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(piece);
			}
			System.out.println("\n");

		
		}
		
		for (int m = number - 1 ; m >= 0 ; m--) {
			
			for (int n = 1; n <= m ; n++) {
				System.out.print(piece);
			}
			System.out.println("\n");
			}
		
			

		
		

	}

}
