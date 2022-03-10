import javax.swing.JOptionPane;

public class Calcular_Salario {

	public static void main(String[] args) {
		Double salario,reajuste,total = 0.0;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salario mensal: "));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de reajuste: "));
		total = ((salario * reajuste)/100) + salario;
		JOptionPane.showMessageDialog(null, "Salario atual R$"+salario+"\nPercentual de reajuste "+reajuste+"%\nSalario reajustado R$"+ total);
	}

}
