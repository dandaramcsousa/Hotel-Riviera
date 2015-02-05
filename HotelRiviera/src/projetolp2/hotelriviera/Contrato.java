package projetolp2.hotelriviera;

import java.util.*;

public class Contrato {
	private Hospede hospede;
	private String numeroCartao;
	private int numeroDias;
	private Quarto quarto;
	private ArrayList<Adicional> adicionais;
	private int codigoContrato;
	private boolean contratoAberto = true;
	
	public boolean isContratoAberto() {
		return contratoAberto;
	}

	public void setContratoFechado() {
		this.contratoAberto = false;
	}

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
	
	public boolean adicionaAdicionais (Adicional adicional) throws NullPointerException {
		if (adicional == null) {
			throw new NullPointerException();
		}
		return adicionais.add(adicional);
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) throws Exception {
		if (hospede == null) {
			throw new ObjetoInvalidoException("O hospede null eh invalido.");
		}
		this.hospede = hospede;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) throws Exception {
		if (numeroCartao == "" )  
			throw new StringVaziaException("O numero do cartao passado eh invalido.");
		else if(numeroCartao == null)
			throw new ObjetoInvalidoException("O objeto passado eh nulo. ");
		this.numeroCartao = numeroCartao;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) throws Exception {
		if (numeroDias < 1) {
			throw new NumeroNegativoException("O numero de dias nao pode ser negativo.");
		}
		this.numeroDias = numeroDias;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) throws Exception {
		if (quarto == null) {
			throw new ObjetoInvalidoException("O objeto passado eh nulo. ");
			}
		this.quarto = quarto;
	}

	public ArrayList<Adicional> getAdicionais() {
		return adicionais;
	}
	
	public int setCodigoContrato (int codigoContrato) {
		this.codigoContrato = codigoContrato;
		return this.codigoContrato;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Contrato)){
			return false;
		}
		Contrato contrato = (Contrato) obj;
		return hospede.equals(contrato.getHospede()) && numeroCartao.equals(contrato.getNumeroCartao());
	}

	public int getCodigoContrato() {
		return codigoContrato;
	}
}