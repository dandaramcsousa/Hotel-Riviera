package projetolp2.hotelriviera;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que cria, acessa e modifica uma lista de contratos relacionados ao Hotel Riviera.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo
 *
 */
public class ListaContratos {
	private static List<Contrato> contratosHotel;
	private static int codigoDeContrato = 0;
	
	/**
	 * Construtor da classe. Cria um Arraylist de Contratos assim que eh instanciada.
	 */
	public ListaContratos() {
		contratosHotel = new ArrayList<Contrato>();
	}
	
	/**
	 * Metodo para a remocao de um contrato na lista de contratos.
	 * @param contrato Contrato a ser excluido.
	 * @return True se o contrato for excluido, false caso contrario.
	 */
	public boolean removeContrato (Contrato contrato) {
		Contrato contratoProcurado = consultaContrato(contrato);
		if (contratoProcurado == null) return false;
		contratoProcurado.setContratoFechado();
		return true;
	}
	
	/**
	 * Metodo de acessar a um contrato especifico na lista de contratos.
	 * @param contrato O contrato a ser acessado.
	 * @return O contrato requerido.
	 */
	public Contrato consultaContrato (Contrato contrato) {
		for (Contrato a: contratosHotel) {
			if (a.equals(contrato)) {
				return a;
			}
		}
		return null;
	}
	
	/**
	 * Metodo para adicionar um novo contrato a lista de contratos.
	 * @param contrato O novo contrato a ser adicionado a lista.
	 * @throws Exception Excecao lancada caso o contrato seja do tipo null.
	 */
	public void adicionaContrato (Contrato contrato) throws Exception {
		if (contrato == null) throw new ObjetoInvalidoException("O contrato naoo pode ser do tipo 'null'.");
		codigoDeContrato++;
		contrato.setCodigoContrato(codigoDeContrato);
		contratosHotel.add(contrato);
	}

	/**
	 * Metodo para acessar os contratos abertos da lista de contratos.
	 * @return Uma nova lista apenas com os contratos que estao em aberto.
	 */
	public static List<Contrato> getContratosAbertos() {
		List<Contrato> contratosAbertos = new ArrayList<Contrato>();
		for (Contrato a: contratosHotel) {
			if (a.isContratoAberto()) contratosAbertos.add(a);
		}
		return contratosAbertos;
	}

	/**
	 * Metodo para acessar os contratos fechados da lista de contratos.
	 * @return Uma nova lista apenas com os contratos que estao fechados.
	 */
	public static List<Contrato> getContratosFechados() {
		List<Contrato> contratosFechados = new ArrayList<Contrato>();
		for (Contrato a: contratosHotel) {
			if (!(a.isContratoAberto())) contratosFechados.add(a);
		}
		
		return contratosFechados;
	}
}