package projetolp2.hotelriviera;

import java.util.ArrayList;

public class ListaContratos {
	private static ArrayList<Contrato> contratosHotel;
	private static int codigoDeContrato = 0;
	
	public ListaContratos() {
		contratosHotel = new ArrayList<Contrato>();
	}
	
	public boolean removeContrato (Contrato contrato) {
		Contrato contratoProcurado = consultaContrato(contrato);
		if (contratoProcurado == null) return false;
		contratoProcurado.setContratoFechado();
		return true;
	}
	
	public Contrato consultaContrato (Contrato contrato) {
		for (Contrato a: contratosHotel) {
			if (a.equals(contrato)) {
				return a;
			}
		}
		return null;
	}
	
	public void adicionaContrato (Contrato contrato) throws Exception {
		if (contrato == null) throw new Exception("O contrato não pode ser do tipo 'null'.");
		codigoDeContrato++;
		contrato.setCodigoContrato(codigoDeContrato);
		contratosHotel.add(contrato);
	}

	public static ArrayList<Contrato> getContratosAbertos() {
		ArrayList<Contrato> contratosAbertos = new ArrayList<Contrato>();
		for (Contrato a: contratosHotel) {
			if (a.isContratoAberto()) contratosAbertos.add(a);
		}
		return contratosAbertos;
	}

	public static ArrayList<Contrato> getContratosFechados() {
		ArrayList<Contrato> contratosFechados = new ArrayList<Contrato>();
		for (Contrato a: contratosHotel) {
			if (!(a.isContratoAberto())) contratosFechados.add(a);
		}
		
		return contratosFechados;
	}
}