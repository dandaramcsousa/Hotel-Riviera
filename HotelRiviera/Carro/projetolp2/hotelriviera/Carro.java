package projetolp2.hotelriviera;
/**
 * Classe abstrata para o aluguel de carros do Hotel Riviera.
 * @author Dandara Maria, Pedro Paulo, Paulo Vinicius.
 *
 */
public abstract class Carro {
	private double valorDiaria;
	private boolean tanqueCheio;
	private boolean seguro;
	protected final static int TANQUE_CHEIO = 150;
	protected final static int SEGURO = 100;
	
	/**
	 * Construtor da classe. Cria um carro.
	 * @param diaria Valor da diaria de acordo com o tipo de carro.
	 * @param tanque Se o carro for alugado com tanque cheio este parametro eh True, caso contrario False.
	 * @param seguroCarro Se o carro for alugado com seguro este parametro eh True, caso contrario False.
	 */
	public Carro (double diaria, boolean tanque, boolean seguroCarro) {
		this.valorDiaria = diaria;
		this.tanqueCheio = tanque;
		this.seguro = seguroCarro;
	}
	
	/**
	 * Metodo para retornar o valor da diaria do aluguel.
	 * @return O valor da diaria do aluguel.
	 */
	public double getValorDiaria() {
		return valorDiaria;
	}
	
	/**
	 * Metodo para mudar o valor da diaria do aluguel do carro.
	 * @param valorDiaria Novo valor da diaria do aluguel.
	 */
	public void setValorDiaria(double NovovalorDiaria) {
		this.valorDiaria = NovovalorDiaria;
		}
	
	/**
	 * Metodo para informar se o carro foi alugado com o tanque cheio ou nao.
	 * @return True se o carro for alugado com o tanque cheio e False caso contrario.
	 */
	public boolean isTanqueCheio() {
		return tanqueCheio;
	}
	
	/**
	 * Metodo para informar se o carro foi alugado com seguro.
	 * @return True se o carro for alugado com seguro e False caso contrario.
	 */
	public boolean isSeguro() {
		return seguro;
	}
	
	/**
	 * Metodo abstrato que informa o valor total do aluguel do carro.
	 * @return
	 */
	public abstract double totalAPagar ();
	
	@Override
	public String toString(){
		return "\nSeguro: " + isSeguro() + "\nTanque cheio: " + isTanqueCheio() + "\nDiaria: " + valorDiaria;
	}

}
