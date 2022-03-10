import javax.swing.JOptionPane;

public class Calcular_Idade_Meses {

	public static void main(String[] args) {
		int anos,meses,dias,total = 0;
		anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses você tem?"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias você tem?"));
		total = (anos * 365)+(meses * 30)+dias;
		JOptionPane.showMessageDialog(null, "Parabens você viveu "+total+" dias");
	}
}


