import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
		str.append(input.nextLine());

		char ch1 = str.charAt(0);
		char ch2;
		
		for(int i=0; i<str.length();i++) {
			ch2 = str.charAt(i);
			
			if(Character.isWhitespace(ch2)) {
				str.insert(i, ch1 + "ay ");
				ch1 = str.charAt(i+4);
			}
			
		}
		
		System.out.println(str);
		
		
	}

}
