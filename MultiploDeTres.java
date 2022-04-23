package listaExerciciosLP02;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Robson
 *
 */
public class MultiploDeTres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			
			if (numero % 3 == 0) {
				JOptionPane.showMessageDialog(null, + numero +" é multiplo de 3!! ");
			}
			else {
				JOptionPane.showMessageDialog(null, + numero + " não é multiplo de 3!!");
			}

		sc.close();
	}
}
