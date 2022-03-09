import javax.swing.JOptionPane;

public class Calcular_Quadrado {

	public static void main(String[] args) {
		Double vet1[] = new Double[4];
		Double resultado = 0.0;
		int i, j = 1;
		for(i = 0; i < 4; i++){
			vet1[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + j + "º Numero"));
			vet1[i] = Math.pow(vet1[i], 2);
			resultado = vet1[i] + resultado;
 			j++;
		}
		JOptionPane.showInternalMessageDialog(null, "O Resultado dos numeros inseridos elevados ao quadrado e somados é: " + resultado);
	}

}
