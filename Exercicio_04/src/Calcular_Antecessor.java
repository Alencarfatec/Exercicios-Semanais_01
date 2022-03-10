import javax.swing.JOptionPane;

public class Calcular_Antecessor {

	public static void main(String[] args) {
		int num1 = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		JOptionPane.showMessageDialog(null, "O numero digitado foi o numero: "+num1+"\nSeu sucessor é o numero: "+(num1 + 1)+"\nSeu antecessor é o numero: "+(num1 - 1));
	}
}
