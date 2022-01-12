package reus_act5;

import javax.swing.JOptionPane;

public class ej6 {

	final public static double iva = 0.21;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1,  precio;
		n1= Double.parseDouble(JOptionPane.showInputDialog("introduce el precio"));


		precio = n1+ n1*iva;
		
		System.out.println("el resultado es de "+ precio);
		
	}

}
