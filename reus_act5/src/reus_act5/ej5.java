package reus_act5;

import javax.swing.JOptionPane;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;
		
		n1= Integer.parseInt(JOptionPane.showInputDialog("introduce el numero"));
		
		if (n1%2==0) {
			
			System.out.println("es divisble entre 2");
	
		}else {
			System.out.println("no es divisible");
		}
		
	}

}
