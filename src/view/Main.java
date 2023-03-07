package view;

import javax.swing.JOptionPane;

import Controller.KillController;

public class Main {

	public static void main(String[] args) {
		KillController killController = new KillController();

		int opc = 0;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n 1- Mostrar processos Ativos\n 2 - Matar processo\n 9 - fim"));
		switch(opc) {
	
		case 1: 
			killController.readProcess();
			break;
		case 2:
			String param = JOptionPane.showInputDialog("Digite a chamada por nome ou pid");
			killController.KillProcess(param, killController.os());
			break;
		case 9: 
			JOptionPane.showMessageDialog(null,"fim");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida!, digite 1,2 ou 9");		
		}
		}
		while(opc!= 9);
	}
}
