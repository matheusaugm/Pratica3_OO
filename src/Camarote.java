public class Camarote extends Ingresso{
	String localizacao;
	double valorAdicional;
	String tipoIngresso = "Camarote";

	public Camarote(double reais, double valorAdicional, String localizacao) {
		super(reais);
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
	}
	public String infoCamarote(){
		return "Ingresso " + tipoIngresso + "com a localização em: " + localizacao + " por: R$" + super.getReais();

	}

}
