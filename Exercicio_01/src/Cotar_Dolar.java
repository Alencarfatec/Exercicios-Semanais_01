import javax.swing.JOptionPane;

public class Cotar_Dolar {

	public static void main(String[] args) {
		String dolar_hoje = "5.06";
		Double dolar_ajustado;
		Double resultado;
		int qtd;
		int reply = JOptionPane.showConfirmDialog(null, "Deseja alterar o valor do dolar?\nValor atual do dolar: $" + dolar_hoje, "Alterar valor do dolar", JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			dolar_hoje = (JOptionPane.showInputDialog("Digite o valor do dolar"));
			JOptionPane.showMessageDialog(null, "O Valor do dolar foi reajustado para: $"+ dolar_hoje);
		}else{
			JOptionPane.showMessageDialog(null,"O Valor do Dolar permaneceu em: $" + dolar_hoje); 
		}
		dolar_ajustado = Double.parseDouble(dolar_hoje);
		qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dolares: "));
		resultado = qtd * dolar_ajustado;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + resultado);
	}

}
