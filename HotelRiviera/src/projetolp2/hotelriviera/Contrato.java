package projetolp2.hotelriviera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Contrato {
	private Hospede hospede;
	private String numeroCartao;
	private int numeroDias;
	private Quarto quarto;
	private List<Adicional> adicionais;
	private double faturaServicos;
	private double faturaTotal;
	
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

	public int getNumeroDias() {
		return numeroDias;
	}
	
	public double getFaturaServicos() {
		return faturaServicos;
	}
	
	public double getFaturaTotal() {
		return (quarto.getValorDiaria() * numeroDias) + getFaturaServicos();
	}
	
	public void setNumeroCartao(String numeroCartao) throws Exception {
		if (numeroCartao == "" )  
			throw new StringVaziaException("O numero do cartao passado eh invalido.");
		else if(numeroCartao == null)
			throw new ObjetoInvalidoException("O objeto passado eh nulo. ");
		this.numeroCartao = numeroCartao;
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

	public List<Adicional> getAdicionais() {
		return adicionais;
	}
	
	public void salva(){
		File dados = new File("media/dados.txt");//arquivo no local do projeto
	        try {
	            if (dados.exists() == false) {
	                //se não houver esse arquivo ele cria um
	                dados.createNewFile();
	            }	
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
	            bw.write(quarto.toString());
	            bw.newLine();
	            bw.write("aqui ficara a info de cama extra");
	            bw.newLine();
	            bw.write(quarto.getNumeroPessoas() + " hospedes");
	            bw.newLine();
	            bw.write("" + numeroDias);
	            bw.newLine();
	            bw.write("----servicos----");
	            bw.newLine();
	            bw.write("<fatura servicos>");
	            bw.newLine();
	            bw.write("" + getFaturaTotal());
	            bw.newLine();
	            bw.write("---------------------------------------------------------------------------------------------");      
	            
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
