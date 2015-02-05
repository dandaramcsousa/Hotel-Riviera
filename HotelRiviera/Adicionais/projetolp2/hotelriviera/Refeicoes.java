package projetolp2.hotelriviera;
/**
 * Classe que calcula o valor das refeicoes no Hotel Riviera.
 * @author Dandara Maria, Paulo Vinicius,Pedro Paulo.
 *
 */
public class Refeicoes implements Adicional {
	private double valorTotalConsumido;

	@Override
	public double getValorServico() {
		return getValorTotalConsumido();
	}
	/**
	 * Metodo que retorna o valor consumido pelo hospede.
	 * @return O valor total consumido pelo hospede.
	 */
	public double getValorTotalConsumido() {
		return valorTotalConsumido;
	}
	
	/**
	 * Metodo que adiciona o valor de uma refeicao a conta de refeicoes do hospede.
	 * @param valorRefeicao O valor da refeicao a ser adicionado na conta.
	 * @return O valor total consumido ate entao.
	 */
	public double acrescentaRefeicao (double valorRefeicao) {
		valorTotalConsumido += valorRefeicao;
		
		return valorTotalConsumido;
	}
	
	@Override
	public String toString(){
		return " - Refeicoes - \nValor total consumido: " + getValorTotalConsumido();
	}

}
