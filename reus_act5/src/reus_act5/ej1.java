package reus_act5;

import javax.swing.JOptionPane;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1, n2;
		
		n1= Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));
		n2= Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo numero"));
		
		if (n1!=n2) {
			
			System.out.println(Math.max(n1, n2));
	
		}else {
			System.out.println("las dos variables son iguales ");
		}
		
		
	}

}
