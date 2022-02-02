import javax.swing.JOptionPane;

public class StringTest {

	public static void main(String[] args) {

		String str = new String();
		str = validateLeng();
		
		for(int i=0; i<str.length()-4; i++) {
			char ch1 = str.charAt(i);
			if(!Character.isLetter(ch1)) {
				JOptionPane.showMessageDialog(null, "It is not a valid customer number");
				str = validateLeng();				
			}
		}
		
		for(int i=3; i<6; i++) {
			char ch1 = str.charAt(i);
			if(!Character.isDigit(ch1)) {
				JOptionPane.showMessageDialog(null, "It is not a valid customer number");
				str = validateLeng();				
			}
		}
		
		System.out.println(str);

	}
	
	public static String validateLeng() {
		
		String str;
		
		str = JOptionPane.showInputDialog(null,"Enter a customer number in the form LLLNNNN"
				+ "\n(LLL = letters and NNNN = numbers)");
		
		while(str.length()<7 || str.length()>7) {
			JOptionPane.showMessageDialog(null, "It is not a valid customer number");
			str = JOptionPane.showInputDialog(null,"Enter a customer number in the form LLLNNNN"
					+ "\n(LLL = letters and NNNN = numbers)");
		}
		
		return str;
		
	}

}
