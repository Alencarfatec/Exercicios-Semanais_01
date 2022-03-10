import javax.swing.JOptionPane;

public class Calcular_Venda {

	public static void main(String[] args) {
		Double salario,comissao,adicional,total_vd,comissao_vt = 0.0;
		int qtd_vd = 0;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salario: "));
		comissao = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da comissao fixa por carro vendido: "));
		qtd_vd = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de carros vendidos: "));
		total_vd = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total das vendas "));
		comissao_vt = comissao * qtd_vd;
		adicional = (total_vd * 5)/100;
		JOptionPane.showMessageDialog(null, "O salario fixo é R$"+salario+"\nO valor da comissao por carro vendido é R$"+comissao+"\nForam vendidos "+qtd_vd+" carros\nO valor total das vendas foi R$"+total_vd+"\nO valor total da comissao foi R$"+comissao_vt+"\nO bonus de 5% do valor total das vendas foi igual a R$ "+adicional+"\nO salario total é R$"+(salario+comissao_vt+adicional));
		
		

	}

}
