package projetolp2.hotelriviera;
/**
 * Classe que calcula a tarifacao dos servicos do Hotel Riviera.
 * @author Dandara Maria, Paulo Vinicius,Pedro Paulo.
 *
 */
public class Tarifacao {
	ServicosHotel servico;
	 /**
	  * Construtor da classe.
	  * @param servico Um dos servicos do Hotel Riviera a ser tarifado.
	  */
	public Tarifacao (ServicosHotel servico) {
		this.servico = servico;
	}
	
	/**
	 * Metodo que calcula a tarifacao em epoca normal.
	 * @return O valor normal do servico.
	 */
	public double tarifacaoNormal () {
		return servico.getValorServico();
	}
	
	/**
	 * Metodo que calcula a tarifacao em epoca de alta estacao.
	 * @return O dobro do valor normal do servico.
	 */
	public double tarifacaoAltaEstacao () {
		return servico.getValorServico() * 2;
	}
	
	/**
	 * Metodo que calcula a tarifacao em epoca de baixa estacao.
	 * @return 80% do valor normal do servico.
	 */
	public double tarifacaoBaixaEstacao () {
		return servico.getValorServico() * 0.8;
	}
	
}
