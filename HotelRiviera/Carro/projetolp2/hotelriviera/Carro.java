package projetolp2.hotelriviera;

/**
 * Classe que remete ao aluguel de um carro por um hospede do Hotel Riviera.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo.
 *
 */
public abstract class Carro {
	private double valorDiaria;
	private boolean tanqueCheio;
	private boolean seguro;
	protected final static int TANQUE_CHEIO = 150;
	protected final static int SEGURO = 100;
	
	/**
	 * Construtor da classe que recebe as informacoes sobre o carro.
	 * @param diaria Recebe o valor da diaria do carro.
	 * @param tanque Recebe true caso o tanque cheio seja solicitado e false caso contrario.
	 * @param seguroCarro Recebe true caso o seguro seja socilitado e false caso contrario.
	 */
	public Carro (double diaria, boolean tanque, boolean seguroCarro) {
		this.valorDiaria = diaria;
		this.tanqueCheio = tanque;
		this.seguro = seguroCarro;
	}
	
	/**
	 * Metodo acessador do valor da diaria do carro.
	 * @return O valor da diaria do carro.
	 */
	public double getValorDiaria() {
		return valorDiaria;
	}

	/**
	 * Metodo que modifica o valor da diaria do carro.
	 * @param valorDiaria Recebe o novo valor da diaria.
	 */
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
		}

	/**
	 * Metodo que retorna se o tanque esta ou nao cheio.
	 * @return True caso o tanque esteja cheio e false caso contrario.
	 */
	public boolean isTanqueCheio() {
		return tanqueCheio;
	}

	/**
	 * Metodo que retorna se o segura foi ou nao solicitado.
	 * @return True caso seja solicitado e false caso contrario.
	 */
	public boolean isSeguro() {
		return seguro;
	}
	
	/**
	 * Metodo abstrato que retorna o total do aluguel do carro.
	 * @return O valor do aluguel do carro.
	 */
	public abstract double totalAPagar ();
	
	@Override
	public String toString(){
		return "\nSeguro: " + isSeguro() + "\nTanque cheio: " + isTanqueCheio() + "\nDiaria: " + valorDiaria;
	}

}
