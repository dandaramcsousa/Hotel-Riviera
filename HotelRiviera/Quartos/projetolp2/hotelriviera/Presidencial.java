package projetolp2.hotelriviera;
/**
 * Classe que representa um quarto do tipo presidencial. Esta classe extende a classe Quarto.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo.
 *
 */
public class Presidencial extends Quarto {
	private final static int LIMITE_PESSOAS_QUARTO_PRESIDENCIAL = 4;
	private final static double VALOR_DIARIA = 1200;
	
	/**
	 * Construtor da classe. Recebe a informacoes basicas acerca do quarto e repassa a classe mae.
	 * @param numeroDePessoas A quantidade de pessoas que tera no quarto.
	 * @param diaria O valor da diaria.
	 * @param codigoQuarto O codigo o quarto que sera alugado.
	 * @throws Exception Excecao herdada da classe quarto.
	 */
	public Presidencial(int numeroDePessoas, int codigoQuarto) throws Exception {
		super(numeroDePessoas, LIMITE_PESSOAS_QUARTO_PRESIDENCIAL, VALOR_DIARIA, codigoQuarto);
		tipoQuarto = "PRESIDENCIAL";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nTipo de quarto: Presidencial";
	}
}
