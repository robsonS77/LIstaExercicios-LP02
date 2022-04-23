package listaExerciciosLP02;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PlanoSaude {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = 0;
		
		String nome = JOptionPane.showInputDialog("Informe o nome do segurado: ");
		double idade = Double.parseDouble(JOptionPane.showInputDialog("Informe a idade do segurado: "));
		
		if (idade <= 10) {
			valor = 30.00;
			JOptionPane.showMessageDialog(null, "Valor do plano para o segurado "+nome+" é R$"+valor);
		}
		if (idade > 10 && idade < 30) {
			valor = 60.00;
			JOptionPane.showMessageDialog(null, "Valor do plano para o segurado "+nome+" é R$"+valor);
		}
		if (idade > 29 && idade < 46) {
			valor = 120.00;
			JOptionPane.showMessageDialog(null, "Valor do plano para o segurado "+nome+" é R$"+valor);
		}
		if (idade > 45 && idade < 60) {
			valor = 150.00;
			JOptionPane.showMessageDialog(null, "Valor do plano para o segurado "+nome+" é R$"+valor);
		}
		if (idade > 59 && idade < 66) {
			valor = 250.00;
			JOptionPane.showMessageDialog(null, "Valor do plano para o segurado "+nome+" é R$"+valor);
		}
		if (idade > 65) {
			valor = 400.00;
			JOptionPane.showMessageDialog(null, "Valor do plano para o segurado "+nome+" é R$"+valor);
		}
		
		sc.close();
	}
	
}
