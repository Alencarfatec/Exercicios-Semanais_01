import javax.swing.JOptionPane;

public class Calcular_area {

	public static void main(String[] args) {
		Double altura,largura = 0.0;
		altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do retangulo: "));
		largura = Double.parseDouble(JOptionPane.showInputDialog("Insira a largura do retangulo: "));
		JOptionPane.showMessageDialog(null, "A area do retangulo é de: "+(altura * largura));
	}
}
