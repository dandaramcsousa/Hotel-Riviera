package projetolp2.hotelriviera;

/**
 * Classe que representa um quarto do tipo executivo, no caso simples. Esta classe extende a classe Executivo.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo.
 *
 */
public class ExecutivoSimples extends Executivo {
	private final static double VALOR_DIARIA_EXSIMPLES= 360;
	
	/**
	 * Construtor da classe. Recebe a informacoes basicas acerca do quarto e repassa a classe mae.
	 * @param numeroDePessoas A quantidade de pessoas que tera no quarto.
	 * @param camaExtra True se houve cama extra e false caso contrario.
	 * @param codigoQuarto O codigo o quarto que sera alugado.
	 * @throws Exception Excecao herdada da classe quarto.
	 */
	public ExecutivoSimples(int numeroDePessoas, boolean camaExtra, int codigoQuarto) throws Exception {
		super(numeroDePessoas, camaExtra, VALOR_DIARIA_EXSIMPLES, codigoQuarto);
		tipoQuarto = "EXECUTIVO_SIMPLES";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\n Tipo de quarto: Executivo Simples";
	}
}
