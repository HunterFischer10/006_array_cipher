package caesar;

import java.util.Scanner;

public class BeginHere {

	public static void main(String[] args) {
		Scanner kdb = new Scanner(System.in);
		
		CaesarCipher myCipher = new CaesarCipher();
		
		System.out.println("Please enter the plain text to encode:");
		String plainText = kdb.nextLine().toLowerCase();
		
		System.out.println("Please enter the key: ");
		int key = kdb.nextInt();
		System.out.println("Your key is: " + key);
		
		String codedText = myCipher.encode(plainText, key);
		System.out.println("Your secret message is: " + codedText);

	}

}
