import javax.swing.JOptionPane;

public class Telephone {
	
	private StringBuilder telephone;
	private boolean val;

	public StringBuilder getTelephone() {
		return telephone;
	}

	public void setTelephone(StringBuilder telephone) {
		this.telephone = telephone;
	}
	
	
	public void isFormatted() {
		
		val = true;
		
		for(int i=0; i<telephone.length(); i++) {
			char ch1 = telephone.charAt(i);
			
			if((i==0 && ch1!='(') || (i==4 && ch1!=')') || (i==8 && ch1!='-')) {
				val = false;				
			}
		}
		
		if(val==true) {
			JOptionPane.showMessageDialog(null, "It is formatted");
		} else if(val==false) {
			JOptionPane.showMessageDialog(null, "It is not formatted");
		}
		
	}
	
	public StringBuilder unformat() {
		
		if(val==true) {
			telephone.deleteCharAt(8);
			telephone.deleteCharAt(4);
			telephone.deleteCharAt(0);
		}
		
		return telephone;
		
	}
	
	public StringBuilder format() {
		
		if(val==false) {
			telephone.insert(0, '(');
			telephone.insert(4, ')');
			telephone.insert(8, '-');
		}
				
		return telephone;
		
	}
	
}
