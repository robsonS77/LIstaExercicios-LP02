package listaExerciciosLP02;
 
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LucroProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double valorFinal = 0;
	
		String nomeProduto = JOptionPane.showInputDialog("Nome do produto: ");
		
		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: "));
		
		if (valorProduto < 20) {
			
			valorFinal = valorProduto + (valorProduto * 45 / 100);
			JOptionPane.showMessageDialog(null, String.format("%s custa %.2f",nomeProduto, valorFinal ));
		}
		else {
			
			valorFinal = valorProduto + (valorProduto * 30 / 100);
			JOptionPane.showMessageDialog(null, String.format("%s custa %.2f",nomeProduto, valorFinal));
		}
		
		sc.close();
	}

}
