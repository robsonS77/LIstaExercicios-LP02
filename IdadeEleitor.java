package listaExerciciosLP02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IdadeEleitor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
		
		if(idade < 16) {
			JOptionPane.showMessageDialog(null,"Idade igual a "+idade+"\nNão-eleitor!!");
		}
		if (idade >=18 && idade <=65) {
			JOptionPane.showMessageDialog(null,"Idade igual a "+idade+"\nEleitor obrigatório!!");
		}
		if (idade >= 16 && idade <18 || idade > 65) {
			JOptionPane.showMessageDialog(null,"Idade igual a "+idade+"\nEleitor facultativo!!");
		}
		
		sc.close();
	}

}
