package projetolp2.hotelriviera;

import java.util.*;

/**
 * Classe que cria,acessa e modifica o hospede titular de um contrato no Hotel Riviera. 
 * @author Dandara Maria, Paulo Vinicius, Pedro Paulo
 *
 */
public class Hospede {
	private String nomeHospede;
	private String endereco;
	private String CPF;
	private String telefoneContato;
	private GregorianCalendar dataNascimento;
	
	/**
	 * Construtor da classe, recebe os dados do hospede para formalizar o contrato.
	 * @param nome O nome do hospede titular.
	 * @param endereco O endereco do hospede titular.
	 * @param CPF O CPF do hospede titular.
	 * @param telefoneContato O telefone de contato do hospede titular.
	 * @param dataNascimento  A data de nascimento do hospede titular.
	 * @throws Exception Excessao lancada caso algum dos parametros sejam null ou vazios.
	 */
	public Hospede (String nome, String endereco, String CPF, String telefoneContato, GregorianCalendar dataNascimento) throws Exception {
		if (nome == null || endereco == null || CPF == null || telefoneContato == null || dataNascimento == null) {
			throw new ObjetoInvalidoException("Os dados fornecidos nao podem ser do tipo 'null'");
		}
		if (nome == "" || endereco == "" || CPF == "" || telefoneContato == ""){
			throw new StringVaziaException("Os dados fornecidos nao podem conter uma String Vazia.");
		}
		nomeHospede = nome;
		this.endereco = endereco;
		this.CPF = CPF;
		this.telefoneContato = telefoneContato; 
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Metodo acessador ao nome do hospede.
	 * @return O nome do hospede.
	 */
	public String getNomeHospede() {
		return nomeHospede;
	}

	/**
	 * Metodo que muda o nome do hospede titular.
	 * @param nomeHospede Recebe o nome do novo hospede titular.
	 */
	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	/**
	 * Metodo que acessa ao endereco do hospede.
	 * @return O endereco do hospede.
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Metdo que muda o endereco do hospede.
	 * @param endereco O novo endereco a ser utilizado.
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Metodo acessador ao CDF do hospede.
	 * @return O CPF do titular.
	 */
	public String getCPF() {
		return CPF;
	}

	/**
	 * Metodo que muda o CPF do hospede.
	 * @param CPF  O novo CPF a ser utitlizado.
	 */
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	/**
	 * Metodo acessador ao numero do telefone do hospede.
	 * @return O telefone de contato do hospede.
	 */
	public String getTelefoneContato() {
		return telefoneContato;
	}

	/**
	 * Metodo que muda o numero do telefone de contato do titular.
	 * @param telefoneContato O novo numero a ser utilizado.
	 */
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	/**
	 * Metodo que acessa a data de nascimento do hospede.
	 * @return A data de nascimento do hospede.
	 */
	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Metodo que modifica a data de nascimento do hospede.
	 * @param dataNascimento Recebe a nova data de nascimento.
	 */
	public void setDataNascimento(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Hospede)){
			return false;
		}
		Hospede hospede = (Hospede) obj;
		return nomeHospede.equals(hospede.getNomeHospede()) && CPF.equals(hospede.getCPF());
	}
	
	@Override
	public String toString () {
		return "Nome do hóspede: " + nomeHospede + " - CPF: " + CPF;
	}
}
