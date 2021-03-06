/*
 * Caso de Uso2: Criar, pesquisar, atualizar e remover Servi�os
 O hotel disponibiliza um conjunto de servi�os para seus h�spedes. Esses servi�os s�o inclu�dos nos
 contratos e englobam os quartos (servi�o b�sico) e servi�os adicionais como aluguel de carros, 
 babysitter e restaurante.

 Todo servi�o possui uma descri��o e pre�o por unidade, podendo ter ainda a descri��o por cada unidade
 do servi�o. Cada tipo de servi�o ter� suas especifidades. Por exemplo, os quartos podem ou n�o ter cama 
 adicional (o que influencia no pre�o do quarto) e ainda comportar quantidade de pessoas diferentes. Note 
 que existem diferentes categorias de quartos (PRESIDENCIAL, LUXO_SIMPLES, LUXO_DUPLO, LUXO_TRIPLO, 
 EXECUTIVO_SIMPLES, EXECUTIVO_SIMPLES, EXECUTIVO_DUPLO, EXECUTIVO_TRIPLO), os quartos presidenciais 
 comportam at� 4 pessoas e os demais at� 3 pessoas. 

 Um servi�o adicional � o aluguel de carros. Nesse caso, tem-se a identifica��o do carro e a quantidade 
 de di�rias. As di�rias dependem da categoria do aluguel (AUTOMOVEL_LUXO, AUTOMOVEL_EXECUTIVO) e as
 taxas extras referentes ao seguro e tanque cheio. Note que essas faixas s�o fixas.

 Deve ser poss�vel criar, pesquisar, atualizar e remover servi�os do hotel.
 */

package projetolp2.hotelriviera;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CasoDeUso3 {
	
	private Quarto quartoDeTestes;
	private Hospede hospede1;
	private Hospede hospede2;
	private Contrato contrato1;
	private Contrato contrato2;
	private Quarto quarto1;
	private Quarto quarto2;
	private final boolean NAO_TEM_CAMA_EXTRA = false;
	private final boolean TEM_CAMA_EXTRA = true;
	private static ListaQuartosHotel listaQuartos;
	private static ListaContratos contratosHotel;
	private Quarto luxoSimples, luxoDuplo, luxoTriplo, presidencial, executivoSimples, executivoDuplo, executivoTriplo;
	private Time horaBabysitter;
	private GregorianCalendar dataBabysitter;
	
	@SuppressWarnings("deprecation")
	@Before
	public void CriarContratos() throws Exception{
		hospede1 = new Hospede ("Jorge Ferreira Amaral",
										"Av. Campinas, 567, Tambau, Joao Pessoa - PB",
										"234.674.897-45",
										"(83) 8546-5435",
										new GregorianCalendar(1990, 01, 22));
		
		hospede2 = new Hospede ("Caio Lima Albuqerque",
										"Rua Florencia, 134, Boa Viagem, Reife - PE",
										"675.976.453-76",
										"(82) 3546-5876",
										new GregorianCalendar(1990, 02, 28));
		
		listaQuartos = new ListaQuartosHotel();
		quarto1 = listaQuartos.getQuarto(11);
		quarto2 = listaQuartos.getQuarto(1);
		
		contrato1 = new Contrato(hospede1, "2314-4313-3123-1234", 7, quarto1);
		quarto1.setNumeroPessoas(2);
		contrato2 = new Contrato(hospede2, "2314-5455-3198-1094", 12, quarto2);
		quarto2.setNumeroPessoas(3);
		
		dataBabysitter = new GregorianCalendar(2015, 10, 26);
		horaBabysitter = new Time (20,0,0);
		
		Babysitter babysitter1 = new Babysitter(false, 5, dataBabysitter, horaBabysitter);
		AluguelCarro aluguel1 = new AluguelCarro(new CarroExecutivo(false, true));
		contrato1.adicionaServicos(babysitter1);
		contrato2.adicionaServicos(aluguel1);
		
		luxoSimples = new LuxoSimples(0, NAO_TEM_CAMA_EXTRA, 0);
		presidencial = new Presidencial(0, 0);
		executivoSimples = new ExecutivoSimples(0, NAO_TEM_CAMA_EXTRA, 0);
		luxoDuplo = new LuxoDuplo(0, NAO_TEM_CAMA_EXTRA, 0);
		executivoDuplo = new ExecutivoDuplo(0, NAO_TEM_CAMA_EXTRA, 0);
		luxoTriplo = new LuxoTriplo(0, 0);
		executivoTriplo = new ExecutivoTriplo(0, 0);
	}
	
	@Test
	public void testaCriarContratos() throws Exception {
		try {
			quartoDeTestes = luxoSimples;
			new Contrato(null, "666-666-666-6666", 15, quartoDeTestes);
			Assert.fail("Deve falhar, o contrato não pode aceitar um hóspede nulo.");
		} catch (ObjetoInvalidoException e) {
			Assert.assertEquals("O objeto passado eh nulo. ", e.getMessage());
		}

		try {
			quartoDeTestes = presidencial;
			new Contrato(hospede1,"",16,quartoDeTestes);
		} catch (StringVaziaException e) {
			Assert.assertEquals("O numero do cartao passado eh invalido.", e.getMessage());
		}
		try {
			quartoDeTestes = luxoTriplo;
			new Contrato(hospede2, "5555555 7 5", -8, quartoDeTestes);
		} catch (NumeroNegativoException e){
			Assert.assertEquals("O numero de dias nao pode ser negativo.",e.getMessage());
		}
	}
	
	@Test
	public void testaListaContratos () throws Exception {
		contratosHotel = new ListaContratos();
		
		try {
			contratosHotel.adicionaContrato(null);
			Assert.fail("Deve lançar exceção, o contrato não pode ser 'null'.");
		} catch (Exception e) {
			Assert.assertEquals("O contrato não pode ser do tipo 'null'.", e.getMessage());
		}
		
		contratosHotel.adicionaContrato(contrato1);
		Assert.assertEquals(1, contrato1.getCodigoContrato());
		contratosHotel.adicionaContrato(contrato2);
		Assert.assertEquals(2, ListaContratos.getContratosAbertos().size(), 0.01);
		Assert.assertTrue(contratosHotel.removeContrato(contrato1));
		Assert.assertEquals(1, ListaContratos.getContratosAbertos().size(), 0.01);
		Assert.assertTrue(contratosHotel.removeContrato(contrato2));
		Assert.assertFalse(contratosHotel.removeContrato(contrato1));
	}
	
	@Test
	public void testaTarifacao () {
		
	}
}
