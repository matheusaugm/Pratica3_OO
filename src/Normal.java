public class Normal extends Ingresso{
	String normal = "Normal";

	public Normal(double reais) {
		super(reais);
	}

	public String valorIngressoNormal(){

		return "Ingresso "+normal+" R$"+super.getReais();
	}


}
