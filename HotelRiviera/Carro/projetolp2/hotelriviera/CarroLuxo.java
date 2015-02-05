package projetolp2.hotelriviera;

/**
 * Classe do tipo Carro. Tipo de carro com diaria de maior valor.
 * @author Dandara Maria, Pedro Paulo, Paulo Vinicius.
 *
 */
public class CarroLuxo extends Carro {
	private final static double DIARIA_CARRO_LUXO = 100;
	
	/**
	 * Construtor da classe.
	 * @param tanque Se o carro for alugado com tanque cheio este parametro eh True, caso contrario False.
	 * @param seguroCarro Se o carro for alugado com seguro este parametro eh True, caso contrario False.
	 */
	public CarroLuxo(boolean tanque, boolean seguroCarro) {
		super(DIARIA_CARRO_LUXO, tanque, seguroCarro);
	}

	@Override
	public double totalAPagar() {
		double valorAPagar = 0; 
		if (isSeguro()) valorAPagar += SEGURO;
		if (isTanqueCheio()) valorAPagar += TANQUE_CHEIO;
		valorAPagar += DIARIA_CARRO_LUXO;
		
		return valorAPagar;
	}
	
	@Override
	public String toString(){
		return "Carro Luxo" + super.toString();
	}
}