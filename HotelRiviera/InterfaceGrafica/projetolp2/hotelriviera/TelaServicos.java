package projetolp2.hotelriviera;

import java.awt.EventQueue;

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
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;


public class TelaServicos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numeroDoQuarto;
	private JTextField campoDias;
	private JTextField campoIdade;
	private JTextField campoRefeicao;
	private JTextField campoHoras;
	private JButton botaoContratarCarro;
	private JButton botaoContratarBabysitter;
	private JButton botaoContratarRefeicao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaServicos frame = new TelaServicos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaServicos() {
		setResizable(false);
		setTitle("Hotel Riviera - Sistema de Manutencao de Clientes e Servicos - Servicos");
		setIconImage(Toolkit.getDefaultToolkit().getImage("media/icone_janela.png"));
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 1204, 766);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setToolTipText("Oi");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(188, 143, 143));
		btnNewButton.setIcon(new ImageIcon("media/botao_voltaraoinicio.png"));
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setSelectedIcon(new ImageIcon("Media/botao_voltaraoinicio.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.main(null);
				setVisible(false);
			}
		});
		
		
		
		JLabel lblIdade = new JLabel("Idade da crianca");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBackground(Color.WHITE);
		lblIdade.setBounds(550, 421, 130, 25);
		contentPane.add(lblIdade);
		
		campoIdade = new JTextField();
		campoIdade.setHorizontalAlignment(SwingConstants.CENTER);
		campoIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		campoIdade.setColumns(10);
		campoIdade.setBounds(677, 421, 47, 25);
		contentPane.add(campoIdade);
		
		JComboBox selecaoCarro = new JComboBox();
		selecaoCarro.setBackground(Color.WHITE);
		selecaoCarro.setBounds(660, 323, 191, 25);
		selecaoCarro.addItem("Executivo - Diaria R$60.00");
		selecaoCarro.addItem("Luxo - Diaria R$100.00");
		contentPane.add(selecaoCarro);
		
		campoDias = new JTextField();
		campoDias.setFont(new Font("Tahoma", Font.PLAIN, 14));
		campoDias.setHorizontalAlignment(SwingConstants.CENTER);
		campoDias.setBounds(660, 290, 39, 25);
		contentPane.add(campoDias);
		campoDias.setColumns(10);
		
		numeroDoQuarto = new JTextField();
		numeroDoQuarto.setHorizontalAlignment(SwingConstants.CENTER);
		numeroDoQuarto.setFont(new Font("Tahoma", Font.BOLD, 20));
		numeroDoQuarto.setBounds(677, 167, 60, 38);
		contentPane.add(numeroDoQuarto);
		numeroDoQuarto.setColumns(10);
		
		JLabel lblTotalDeDias = new JLabel("Total de dias");
		lblTotalDeDias.setBackground(Color.WHITE);
		lblTotalDeDias.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalDeDias.setBounds(550, 290, 94, 25);
		contentPane.add(lblTotalDeDias);
		
		JLabel lblTipoDeCarro = new JLabel("Tipo de carro");
		lblTipoDeCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoDeCarro.setBounds(550, 321, 130, 25);
		contentPane.add(lblTipoDeCarro);
		btnNewButton.setBounds(45, 639, 168, 74);
		contentPane.add(btnNewButton);
		
		JRadioButton marcadorTanque = new JRadioButton("Tanque cheio");
		marcadorTanque.setBackground(Color.WHITE);
		marcadorTanque.setFont(new Font("Tahoma", Font.PLAIN, 14));
		marcadorTanque.setBounds(366, 314, 178, 38);
		contentPane.add(marcadorTanque);
		
		JRadioButton marcadorSeguro = new JRadioButton("Seguro Incluso");
		marcadorSeguro.setBackground(Color.WHITE);
		marcadorSeguro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		marcadorSeguro.setBounds(366, 284, 178, 38);
		contentPane.add(marcadorSeguro);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(349, 284, 515, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(349, 535, 515, 68);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		campoRefeicao = new JTextField();
		campoRefeicao.setBounds(230, 22, 73, 24);
		panel_2.add(campoRefeicao);
		campoRefeicao.setColumns(10);
		
		JLabel lblValorDaRefeio = new JLabel("Valor da refeicao (em R$ X.XX):");
		lblValorDaRefeio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorDaRefeio.setBounds(10, 21, 223, 22);
		panel_2.add(lblValorDaRefeio);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(349, 409, 515, 68);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHorasAContratar = new JLabel("Horas a contratar");
		lblHorasAContratar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHorasAContratar.setBackground(Color.WHITE);
		lblHorasAContratar.setBounds(10, 32, 130, 25);
		panel_1.add(lblHorasAContratar);
		
		campoHoras = new JTextField();
		campoHoras.setHorizontalAlignment(SwingConstants.CENTER);
		campoHoras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		campoHoras.setColumns(10);
		campoHoras.setBounds(145, 32, 47, 25);
		panel_1.add(campoHoras);
		
		JRadioButton rdbtnHoraDobrada = new JRadioButton("Hora dobrada");
		rdbtnHoraDobrada.setBounds(10, 7, 178, 24);
		panel_1.add(rdbtnHoraDobrada);
		rdbtnHoraDobrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnHoraDobrada.setBackground(Color.WHITE);
		
		botaoContratarBabysitter = new JButton("Contratar servico");
		botaoContratarBabysitter.setEnabled(false);
		botaoContratarBabysitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int idade = Integer.parseInt(campoIdade.getText());
					if (idade < 2 || idade > 7){
						MensagemPopUp popup = new MensagemPopUp("Apenas criancas entre 2 e 7 anos.");
						popup.setLocation(500, 450);
						popup.setVisible(true);
					}
					else if (!campoHoras.getText().equals("") && !campoIdade.getText().equals("")){
						MensagemPopUp popup = new MensagemPopUp("Serviço contratado com sucesso.");
						popup.setLocation(500, 450);
						popup.setVisible(true);
					}
					
					else{
						MensagemPopUp popup = new MensagemPopUp("Os campos Horas a contratar e Idade da crianca devem ser preenchidos para efetuar o contrato.");
						popup.setLocation(500, 450);
						popup.setVisible(true);
					}
				}catch(Exception E){
					MensagemPopUp popup = new MensagemPopUp("Informe um número inteiro para a idade da criança.");
					popup.setLocation(500, 450);
					popup.setVisible(true);
				}				
			}
		});
		botaoContratarBabysitter.setFont(new Font("Tahoma", Font.BOLD, 14));
		botaoContratarBabysitter.setBackground(Color.WHITE);
		botaoContratarBabysitter.setBounds(927, 400, 178, 87);
		contentPane.add(botaoContratarBabysitter);
		
		botaoContratarRefeicao = new JButton("Contratar servico");
		botaoContratarRefeicao.setEnabled(false);
		botaoContratarRefeicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!campoRefeicao.getText().equals("")){
					MensagemPopUp popup = new MensagemPopUp("Serviço contratado com sucesso.");
					popup.setLocation(500, 450);
					popup.setVisible(true);
				}
				else{
					MensagemPopUp popup = new MensagemPopUp("O campo Total de dias deve ser preenchido para efetuar o contrato.");
					popup.setLocation(500, 450);
					popup.setVisible(true);
				}
			}
		});
		botaoContratarRefeicao.setFont(new Font("Tahoma", Font.BOLD, 14));
		botaoContratarRefeicao.setBackground(Color.WHITE);
		botaoContratarRefeicao.setBounds(927, 524, 178, 87);
		contentPane.add(botaoContratarRefeicao);
		
		botaoContratarCarro = new JButton("Contratar servico");
		botaoContratarCarro.setEnabled(false);
		botaoContratarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!campoDias.getText().equals("")){
					MensagemPopUp popup = new MensagemPopUp("Serviço contratado com sucesso.");
					popup.setLocation(500, 450);
					popup.setVisible(true);
				}
				else{
					MensagemPopUp popup = new MensagemPopUp("O campo Total de dias deve ser preenchido para efetuar o contrato.");
					popup.setLocation(500, 450);
					popup.setVisible(true);
				}
			}
		});
		botaoContratarCarro.setFont(new Font("Tahoma", Font.BOLD, 14));
		botaoContratarCarro.setBackground(new Color(255, 255, 255));
		botaoContratarCarro.setBounds(927, 271, 178, 87);
		contentPane.add(botaoContratarCarro);
		
		JLabel background = new JLabel("Hotel Riviera");
		background.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				if (campoDias.getText().equals("")) botaoContratarCarro.setEnabled(false);
				else botaoContratarCarro.setEnabled(true);
				if (campoHoras.getText().equals("") || campoIdade.getText().equals("")) botaoContratarBabysitter.setEnabled(false);
				else botaoContratarBabysitter.setEnabled(true);
				if (campoRefeicao.getText().equals("")) botaoContratarRefeicao.setEnabled(false);
				else botaoContratarRefeicao.setEnabled(true);
			}
		});
		background.setBounds(0, 0, 1241, 739);
		background.setIcon(new ImageIcon("media/background_servicos.png"));
		background.setToolTipText("");
		background.setLabelFor(this);
		background.setBackground(Color.BLACK);
		contentPane.add(background);
	}
}

