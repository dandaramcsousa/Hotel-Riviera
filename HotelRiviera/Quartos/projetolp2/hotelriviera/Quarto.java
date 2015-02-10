package projetolp2.hotelriviera;

/**
 * Classe que representa um quarto do Hotel Riviera.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo.
 *
 */
public abstract class Quarto implements ServicosHotel {
	private int numeroPessoas;
	private double valorDiaria;
	private boolean quartoOcupado = false;
	private int codigoQuarto;
	protected String tipoQuarto;
	private int limitePessoasQuarto;
	
	/**
	 * Construtor da classe, que recebe as informacoes acerca do reservamento de um quarto.
	 * @param numeroDePessoas A quantidade de pessoas que estarao num quarto.
	 * @param limitePessoasQuarto A quantidade limite de pessoas por quarto.
	 * @param diaria O valor da diaria de um quarto.
	 * @param codigoQuarto O codigo do quarto.
	 * @throws Exception Excecao lancada caso um dos parametros sejam invalidos.
	 */
	public Quarto (int numeroDePessoas, int limitePessoasQuarto, double diaria, int codigoQuarto) throws Exception {
		checaExcecoes(numeroDePessoas, limitePessoasQuarto);
		this.limitePessoasQuarto = limitePessoasQuarto;
		this.codigoQuarto = codigoQuarto;
		this.numeroPessoas = numeroDePessoas;
		this.valorDiaria = diaria;
	}

	/**
	 * Metodo acessador do valor da diaria do quarto.
	 * @return O valor da diaria.
	 */
	public double getValorDiaria() {
		return valorDiaria;
	}

	/**
	 * Metodo que modifica o valor da diaria do quarto.
	 * @param valorDiaria O novo valor da diaria.
	 */
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	/**
	 * Metodo que acessa o numero de pessoas no quarto.
	 * @return O numero de pessoas hospedadas no quarto.
	 */
	public int getNumeroPessoas() {
		return numeroPessoas;
	}
	
	/**
	 * Metodo que modifica a quantidade de pessoas hospedadas num quarto.
	 * @param numeroPessoas A nova quantidade de pessoas.
	 * @throws Exception Checa se o numero de pessoas condiz com ate o limite de pessoas num quarto.
	 */
	public void setNumeroPessoas(int numeroPessoas) throws Exception {
		checaExcecoes(numeroPessoas, limitePessoasQuarto);
		this.numeroPessoas = numeroPessoas;
	}

	/**
	 * Metodo que acessa se o quarto esta ou nao ocupado.
	 * @return True se ele estiver ocupado, false caso contrario.
	 */
	public boolean getQuartoOcupado() {
		return quartoOcupado;
	}

	/**
	 * Metodo que define o quarto como ocupado.
	 */
	public void ocupado() {
		this.quartoOcupado = true;
	}
	
	/**
	 * Metodo que define o quarto como livre.
	 */
	public void livre() {
		this.quartoOcupado = false;
	}

	/**
	 * Metodo acessador do codigo do quarto.
	 * @return O codigo do quarto.
	 */
	public int getCodigoQuarto() {
		return codigoQuarto;
	}
	
	/**
	 * Metodo que acessa o tipo do quarto.
	 * @return O tipo do quarto.
	 */
	public String getTipoQuarto () {
		return tipoQuarto;
	}

	/**
	 * Metodo que checa as excecoes para a classe.
	 * @param pessoas A quantidade de pessoas num quarto.
	 * @param limitePessoasQuarto O limite de pessoas num quarto.
	 * @throws Exception Lanca excecao caso o numero de pessoas seja negativo ou acima do permitido.
	 */
	private void checaExcecoes (int pessoas, int limitePessoasQuarto) throws Exception {
		if (!(pessoas >= 0 && pessoas <= limitePessoasQuarto)) {
			throw new Exception("A quantidade de pessoas no quarto não pode exceder o limite"
					+ " estabelecido de " + limitePessoasQuarto + " pessoas.");
		}
	}

	@Override
	public double getValorServico() {
		return getValorDiaria();
	}
	
	@Override
	public String toString () {
		return "Codigo de identificao: " + getCodigoQuarto() + "  -  O valor da diaria eh R$ " + getValorDiaria() + "0  -  " ;
	}

}
