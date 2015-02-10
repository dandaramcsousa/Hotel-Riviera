package projetolp2.hotelriviera;

/**
 * Classe que cria e acessa um carro do tipo Luxo.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo
 *
 */
public class CarroLuxo extends Carro {
	private final static double DIARIA_CARRO_LUXO = 100;
	
	/**
	 * Construtor da classe que recebe as informacoes do carro e repassa a super classe Carro(incluindo a diaria de um carro luxo).
	 * @param tanque True caso seja solicitado cheio e false caso contrario.
	 * @param seguroCarro True caso o seguro seja solicitado e false caso contrario.
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