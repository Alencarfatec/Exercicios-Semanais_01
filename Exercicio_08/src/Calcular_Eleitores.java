import javax.swing.JOptionPane;

public class Calcular_Eleitores {

	public static void main(String[] args) {
		int eleitores,nulos,brancos,validos = 0;
		eleitores = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de eleitores"));
		nulos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de nulos"));
		brancos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de brancos"));
		validos = eleitores - (nulos + brancos);
		validos = (validos * 100)/eleitores;
		nulos = (nulos * 100)/eleitores;
		brancos = (brancos * 100)/eleitores;
		JOptionPane.showMessageDialog(null, "A quantidade total de eleitores foi "+eleitores+"\nO percentual de votos nulos foi igual a "+nulos+"%\nO percentual de votos brancos foi igual a "+brancos+"%\nO percentual de votos validos foi igual a "+validos+"%");
	}

}
