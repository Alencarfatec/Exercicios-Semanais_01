import javax.swing.JOptionPane;

public class Calcular_idade_Anos {

	public static void main(String[] args) {
		int idade = 0;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade em anos: "));
		JOptionPane.showMessageDialog(null, "Você viveu "+(idade * 365)+" dias");
	}

}
