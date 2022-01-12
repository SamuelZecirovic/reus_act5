package reus_act5;

import javax.swing.JOptionPane;

public class Calculadorainversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String operacion;
		int n1, n2;
		double resultado;
		
		n1= Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));
		n2= Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo numero"));

		operacion = JOptionPane.showInputDialog("que operacion desea realizar (+,-,*,/,elevar,%)");
		
		switch (operacion) {
		case "+":
			resultado = n1 + n2;
			System.out.println("el resultado de sumarlos es: " + resultado);
			break;
			
		case "-":
			resultado = n1 - n2;
			System.out.println("el resultado de restarlos es: " + resultado);
			break;

		case "*":
			resultado = n1 * n2;
			System.out.println("el resultado de multiplicarlo es: " + resultado);
			break;
			
		case "/":
			resultado = n1 / n2;
			System.out.println("el resultado de dividirlo es: " + resultado);
			break;
			
		case "elevar":
			resultado = Math.pow(n1, n2);
			System.out.println("el resultado de elevarlo es: " + resultado);
			break;
			
		case "%":
			resultado = n1 % n2;
			System.out.println("el resultado de modular es: " + resultado);
			break;
		default:
			System.out.println("no existe la operacion, escoje una de las existentes");
			break;
		}

		
	}

}
