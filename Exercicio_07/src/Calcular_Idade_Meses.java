import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Calcular_Idade_Meses {

	public static void main(String[] args) {
		int i,dias,meses,anos = 0;
		int vet1[] = new int[3];
		String data_usr;
		String data_sys = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        String[] splitsys = data_sys.split("/");
        data_usr = JOptionPane.showInputDialog("Insira a sua data de nascimento\nEX:2007/04/02");
        String[] splitusr = data_usr.split("/");
        for(i = 0; i < 3; i++) {
        	vet1[i] = Integer.parseInt(splitsys[i]) - Integer.parseInt(splitusr[i]);
        }
        if(vet1[1] < 0) {
        	vet1[0] = vet1[0] - 1;
        	vet1[1] = vet1[1] *-1;
        	vet1[1] = (vet1[1] - 12);
        }
        if(vet1[2] < 0) {
        	vet1[1] = vet1[1] - 1;
        	vet1[2] = vet1[2] *-1;
        }
        anos = vet1[0] * 365;
        meses = vet1[1] * 30;
        dias = vet1[2];
        JOptionPane.showMessageDialog(null, "Parabens você viveu "+(anos + meses + dias)+"Dias");
    }
}
//falta resolver a questao dos dias e meses
//6692

