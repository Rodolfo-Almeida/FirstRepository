import java.util.Scanner;

public class EmptyCounter {

	public static void main(String[] args) {
		
		String str5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		str5 = input.nextLine();
		input.close();
		
		int count=0;
		
		for(int i=0; i<str5.length(); i++) {
			char ch1 = str5.charAt(i);
			if(ch1==' ') {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
