import javax.swing.JOptionPane;

public class Exercicio_if_else_2 {

	public static void main(String[] args) {
		double glicose;
		
		glicose = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da glicose"));
		
		
		if (glicose <= 100) {
			JOptionPane.showMessageDialog(null, "Sua glicose est�: NORMAL");
		}else if (glicose < 100  | glicose <= 140) {
			JOptionPane.showMessageDialog(null, "Sua glicose est�: ALTA"); 
		}else {
			JOptionPane.showMessageDialog(null, "Sua glicose est�: PUTA QUE PARIO");
		}

	}

}
