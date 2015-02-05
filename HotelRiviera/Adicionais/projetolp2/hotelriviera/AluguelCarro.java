package projetolp2.hotelriviera;
/**
 * Classe que calcula o aluguel de um carro do Hotel Riviera.
 * @author Dandara Maria, Paulo Vinicius,Pedro Paulo.
 *
 */
public class AluguelCarro implements Adicional {
	Carro carro;
	/**
	 * Construtor da classe.
	 * @param carro O carro a ser alugado.
	 */
	public AluguelCarro (Carro carro) {
		this.carro = carro;
	}
	@Override
	public double getValorServico() {
		return carro.totalAPagar();
	}
	
	@Override
	public String toString(){
		return " - Aluguel de carro - \n" + carro + "\nCobranca Total: R$" + getValorServico();
	}
}
