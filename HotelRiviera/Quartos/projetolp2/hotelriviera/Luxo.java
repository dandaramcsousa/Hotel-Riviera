package projetolp2.hotelriviera;
/**
 * Classe que representa um quarto do tipo luxo. Esta classe extende a classe Quarto.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo.
 *
 */
public abstract class Luxo extends Quarto {
	private final static int LIMITE_PESSOAS_QUARTO_LUXO = 3;
	private final static double VALOR_DIARIA = 0;
	private boolean camaExtra;

	/**
	 * Construtor da classe. Recebe a informacoes basicas acerca do quarto e repassa a classe mae.
	 * @param numeroDePessoas A quantidade de pessoas que tera no quarto.
	 * @param camaExtra True se houve cama extra e false caso contrario.
	 * @param diaria O valor da diaria.
	 * @param codigoQuarto O codigo o quarto que sera alugado.
	 * @throws Exception Excecao herdada da classe quarto.
	 */
	public Luxo(int numeroDePessoas, boolean camaExtra, double diaria, int codigoQuarto) throws Exception {
		super(numeroDePessoas, LIMITE_PESSOAS_QUARTO_LUXO, VALOR_DIARIA, codigoQuarto);
		this.camaExtra = camaExtra;
		setValorDiaria(diaria);
	}
	
	public void setCamaExtra (boolean camaExtra) {
		this.camaExtra = camaExtra;
	}
	
	public boolean temCamaExtra() {
		return camaExtra;
	}
	
}
