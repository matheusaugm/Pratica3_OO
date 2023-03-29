public class Vip extends Ingresso {
	String vip = "VIP";
	Double valorAdicional;

	public Vip(Double reais, double valorAdicionalIngresso) {

		super(reais);
		this.valorAdicional = valorAdicionalIngresso;
	}
	public String valorIngressoVip(){
		double valorIngresso=valorAdicional + super.getReais();

		return "Ingresso "+vip+" : R$"+valorIngresso;
	}

}
