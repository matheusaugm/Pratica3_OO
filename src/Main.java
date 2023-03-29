import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Normal ingressoNormal = null;
		Vip ingressoVip = null;
		Camarote ingressoCamarote = null;
		Double valorIngresso;
		Double valorAdicional;
		String localizacao;
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual ingresso tem interesse\n(1). Ingresso Normal\n(2). VIP\n(3). Camarote"));
		switch(opcao){
			case 1 -> {
				valorIngresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso"));
				ingressoNormal = new Normal(valorIngresso);
				JOptionPane.showMessageDialog(null,ingressoNormal.valorIngressoNormal());
			}
			case 2 -> {
				valorIngresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso"));
				valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional do ingresso"));
				ingressoVip = new Vip(valorIngresso, valorAdicional);
				JOptionPane.showMessageDialog(null,ingressoVip.valorIngressoVip());

			}
			case 3 ->{
				valorIngresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso"));
				valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional do ingresso"));
				localizacao = JOptionPane.showInputDialog("Digite a localizacação:");
				ingressoCamarote = new Camarote(valorIngresso, valorAdicional, localizacao);
				JOptionPane.showMessageDialog(null,ingressoCamarote.infoCamarote());

			}


		}
	}
}
