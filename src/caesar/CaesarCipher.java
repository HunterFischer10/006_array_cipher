package caesar;

public class CaesarCipher {
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz";
	
	public String encode(String plainText, int key) {
		String codedWord= "";
		
		System.out.println("test alpha length = " + alpha.length());
		System.out.println("test, first char is: " + alpha.charAt(0));
		System.out.println("test, last char is: " + alpha.charAt(alpha.length()-1));
		
		//for (int i = 0; i < alpha.length(); i++) {
		//	System.out.println(alpha.charAt(i));
		//}
		
		System.out.println("\n\n\n\n\n");
		
		for (int i = 0; i < plainText.length(); i++) {
			int inx = alpha.indexOf(plainText.charAt(i));
			inx = inx + key;
			if (inx > 25){
				inx = inx - 26;
			}
		
		codedWord += alpha.charAt(inx);
		

	}
		return codedWord;
	}
	
	/* 
	 * each char that I read from plainText I find the index in alpha
	 * for example, read A look up index for A get 0
	 * 				read M look up index for M get 12
	 * then, add key to that index, so A index 0 becomes 0+key,
	 * and 0+key becomes my coded char
	 * let's say key = 1, then A index 0, 0 + 1 = 1, charAT 1 is B
	 * and that is my encoding
	 */

}
