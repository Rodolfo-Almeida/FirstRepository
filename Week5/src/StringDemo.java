import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "hello";
		//String str2 = "hello";
		String str2;
		
		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		str2 = input.nextLine();
		
		if(str1==str2) { //we cannot use "==" - we have to use str1.equals(str2) (like below)
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		System.out.println("String 1 " + str1.hashCode() + "\nString 2 " + str2.hashCode());
		
		System.out.println();
		String str3 = new String("Hi"); //we can also initialize String with the simpler way (above) and the if method below (with equals) will work the same way
		String str4 = new String("Hi");
		
		if(str3.equals(str4)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		System.out.println();
		System.out.println(str3.indexOf('i'));
		System.out.println(str3.charAt(0));
		System.out.println("Rodolfo".charAt(2));
		
		/*exercise in class
		
		String str5;
		System.out.println("Enter a string");
		str5 = input.nextLine();
		int count=0;
		
		for(int i=0; i<str5.length(); i++) {
			char ch1 = str5.charAt(i);
			if(ch1==' ') {
				count++;
			}
		}
		
		System.out.println(count);
		
		*/
		
		System.out.println();
		System.out.println("Hello World!!".replace("!!", "?"));
		
		System.out.println();
		int x = 10;
		String str6 = Integer.toString(x);
		System.out.println(str6);
		
		//--- Override ToString
		
		System.out.println();
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Rodolfo");
		System.out.println(s1);
		System.out.println(s1.toString());
		
		// --- RegionMatches
		
		System.out.println();
		String firstString = "123 Maple Drive";
		String secondString = "a maple tree";

		boolean answer = firstString.regionMatches(true, 4, secondString, 2, 5);
		System.out.println(answer);
		
		answer = firstString.regionMatches(4, secondString, 2, 5);
		System.out.println(answer);
		
		//--- ParseInt and ValueOf
		
		System.out.println();
		System.out.println(Integer.parseInt("123"));

		System.out.println();
		System.out.println(Integer.valueOf("123"));
		System.out.println(Integer.valueOf(123));
		System.out.println((Integer.valueOf(123)).intValue());
		
		//--- StringBuilder and StringBuffer
		
		System.out.println();
		StringBuilder str7 = new StringBuilder("Hello");
		System.out.println(str7.length());
		System.out.println(str7.capacity());
		
		System.out.println();
		StringBuilder first_string = new StringBuilder("Hello");

		first_string.append("world");
		System.out.println("The string is " + first_string);

		first_string.insert(5, " ");
		System.out.println("The string is " + first_string);

		System.out.println("The character at position 4 is " + first_string.charAt(4));

		first_string.setCharAt(6, 'W');
		System.out.println("The string is " + first_string);

		first_string.replace(0, first_string.length(),"Learning Java!");  
		System.out.println("The string is " + first_string);

		first_string.deleteCharAt(first_string.length()-1);
		System.out.println("The string is " + first_string);
		first_string.delete(0, first_string.length());
		System.out.println("The string is " + first_string);

		
	}

}
