package projetolp2.hotelriviera;

/**
 * Classe que cria e acessa um carro do tipo Executivo.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo
 *
 */
public class CarroExecutivo extends Carro {
	private final static double DIARIA_CARRO_EXECUTIVO = 60;
	
	/**
	 * Construtor da classe que recebe as informacoes do carro e repassa a super classe Carro(incluindo a diaria de um carro executivo).
	 * @param tanque True caso seja solicitado cheio e false caso contrario.
	 * @param seguroCarro True caso o seguro seja solicitado e false caso contrario.
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
