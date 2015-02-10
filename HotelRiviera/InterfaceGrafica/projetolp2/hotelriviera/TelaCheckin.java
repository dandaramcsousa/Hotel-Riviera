package projetolp2.hotelriviera;

import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Toolkit;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JRadioButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

import java.util.HashMap;
import java.util.Map;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JTextPane;

import java.awt.SystemColor;

public class TelaCheckin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NomeField;
	private JTextField EnderecoField;
	private JTextField CPFField;
	private JTextField ContatoField;
	private JTextField CartaoField;
	private JRadioButton botaoCamaExtra;
	private JLabel lblNewLabel;
	private JLabel lblCpf;
	private JLabel lblCpf_1;
	private JLabel lblNome;
	private JLabel lblDataDeNascimento;
	private JTextField DiaField;
	private JTextField MesField;
	private JTextField AnoField;
	private JTextField TotalDeHospedesField;
	private JLabel lblQunatidadeDeHspedes;
	private JLabel lblInformaespessoaisDo;
	private JLabel totalFatura;
	private JComboBox selecaoQuartos;
	private JComboBox quartosDisponiveis;
	private JComboBox comboBox;
	private JTextPane painelEpecificacoes;
	private JLabel lblEsteQuartoOferece;
	private Hospede hospede;
	private Contrato contrato;
	private final boolean NAO_TEM_CAMA_EXTRA = false;
	private Quarto luxoSimples;
	private Quarto presidencial;
	private Quarto executivoSimples;
	private Quarto luxoDuplo;
	private Quarto executivoDuplo;
	private Quarto luxoTriplo;
	private Quarto executivoTriplo;
	private Quarto quartoSelecionado;
	private static ListaQuartosHotel listaQuartos;
	private final Map<String,Quarto> TIPO_QUARTOS = new HashMap<String,Quarto>();
	private final String TEXTO_PRESIDENCIAL = "\r\n - TV LCD 42''       - Ar-condicionado Split         - Home Theather\r\n\r\n"
											+ " - Frigobar            - Sala de jogos\r\n\r\n"
											+ " - Cofre                 - 2 Suites separadas"; 
	private final String TEXTO_LUXO = "\r\n - TV LCD 42''       - Ar-condicionado Split\r\n\r\n"
			+ " - Frigobar            - Home Theaters\r\n\r\n"
			+ " - Cofre";
	private final String TEXTO_EXECUTIVO = "\r\n - TV LCD 42''       - Ar-condicionado Split\r\n\r\n - Frigobar\r\n\r\n - Cofre";
	private JTextField campoNumeroDiarias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCheckin frame = new TelaCheckin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public TelaCheckin() throws Exception {
		setResizable(false);
		setTitle("Hotel Riviera - Sistema de Manuten\u00E7\u00E3o de Clientes e Servi\u00E7os - Check-in");
		setIconImage(Toolkit.getDefaultToolkit().getImage("media/icone_janela.png"));
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.GRAY);
		setBounds(100, 100, 1204, 766);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setToolTipText("Oi");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//lista de quartos
		listaQuartos = new ListaQuartosHotel();
		luxoSimples = new LuxoSimples(0, NAO_TEM_CAMA_EXTRA, 0);
		presidencial = new Presidencial(0, 0);
		executivoSimples = new ExecutivoSimples(0, NAO_TEM_CAMA_EXTRA, 0);
		luxoDuplo = new LuxoDuplo(0, NAO_TEM_CAMA_EXTRA, 0);
		executivoDuplo = new ExecutivoDuplo(0, NAO_TEM_CAMA_EXTRA, 0);
		luxoTriplo = new LuxoTriplo(0, 0);
		executivoTriplo = new ExecutivoTriplo(0, 0);
		
		TIPO_QUARTOS.put("Luxo Simples", luxoSimples);
		TIPO_QUARTOS.put("Luxo Duplo", luxoDuplo);
		TIPO_QUARTOS.put("Luxo Triplo", luxoTriplo);
		TIPO_QUARTOS.put("Executivo Simples", executivoSimples);
		TIPO_QUARTOS.put("Executivo Duplo", executivoDuplo);
		TIPO_QUARTOS.put("Executivo Triplo", executivoTriplo);
		TIPO_QUARTOS.put("Presidencial", presidencial);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(188, 143, 143));
		btnNewButton.setIcon(new ImageIcon("media/botao_voltaraoinicio.png"));
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setSelectedIcon(new ImageIcon("media/botao_voltaraoinicio.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.main(null);
				setVisible(false);
			}
		});
		
		campoNumeroDiarias = new JTextField();
		campoNumeroDiarias.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					if (!campoNumeroDiarias.getText().isEmpty() && !selecaoQuartos.getSelectedItem().equals("- - - - - - - - - - - - - - - - - - ")){
						double total = quartoSelecionado.getValorDiaria() * Integer.parseInt(campoNumeroDiarias.getText());
						totalFatura.setText("R$ " + total +"0");
					}
				} catch (Exception e) {
				}	
			}
		});
		campoNumeroDiarias.setHorizontalAlignment(SwingConstants.CENTER);
		campoNumeroDiarias.setFont(new Font("Tahoma", Font.BOLD, 20));
		campoNumeroDiarias.setColumns(10);
		campoNumeroDiarias.setBounds(545, 652, 60, 38);
		contentPane.add(campoNumeroDiarias);
		
		lblEsteQuartoOferece = new JLabel("Este quarto oferece:");
		lblEsteQuartoOferece.setToolTipText("Especificacoes do quarto");
		lblEsteQuartoOferece.setForeground(Color.WHITE);
		lblEsteQuartoOferece.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEsteQuartoOferece.setBounds(55, 457, 420, 29);
		contentPane.add(lblEsteQuartoOferece);
		
		lblNewLabel = new JLabel("Tel. Contato");
		lblNewLabel.setToolTipText("Telefone para contato. Formato (XX) XXXX-XXX");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(625, 160, 158, 29);
		contentPane.add(lblNewLabel);
		btnNewButton.setBounds(45, 639, 168, 74);
		contentPane.add(btnNewButton);
		
		NomeField = new JTextField();
		NomeField.setText("PP");
		NomeField.setToolTipText("Nome completo do titular");
		NomeField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NomeField.setBounds(202, 160, 361, 29);
		contentPane.add(NomeField);
		NomeField.setColumns(10);
		
		EnderecoField = new JTextField();
		EnderecoField.setText("Rua tal");
		EnderecoField.setToolTipText("Endereco completo; Rua, Bairro, Cidade e UF");
		EnderecoField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EnderecoField.setColumns(10);
		EnderecoField.setBounds(202, 200, 361, 29);
		contentPane.add(EnderecoField);
		
		CPFField = new JTextField();
		CPFField.setText("111.835.234-32");
		CPFField.setToolTipText("CPF do titular; Formato XXX.XXX.XXX-XX");
		CPFField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CPFField.setColumns(10);
		CPFField.setBounds(202, 240, 361, 29);
		contentPane.add(CPFField);
		
		ContatoField = new JTextField();
		ContatoField.setText("(83) 8124-1511");
		ContatoField.setToolTipText("Telefone para contato. Formato (XX) XXXX-XXX");
		lblNewLabel.setLabelFor(ContatoField);
		ContatoField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ContatoField.setColumns(10);
		ContatoField.setBounds(762, 160, 361, 29);
		contentPane.add(ContatoField);
		
		CartaoField = new JTextField();
		CartaoField.setText("41234-4587-8794-7891");
		CartaoField.setToolTipText("Numero do cartao de credito do titular");
		CartaoField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CartaoField.setColumns(10);
		CartaoField.setBounds(762, 200, 361, 29);
		contentPane.add(CartaoField);
		
		lblCpf = new JLabel("Endereco");
		lblCpf.setLabelFor(EnderecoField);
		lblCpf.setToolTipText("Endereço Completo; Rua, Bairro, Cidade e UF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCpf.setBounds(67, 200, 96, 29);
		contentPane.add(lblCpf);
		
		lblCpf_1 = new JLabel("CPF");
		lblCpf_1.setToolTipText("CPF do responsável");
		lblCpf_1.setLabelFor(CPFField);
		lblCpf_1.setForeground(Color.WHITE);
		lblCpf_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCpf_1.setBounds(67, 240, 96, 29);
		contentPane.add(lblCpf_1);
		
		lblNome = new JLabel("Nome");
		lblNome.setLabelFor(NomeField);
		lblNome.setToolTipText(" Nome completo do titular");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNome.setBounds(67, 160, 96, 29);
		contentPane.add(lblNome);
		
		lblDataDeNascimento = new JLabel("Num. Cartao");
		lblDataDeNascimento.setToolTipText("Número do cartão de crédito do responsável");
		lblDataDeNascimento.setForeground(Color.WHITE);
		lblDataDeNascimento.setFont(new Font("Dialog", Font.BOLD, 18));
		lblDataDeNascimento.setBounds(625, 201, 138, 29);
		contentPane.add(lblDataDeNascimento);
		
		DiaField = new JTextField();
		DiaField.setText("01");
		DiaField.setToolTipText("Dia");
		DiaField.setHorizontalAlignment(SwingConstants.CENTER);
		DiaField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DiaField.setColumns(10);
		DiaField.setBounds(887, 240, 39, 29);
		contentPane.add(DiaField);
		
		MesField = new JTextField();
		MesField.setText("11");
		MesField.setToolTipText("Mes");
		MesField.setHorizontalAlignment(SwingConstants.CENTER);
		MesField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MesField.setColumns(10);
		MesField.setBounds(976, 240, 39, 29);
		contentPane.add(MesField);
		
		JLabel lblDataDeNascimento_1 = new JLabel("Data de Nascimento:");
		lblDataDeNascimento_1.setLabelFor(DiaField);
		lblDataDeNascimento_1.setToolTipText("Nascimento");
		lblDataDeNascimento_1.setForeground(Color.WHITE);
		lblDataDeNascimento_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblDataDeNascimento_1.setBounds(625, 241, 209, 29);
		contentPane.add(lblDataDeNascimento_1);
		
		AnoField = new JTextField();
		AnoField.setText("1996");
		AnoField.setToolTipText("Ano; Formato XXXX");
		AnoField.setHorizontalAlignment(SwingConstants.CENTER);
		AnoField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AnoField.setColumns(10);
		AnoField.setBounds(1060, 240, 63, 29);
		contentPane.add(AnoField);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(202, 315, 921, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		botaoCamaExtra = new JRadioButton("Cama Extra");
		botaoCamaExtra.setBounds(12, 86, 131, 29);
		panel.add(botaoCamaExtra);
		botaoCamaExtra.setToolTipText("Possibilidade de cama extra no quarto");
		botaoCamaExtra.setBackground(Color.WHITE);
		botaoCamaExtra.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		TotalDeHospedesField = new JTextField();
		TotalDeHospedesField.setText("1");
		TotalDeHospedesField.setBounds(878, 85, 31, 29);
		panel.add(TotalDeHospedesField);
		TotalDeHospedesField.setToolTipText("Número total de hóspedes");
		TotalDeHospedesField.setHorizontalAlignment(SwingConstants.CENTER);
		TotalDeHospedesField.setFont(new Font("Dialog", Font.PLAIN, 18));
		TotalDeHospedesField.setColumns(10);
		
		lblQunatidadeDeHspedes = new JLabel("Quantidade de hospedes");
		lblQunatidadeDeHspedes.setBounds(654, 86, 255, 28);
		panel.add(lblQunatidadeDeHspedes);
		lblQunatidadeDeHspedes.setBackground(new Color(255, 255, 255));
		lblQunatidadeDeHspedes.setToolTipText("Total de dependentes e titular");
		lblQunatidadeDeHspedes.setForeground(Color.BLACK);
		lblQunatidadeDeHspedes.setFont(new Font("Dialog", Font.BOLD, 15));
		lblQunatidadeDeHspedes.setLabelFor(TotalDeHospedesField);
		
		selecaoQuartos = new JComboBox();
		selecaoQuartos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		selecaoQuartos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				String tipo = (String) selecaoQuartos.getSelectedItem();
				Quarto selecao = TIPO_QUARTOS.get(tipo);
				try {
					quartosDisponiveis.removeAllItems();
					for (Quarto a : listaQuartos.getQuartosDisponiveis(selecao)) {
						quartosDisponiveis.addItem(a);
					}
				} catch (Exception e) {
				}
				
				if (tipo.equals("Luxo Triplo") || tipo.equals("Executivo Triplo") || tipo.equals("Presidencial")){
					botaoCamaExtra.setEnabled(false);
					botaoCamaExtra.setSelected(false);
				}
				else botaoCamaExtra.setEnabled(true);
			}
		});
		selecaoQuartos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
		selecaoQuartos.setBounds(12, 13, 897, 24);
		panel.add(selecaoQuartos);
		selecaoQuartos.setForeground(Color.DARK_GRAY);
		selecaoQuartos.setToolTipText("Escolher tipo de quarto");
		selecaoQuartos.addItem("- - - - - - - - - - - - - - - - - - ");
		selecaoQuartos.addItem("Executivo Simples");
		selecaoQuartos.addItem("Executivo Duplo");
		selecaoQuartos.addItem("Executivo Triplo");
		selecaoQuartos.addItem("Luxo Simples");
		selecaoQuartos.addItem("Luxo Duplo");
		selecaoQuartos.addItem("Luxo Triplo");
		selecaoQuartos.addItem("Presidencial");
		selecaoQuartos.setBackground(Color.WHITE);
		
		quartosDisponiveis = new JComboBox();
		quartosDisponiveis.setEnabled(false);
		quartosDisponiveis.setForeground(Color.BLACK);
		quartosDisponiveis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		quartosDisponiveis.setBackground(Color.WHITE);
		quartosDisponiveis.setBounds(12, 49, 897, 24);
		panel.add(quartosDisponiveis);
		quartosDisponiveis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quartoSelecionado = (Quarto) quartosDisponiveis.getSelectedItem();
				System.out.println(quartosDisponiveis.getSelectedItem());
			}
		});
		
		
		lblInformaespessoaisDo = new JLabel("Informacoes Pessoais do Hospede:");
		lblInformaespessoaisDo.setToolTipText("Digite as informações pedidas");
		lblInformaespessoaisDo.setForeground(Color.WHITE);
		lblInformaespessoaisDo.setFont(new Font("DejaVu Sans", Font.BOLD, 16));
		lblInformaespessoaisDo.setBounds(55, 119, 420, 29);
		contentPane.add(lblInformaespessoaisDo);
		JButton btnSalvarInformaes = new JButton("Efetuar Cadastro");
		btnSalvarInformaes.setIcon(new ImageIcon("C:\\Users\\Pedro Paulo\\Documents\\HotelRiviera\\media\\botao_finalizarcadastro.png"));
		btnSalvarInformaes.setSelectedIcon(new ImageIcon("C:\\Users\\Pedro Paulo\\Documents\\HotelRiviera\\media\\botao_finalizarcadastro.png"));
		btnSalvarInformaes.setForeground(new Color(253, 245, 230));
		btnSalvarInformaes.setBackground(Color.WHITE);
		btnSalvarInformaes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					quartoSelecionado.setNumeroPessoas(Integer.parseInt(TotalDeHospedesField.getText()));
					hospede = new Hospede(NomeField.getText(), EnderecoField.getText(), CPFField.getText(), ContatoField.getText(), new GregorianCalendar());
					contrato = new Contrato(hospede, CartaoField.getText(), Integer.parseInt(campoNumeroDiarias.getText()), quartoSelecionado);
					contrato.salva();
					MensagemPopUp popup = new MensagemPopUp("Check-in completo: Contrato efetuado com sucesso e informacoes salvas no sistema.");
					popup.setLocation(500, 450);
					popup.setVisible(true);
					popup.setAlwaysOnTop(true);
					TelaInicial.main(null);
					setVisible(false);
				} catch (Exception e1) {
					MensagemPopUp popup = new MensagemPopUp("Informacoes em falta ou incorretas.");
					popup.setLocation(500, 450);
					popup.setVisible(true);
					//System.err.println(e1.getMessage());
				}
			}
		});
		btnSalvarInformaes.setBounds(741, 631, 380, 76);
		contentPane.add(btnSalvarInformaes);	
		
		JLabel lblSeleoDoTipo = new JLabel("Selecione o tipo de quarto:");
		lblSeleoDoTipo.setToolTipText("Selecione abaixo o quarto desejado");
		lblSeleoDoTipo.setForeground(Color.WHITE);
		lblSeleoDoTipo.setFont(new Font("DejaVu Sans", Font.BOLD, 16));
		lblSeleoDoTipo.setBounds(55, 280, 420, 29);
		contentPane.add(lblSeleoDoTipo);
		
		JLabel lblDiac = new JLabel("Dia");
		lblDiac.setToolTipText("Nascimento");
		lblDiac.setForeground(Color.WHITE);
		lblDiac.setFont(new Font("Dialog", Font.BOLD, 18));
		lblDiac.setBounds(841, 240, 48, 29);
		contentPane.add(lblDiac);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setToolTipText("Nascimento");
		lblMes.setForeground(Color.WHITE);
		lblMes.setFont(new Font("Dialog", Font.BOLD, 18));
		lblMes.setBounds(930, 239, 48, 29);
		contentPane.add(lblMes);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setToolTipText("Nascimento");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAno.setBounds(1018, 239, 48, 29);
		contentPane.add(lblAno);
		
		painelEpecificacoes = new JTextPane();
		painelEpecificacoes.setForeground(Color.DARK_GRAY);
		painelEpecificacoes.setFont(new Font("Tahoma", Font.BOLD, 14));
		painelEpecificacoes.setEditable(false);
		painelEpecificacoes.setBackground(new Color(255, 255, 153));
		painelEpecificacoes.setText("\r\n - TV LCD 42''           - Ar-condicionado Split\r\n\r\n - Frigobar\r\n\r\n - Cofre");
		painelEpecificacoes.setBounds(202, 492, 921, 120);
		contentPane.add(painelEpecificacoes);
		lblEsteQuartoOferece.setVisible(false);
		painelEpecificacoes.setVisible(false);
		
		totalFatura = new JLabel("R$ ");
		totalFatura.setForeground(new Color(139, 0, 0));
		totalFatura.setFont(new Font("Tahoma", Font.BOLD, 14));
		totalFatura.setBounds(622, 653, 96, 38);
		contentPane.add(totalFatura);
		
		
		JLabel background = new JLabel("Hotel Riviera");
		background.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				if (selecaoQuartos.getSelectedItem().equals("- - - - - - - - - - - - - - - - - - ")){
					quartosDisponiveis.setEnabled(false);
					lblEsteQuartoOferece.setVisible(false);
					painelEpecificacoes.setVisible(false);
				}
				else{
					quartosDisponiveis.setEnabled(true);
					lblEsteQuartoOferece.setVisible(true);
					painelEpecificacoes.setVisible(true);try {
						if (!campoNumeroDiarias.getText().isEmpty()){
							double total = quartoSelecionado.getValorDiaria() * Integer.parseInt(campoNumeroDiarias.getText());
							totalFatura.setText("R$ " + total +"0");
						}
					} catch (Exception e) {
					}		
				}
				if (selecaoQuartos.getSelectedItem().equals("Presidencial")) painelEpecificacoes.setText(TEXTO_PRESIDENCIAL);
				else if (selecaoQuartos.getSelectedItem().equals("Luxo Simples") ||
						 selecaoQuartos.getSelectedItem().equals("Luxo Duplo")   ||
						 selecaoQuartos.getSelectedItem().equals("Luxo Triplo")) painelEpecificacoes.setText(TEXTO_LUXO);
				else if (selecaoQuartos.getSelectedItem().equals("Executivo Simples") ||
						 selecaoQuartos.getSelectedItem().equals("Executivo Duplo")   ||
						 selecaoQuartos.getSelectedItem().equals("Executivo Triplo")) painelEpecificacoes.setText(TEXTO_EXECUTIVO);
			}
		});
		background.setBounds(0, 0, 1241, 739);
		background.setIcon(new ImageIcon("C:\\Users\\Pedro Paulo\\Documents\\HotelRiviera\\media\\background_checkin.png"));
		background.setToolTipText("");
		background.setLabelFor(this);
		background.setBackground(new Color(0, 0, 0));
		contentPane.add(background);
	
	}
}

