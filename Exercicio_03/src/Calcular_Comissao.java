import javax.swing.JOptionPane;

public class Calcular_Comissao {

	public static void main(String[] args) {
		Double preco_unitario,valor_total,comissao = 0.0;
		String nome_peca;
		int qtd_venda = 0;
		nome_peca = JOptionPane.showInputDialog("Qual o nome da peça? ");
		preco_unitario = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da peça: "));
		qtd_venda = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade vendida: "));
		valor_total = preco_unitario * qtd_venda;
		comissao = valor_total * 0.05;
		JOptionPane.showMessageDialog(null, "Foram vendidas "+qtd_venda+" unidades da peça "+nome_peca+"\nValor total da venda: R$"+valor_total+"\nValor da comissão: R$"+comissao);
	}

}
