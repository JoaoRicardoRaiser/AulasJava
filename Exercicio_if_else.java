import javax.swing.JOptionPane;

public class Exercicio_if_else {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1� nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2� nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3� nota"));
		double media;
		media = ((nota1 + nota2 + nota3) / 3);
		
		if (media < 6) {
			JOptionPane.showMessageDialog(null, "Reprovado anta");
		}

	}

}
