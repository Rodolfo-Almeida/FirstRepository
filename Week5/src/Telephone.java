import javax.swing.JOptionPane;

public class Telephone {
	
	private String telephone;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	public boolean isFormatted(StringBuilder telephone) {
		
		boolean val = false;
		
		for(int i=0; i<telephone.length(); i++) {
			char ch1 = telephone.charAt(i);
			
			if((i==0 && ch1=='(') || (i==4 && ch1==')') || (i==8 && ch1=='-')) {
				JOptionPane.showMessageDialog(null, "It is not a valid customer number");
				val = true;				
			}
		}
		
		return val;
		
	}
	
	public StringBuilder unformat(StringBuilder telephone) {
		
		telephone.deleteCharAt(0);
		telephone.deleteCharAt(4);
		telephone.deleteCharAt(8);
		
		return telephone;
		
	}
	
}
