package projetolp2.hotelriviera;

/**
 * Classe que representa um quarto do tipo luxo, no caso triplo. Esta classe extende a classe Luxo.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo.
 *
 */
public class LuxoTriplo extends Luxo {
	private final static double VALOR_DIARIA_LTRIPLO = 620;
	private final static boolean CAMA_EXTRA_NAO_DISPONIVEL = false;
	
	/**
	 * Construtor da classe. Recebe a informacoes basicas acerca do quarto e repassa a classe mae.
	 * @param numeroDePessoas A quantidade de pessoas que tera no quarto.
	 * @param codigoQuarto O codigo o quarto que sera alugado.
	 * @throws Exception Excecao herdada da classe quarto.
	 */
	public LuxoTriplo(int numeroDePessoas, int codigoQuarto) throws Exception {
		super(numeroDePessoas, CAMA_EXTRA_NAO_DISPONIVEL, VALOR_DIARIA_LTRIPLO, codigoQuarto);
		tipoQuarto = "LUXO_TRIPLO";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\n Tipo de quarto: Luxo Triplo";
	}

}
