package reus_act5;

import javax.swing.JOptionPane;

public class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dia = JOptionPane.showInputDialog("introduce en que dia estamos");

		switch (dia) {
			case "lunes":	
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("efectivamente estamos a "+ dia+" y es dia laboral");
				break;
			
			case "sabado":
			case "domingo":
				System.out.println("efectivamente estamos a " + dia+ " y no es laboral");
				break;
	
			default:
				System.out.println("el dia introducido no existe");
				break;
		}
		
	}

}
