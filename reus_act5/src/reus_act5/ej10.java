package reus_act5;

import javax.swing.JOptionPane;

public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double compras,precio, resultado = 0;
		int i;
		
		compras= Double.parseDouble(JOptionPane.showInputDialog("introduce el numero de productos comprados"));

		for (i=0;i<compras;i++) {
			
			precio= Double.parseDouble(JOptionPane.showInputDialog("introduce el numero de productos comprados"));

			resultado = resultado + precio;
			System.out.println(resultado + " euros");

		}
		
		System.out.println("tiene que pagar " + resultado + " euros");
	}

}
