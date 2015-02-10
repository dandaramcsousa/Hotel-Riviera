package projetolp2.hotelriviera;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe que cria, acessa e modifica uma lista com todos os quartos do Hotel Riviera.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo.
 *
 */
public class ListaQuartosHotel {
	private List<Quarto> quartosHotel;
	private List<Quarto> quartosDisponiveis;
	
	 /**
	  * Construtor da classe. Assim que instanciado cria um ArrayList com todos os quartos do Hotel, incluindo seus codigos.
	  * @throws Exception Excecao herdada da classe quartos.
	  */
	public ListaQuartosHotel() throws Exception {
		quartosHotel = new ArrayList<Quarto>();
		int codPresidencial = 1; 
		int codLuxoSimples = 11;
		int codLuxoDuplo = 21;
		int codLuxoTriplo = 101;
		int codExecutivoSimples = 201;
		int codExecutivoDuplo = 301;
		int codExecutivoTriplo = 401;
		
		
		for (int i = 0; i < 20; i++) {
			if (i < 5) {
				quartosHotel.add(new Presidencial(0, codPresidencial));
				quartosHotel.add(new LuxoSimples(0, false, codLuxoSimples));
				quartosHotel.add(new ExecutivoSimples(0, false, codExecutivoSimples));
			}
			
			codPresidencial++;
			codLuxoSimples++;
			codExecutivoSimples++;
			
			if (i < 15) {
				quartosHotel.add(new LuxoDuplo(0, false, codLuxoDuplo));
				quartosHotel.add(new ExecutivoDuplo(0, false, codExecutivoDuplo));
			}
			
			codLuxoDuplo++;
			codExecutivoDuplo++;
			
			if (i < 20) {
				quartosHotel.add(new LuxoTriplo(0, codLuxoTriplo));
				quartosHotel.add(new ExecutivoTriplo(0, codExecutivoTriplo));
			}
			codLuxoTriplo++;
			codExecutivoTriplo++;
		}
		
		
	}
	
	/**
	 * Metodo para acessar o quartos disponiveis do Hotel.
	 * @return O quartos que estao disponiveis no momento.
	 */
	public List<Quarto> getQuartosDisponiveis () {
		atualizaQuartosDisponiveis();
		return quartosDisponiveis;
	}

	/**
	 * Metodo para acessar os quartos disponiveis passando por parametro um tipo de quarto.
	 * @param quarto O tipo de quarto a ser pesquisado.
	 * @return Os quartos do tipo passado por parametro que estao disponiveis.
	 * @throws Exception Excecao lancada caso o parametro seja null.
	 */
	public List<Quarto> getQuartosDisponiveis (Quarto quarto) throws Exception {
		if (quarto == null) throw new ObjetoInvalidoException("Parametro de entrada incorreto.");
		String tipoQuarto = checaTipoQuarto(quarto);
		atualizaQuartosDisponiveis();
		
		for (Iterator<Quarto> i = quartosDisponiveis.iterator(); i.hasNext();) {
			Quarto a = i.next();
			if (!(a.getTipoQuarto().equals(tipoQuarto) && a.getQuartoOcupado() == false)) {
				i.remove();
			}
		}
		return quartosDisponiveis;
	}

	/**
	 * Metodo que muda o status do quarto.
	 * @param codigoQuarto O quarto a ser acessado.
	 * @return True se o quarto foi modificado para livre e false caso contrario.
	 */
	public boolean SetQuartoLivre (int codigoQuarto) {
		Quarto quarto = getQuarto(codigoQuarto);
		if (quarto == null) return false;
		quarto.livre();
		return true;
	}
	
	/**
	 * Metodo que acessa o quarto.
	 * @param codigoQuarto O codigo do quarto a ser acessado.
	 * @return O quarto caso ele exista e null caso contrario.
	 */
	public Quarto getQuarto (int codigoQuarto) {
		for (Quarto a: quartosHotel) {
			if (a.getCodigoQuarto() == codigoQuarto) return a;
		}
		return null;
	}
	
	/**
	 * Metodo que reserva um determinado quarto.
	 * @param numeroPessoas A quantidade de pessoas a estar no quarto.
	 * @param codigoQuarto O codigo do quarto a ser reservado.
	 * @return True caso o quarto seja reservado e false caso contrario.
	 * @throws Exception herdada do setNumeroPessoas.
	 */
	public boolean reservaQuarto (int numeroPessoas, int codigoQuarto) throws Exception {
		for (Quarto a: quartosHotel) {
			if (codigoQuarto == a.getCodigoQuarto() && a.getQuartoOcupado() == false) {
				a.setNumeroPessoas(numeroPessoas);
				a.ocupado();
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que atualiza a lista de quartos disponiveis.
	 */
	private void atualizaQuartosDisponiveis () {
		quartosDisponiveis = new ArrayList<Quarto>();
		for (Quarto a: quartosHotel) {
			if (a.getQuartoOcupado() == false) {
				quartosDisponiveis.add(a);
			}
		}
	}
	
	/**
	 * Metodo que checa o tipo de um quarto.
	 * @param quarto Quarto a ter tipo checado.
	 * @return O tipo do quarto.
	 */
	private String checaTipoQuarto (Quarto quarto) {
		return quarto.getTipoQuarto();
	}
	
}
