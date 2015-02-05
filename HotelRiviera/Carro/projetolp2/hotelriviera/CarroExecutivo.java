package projetolp2.hotelriviera;

/**
 * Classe do tipo Carro. Tipo de carro com diaria de menor valor.
 * @author Dandara Maria, Pedro Paulo, Paulo Vinicius.
 *
 */
public class CarroExecutivo extends Carro {
	private final static double DIARIA_CARRO_EXECUTIVO = 60;
	
	/**
	 * Construtor da classe.
	 * @param tanque Se o carro for alugado com tanque cheio este parametro eh True, caso contrario False.
	 * @param seguroCarro Se o carro for alugado com seguro este parametro eh True, caso contrario False.
	 */
	public CarroExecutivo(boolean tanque, boolean seguroCarro) {
		super(DIARIA_CARRO_EXECUTIVO, tanque, seguroCarro);
	}

	@Override
	public double totalAPagar() {
		double valorAPagar = 0; 
		if (isSeguro()) valorAPagar += SEGURO;
		if (isTanqueCheio()) valorAPagar += TANQUE_CHEIO;
		valorAPagar += DIARIA_CARRO_EXECUTIVO;
		
		return valorAPagar;
	}
	
	@Override
	public String toString(){
		return "Carro Executivo" + super.toString();
	}
}
