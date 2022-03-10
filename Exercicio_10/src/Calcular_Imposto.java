import javax.swing.JOptionPane;

public class Calcular_Imposto {

	public static void main(String[] args) {
		int distr = 28,impos = 45;
		Double preco = 0.0;
		Double total;
		preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de fabrica do carro"));
		total = (preco * (distr+impos)/100) + preco;
		JOptionPane.showMessageDialog(null, "O valor de fabrica é R$"+preco+"\nO percentual do distribuidor é "+distr+"%\nO percentual de imposto é "+impos+"%\nO valor total do é R$"+total);
	}

}
