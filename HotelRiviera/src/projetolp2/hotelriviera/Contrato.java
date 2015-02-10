package projetolp2.hotelriviera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Classe que cria, acessa e modifica um contrato de um hospede titular no Hotel Riviera.
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo
 *
 */
public class Contrato {
	private Hospede hospede;
	private String numeroCartao;
	private int numeroDias;
	private Quarto quarto;
	private List<Adicional> adicionais;
	private int codigoContrato;
	private boolean contratoAberto = true;
	
	/**
	 * Define o contrato como aberto.
	 * @return True, pois o status do contrato eh aberto.
	 */
	public boolean isContratoAberto() {
		return contratoAberto;
	}

	/**
	 * Fecha o contrato
	 * @return False, sendo assim o contrato tratado como fechado.
	 */
	public void setContratoFechado() {
		this.contratoAberto = false;
	}

	/**
	 * Construtor da classe Contrato.
	 * @param hospede Um objeto do tipo Hospede, com as informacoes do titular do contrato.
	 * @param numeroCartao O numero do cartao do titular afim de garantir o pagamento da estadia.
	 * @param numeroDias O tempo de estadia do titular.
	 * @param quarto Um objeto do tipo quarto, com as informacoes do quarto no qual o titular estara.
	 * @throws Exception Exception para passada de informacoes nulas, vazias ou numeros negativos.
	 */
	public Contrato (Hospede hospede, String numeroCartao, int numeroDias, Quarto quarto) throws Exception {
		if (hospede == null || quarto == null || numeroCartao == null) {
			throw new ObjetoInvalidoException("O objeto passado eh nulo. ");
		}
		if (numeroCartao == "") {
			throw new StringVaziaException("O numero do cartao passado eh invalido.");
		}
		if (numeroDias < 1) {
			throw new NumeroNegativoException("O numero de dias nao pode ser negativo.");
		}
		adicionais = new ArrayList<Adicional>();
		this.hospede = hospede;
		this.numeroCartao = numeroCartao;
		this.numeroDias = numeroDias;
		this.quarto = quarto;
	}
	
	/**
	 * Metodo para adicionar ao contrato servicos adicionais(carro, babysitter, refeicoes).
	 * @param adicional O servico adicional a ser anexado ao contrato.
	 * @return True se o servico for adicionado e false caso contrario.
	 * @throws NullPointerException Lancado caso o adicional passado por parametro for nulo.
	 */
	public boolean adicionaServicos (Adicional adicional) throws Exception {
		if (adicional == null) {
			throw new ObjetoInvalidoException("O adicional null eh invalido.");
		}
		return adicionais.add(adicional);
	}

	/**
	 * Metodo de acesso ao hospede titular.
	 * @return O hospede titular do contrato.
	 */
	public Hospede getHospede() {
		return hospede;
	}

	/**
	 * Muda o titular do contrato.
	 * @param hospede  O novo hospede a ser considerado o titular do contraato.
	 * @throws Exception Caso o hospede passado seja null.
	 */
	public void setHospede(Hospede hospede) throws Exception {
		if (hospede == null) {
			throw new ObjetoInvalidoException("O hospede null eh invalido.");
		}
		this.hospede = hospede;
	}

	/**
	 * Metodo acessador ao numero do cartao.
	 * @return O numero do cartao do titular do contrato.
	 */
	public String getNumeroCartao() {
		return numeroCartao;
	}
	
	/**
	 * Metodo que muda o Numero do cartao do hospede titular.
	 * @param numeroCartao O novo numero de cartao a ser utilizado.
	 * @throws Exception Lanca excecoes para o caso do numero do cartao ser vazio ou null.
	 */
	public void setNumeroCartao(String numeroCartao) throws Exception {
		if (numeroCartao == "" )  
			throw new StringVaziaException("O numero do cartao passado eh invalido.");
		else if(numeroCartao == null)
			throw new ObjetoInvalidoException("O objeto passado eh nulo. ");
		this.numeroCartao = numeroCartao;
	}

	/**
	 * Metodo acessador de numero de dias de hospedagem do hospede.
	 * @return O total de dias de hospedagem do hospede.
	 */
	public int getNumeroDias() {
		return numeroDias;
	}

	/**
	 * Metodo que muda o numero de dias da hospedagem do hospede.
	 * @param numeroDias O novo numero de dias da hospedagem.
	 * @throws Exception Excecao lancada caso o numero de dias seja negativo.
	 */
	public void setNumeroDias(int numeroDias) throws Exception {
		if (numeroDias < 1) {
			throw new NumeroNegativoException("O numero de dias nao pode ser negativo.");
		}
		this.numeroDias = numeroDias;
	}

	/**
	 * Metodo que acessa o quarto ligado ao contrato.
	 * @return O quarto do contrato.
	 */
	public Quarto getQuarto() {
		return quarto;
	}

	/**
	 * Metodo que muda o quarto do contrato.
	 * @param quarto O novo quarto a ser utilizado.
	 * @throws Exception Excessao lancada caso o quarto seja nulo.
	 */
	public void setQuarto(Quarto quarto) throws Exception {
		if (quarto == null) {
			throw new ObjetoInvalidoException("O objeto passado eh nulo. ");
			}
		this.quarto = quarto;
	}

	/**
	 * Metodo acessador aos servicos adicionais do contrato.
	 * @return Os servicoes adicionais relacionados ao contrato.
	 */
	public List<Adicional> getAdicionais() {
		return adicionais;
	}
	
	/**
	 * Metodo acessador ao codigo do contrato.
	 * @return O atual codigo do contrato.
	 */
	public int getCodigoContrato() {
		return codigoContrato;
	}
	
	/**
	 * Metodo que muda o codigo do contrato.
	 * @param codigoContrato Novo codigo ao contrato.
	 * @return O novo codigo.
	 */
	public int setCodigoContrato (int codigoContrato) {
		this.codigoContrato = codigoContrato;
		return this.codigoContrato;
	}
	
	/**
	 * Metodo que salva o contrato em um arquivo txt.
	 */
	public void salva(){
		File dados = new File("media/dados.txt");//arquivo no local do projeto
	        try {
	            if (dados.exists() == false) {
	                //se n�o houver esse arquivo ele cria um
	                dados.createNewFile();
	            }
	
	            File[] arquivos = dados.listFiles(); //array para guardar as linhas do arquivo
	
	
	            FileWriter fw = new FileWriter(dados, true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            
	            bw.newLine();
	            bw.write("" + this.quarto.getCodigoQuarto());
	            bw.newLine();
	            bw.write(this.hospede.getNomeHospede());
	            bw.newLine();
	            bw.write(this.hospede.getEndereco());
	            bw.newLine();
	            bw.write(this.hospede.getCPF());
	            bw.newLine();
	            bw.write(this.hospede.getTelefoneContato());
	            bw.newLine();
	            bw.write(numeroCartao);
	            bw.newLine();
	            bw.write("" + numeroDias);
	            bw.newLine();
	            bw.write(quarto.toString());
	            bw.write("----");
	            
	            bw.close();
	            fw.close();
	            
	        } catch (IOException ex) {
	        	System.out.println("bugou");
	            ex.printStackTrace();
	        }
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Contrato)){
			return false;
		}
		Contrato contrato = (Contrato) obj;
		return hospede.equals(contrato.getHospede()) && numeroCartao.equals(contrato.getNumeroCartao());
	}


}