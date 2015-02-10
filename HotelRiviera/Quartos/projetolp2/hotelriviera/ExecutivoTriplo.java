package projetolp2.hotelriviera;

/**
 * Classe que representa um quarto do tipo executivo, no caso triplo. Esta classe extende a classe Executivo.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo.
 *
 */
public class ExecutivoTriplo extends Executivo {
	private final static double VALOR_DIARIA_EXTRIPLO = 440;
	private final static boolean CAMA_EXTRA_NAO_DISPONIVEL = false;
	
	/**
	 * Construtor da classe. Recebe a informacoes basicas acerca do quarto e repassa a classe mae.
	 * @param numeroDePessoas A quantidade de pessoas que tera no quarto.
	 * @param codigoQuarto O codigo o quarto que sera alugado.
	 * @throws Exception Excecao herdada da classe quarto.
	 */
	public ExecutivoTriplo(int numeroDePessoas, int codigoQuarto) throws Exception {
		super(numeroDePessoas, CAMA_EXTRA_NAO_DISPONIVEL, VALOR_DIARIA_EXTRIPLO, codigoQuarto);
		tipoQuarto = "EXECUTIVO_TRIPLO";
	}

	@Override
	public String toString () {
		return super.toString() + "\n Tipo de quarto: Executivo Triplo";
	}
}
