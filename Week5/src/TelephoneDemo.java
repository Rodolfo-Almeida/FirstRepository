import java.util.Scanner;

public class TelephoneDemo {

	public static void main(String[] args) {
		
		StringBuilder telephone = new StringBuilder("");
		String str;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an unformatted telephone number:");
		str = input.nextLine();
		telephone.append(str);
		
		Telephone telOne = new Telephone();
		telOne.setTelephone(telephone);
		
		telOne.isFormatted();
		System.out.println(telOne.format());
		
		System.out.println("Enter a formatted telephone number:");
		str = input.nextLine();
		telephone.append(str);
		input.close();
		
		Telephone telTwo = new Telephone();
		telTwo.setTelephone(telephone);
		
		telTwo.isFormatted();
		System.out.println(telTwo.unformat());

	}

}
