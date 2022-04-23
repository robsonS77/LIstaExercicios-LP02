package listaExerciciosLP02;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdemCrescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int aux1 = 0, aux2 = 0, aux3 = 0;

		for (int i = 0; i < 3; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número: "));

			if (num > aux1) {
				aux3 = aux2;
				aux2 = aux1;
				aux1 = num;
			} 
			else if (num > aux2) {
				aux3 = aux2;
				aux2 = num;
			} 
			else {
				aux3 = num;
			}
		}
		JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + aux3 + " - " 
		+ aux2 + " - " + aux1);

		sc.close();
	}

}
