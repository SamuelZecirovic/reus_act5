package reus_act5;

import javax.swing.JOptionPane;

public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contraseņa = "contraseņa",intento;
		int i = 1;
		do {
			intento = JOptionPane.showInputDialog("introduce la contraseņa 'contraseņa'");

			if (intento.equals(contraseņa)) {
				System.out.println("la contraseņa es correcta");
				i = 4;
			}else {
			System.out.println("la contraseņa es incorrecta, intento numero "+ i);
			i++;
			if(i==4) {
				System.out.println("ha sobrepasado los intentos");
				}
			}
			
		}while (i <= 3);
		
		
		
	}

}
