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

import javax.swing.JRadioButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.GregorianCalendar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JList;


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
	Hospede hospede;
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
	 */
	public TelaCheckin() {
		setResizable(false);
		setTitle("Hotel Riviera - Sistema de Manuten\u00E7\u00E3o de Clientes e Servi\u00E7os - Check-in");
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
		btnNewButton.setSelectedIcon(new ImageIcon("media/botao_voltaraoinicio.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.main(null);
				setVisible(false);
			}
		});
		
		TotalDeHospedesField = new JTextField();
		TotalDeHospedesField.setToolTipText("Número total de hóspedes");
		TotalDeHospedesField.setHorizontalAlignment(SwingConstants.CENTER);
		TotalDeHospedesField.setFont(new Font("Dialog", Font.PLAIN, 18));
		TotalDeHospedesField.setColumns(10);
		TotalDeHospedesField.setBounds(1082, 299, 31, 29);
		contentPane.add(TotalDeHospedesField);
		
		lblNewLabel = new JLabel("Tel. Contato");
		lblNewLabel.setToolTipText("Contato");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(625, 160, 96, 29);
		contentPane.add(lblNewLabel);
		
		lblQunatidadeDeHspedes = new JLabel("Quantidade de hóspedes");
		lblQunatidadeDeHspedes.setLabelFor(TotalDeHospedesField);
		lblQunatidadeDeHspedes.setBackground(new Color(255, 255, 255));
		lblQunatidadeDeHspedes.setToolTipText("Nascimento");
		lblQunatidadeDeHspedes.setForeground(Color.BLACK);
		lblQunatidadeDeHspedes.setFont(new Font("Dialog", Font.BOLD, 15));
		lblQunatidadeDeHspedes.setBounds(866, 300, 255, 28);
		contentPane.add(lblQunatidadeDeHspedes);
		btnNewButton.setBounds(45, 639, 168, 74);
		contentPane.add(btnNewButton);
		
		NomeField = new JTextField();
		NomeField.setToolTipText("Nome completo do hóspede responsável");
		NomeField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NomeField.setBounds(202, 160, 361, 29);
		contentPane.add(NomeField);
		NomeField.setColumns(10);
		
		EnderecoField = new JTextField();
		EnderecoField.setToolTipText("Endereço completo; Rua, Bairro, Cidade e UF");
		EnderecoField.setFont(new Font("Dialog", Font.PLAIN, 18));
		EnderecoField.setColumns(10);
		EnderecoField.setBounds(202, 200, 361, 29);
		contentPane.add(EnderecoField);
		
		CPFField = new JTextField();
		CPFField.setToolTipText("CPF do responsável");
		CPFField.setFont(new Font("Dialog", Font.PLAIN, 18));
		CPFField.setColumns(10);
		CPFField.setBounds(202, 240, 361, 29);
		contentPane.add(CPFField);
		
		ContatoField = new JTextField();
		ContatoField.setToolTipText("Telefone para contato. Formato (XX) XXXX-XXX");
		lblNewLabel.setLabelFor(ContatoField);
		ContatoField.setFont(new Font("Dialog", Font.PLAIN, 18));
		ContatoField.setColumns(10);
		ContatoField.setBounds(762, 160, 361, 29);
		contentPane.add(ContatoField);
		
		CartaoField = new JTextField();
		CartaoField.setToolTipText("Número do cartão de crédito do responsável");
		CartaoField.setFont(new Font("Dialog", Font.PLAIN, 18));
		CartaoField.setColumns(10);
		CartaoField.setBounds(762, 200, 361, 29);
		contentPane.add(CartaoField);
		
		JButton btnSalvarInformaes = new JButton("Efetuar Cadastro");
		btnSalvarInformaes.setForeground(new Color(240, 128, 128));
		btnSalvarInformaes.setBackground(UIManager.getColor("Button.light"));
		btnSalvarInformaes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					hospede = new Hospede(NomeField.getText(), EnderecoField.getText(), CPFField.getText(), ContatoField.getText(), new GregorianCalendar());
				} catch (Exception e1) {
					System.err.println(e1.getMessage());
				}
				TelaInicial.main(null);
				setVisible(false);
				System.out.println(hospede);
			}
		});
		btnSalvarInformaes.setBounds(422, 607, 361, 74);
		contentPane.add(btnSalvarInformaes);
		
		lblCpf = new JLabel("Endereço");
		lblCpf.setLabelFor(EnderecoField);
		lblCpf.setToolTipText("Endereço");
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
		lblNome.setToolTipText("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNome.setBounds(67, 160, 96, 29);
		contentPane.add(lblNome);
		
		lblDataDeNascimento = new JLabel("Num. Cartão");
		lblDataDeNascimento.setToolTipText("Nascimento");
		lblDataDeNascimento.setForeground(Color.WHITE);
		lblDataDeNascimento.setFont(new Font("Dialog", Font.BOLD, 18));
		lblDataDeNascimento.setBounds(625, 201, 138, 29);
		contentPane.add(lblDataDeNascimento);
		
		DiaField = new JTextField();
		DiaField.setToolTipText("Dia");
		DiaField.setHorizontalAlignment(SwingConstants.CENTER);
		DiaField.setFont(new Font("Dialog", Font.PLAIN, 18));
		DiaField.setColumns(10);
		DiaField.setBounds(887, 240, 39, 29);
		contentPane.add(DiaField);
		
		MesField = new JTextField();
		MesField.setToolTipText("Mês");
		MesField.setHorizontalAlignment(SwingConstants.CENTER);
		MesField.setFont(new Font("Dialog", Font.PLAIN, 18));
		MesField.setColumns(10);
		MesField.setBounds(976, 240, 39, 29);
		contentPane.add(MesField);
		
		JLabel lblDataDeNascimento_1 = new JLabel("Data de Nascimento:  Dia        Mês        Ano");
		lblDataDeNascimento_1.setLabelFor(DiaField);
		lblDataDeNascimento_1.setToolTipText("Nascimento");
		lblDataDeNascimento_1.setForeground(Color.WHITE);
		lblDataDeNascimento_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblDataDeNascimento_1.setBounds(625, 241, 446, 29);
		contentPane.add(lblDataDeNascimento_1);
		
		AnoField = new JTextField();
		AnoField.setToolTipText("Ano; Formato XXXX");
		AnoField.setHorizontalAlignment(SwingConstants.CENTER);
		AnoField.setFont(new Font("Dialog", Font.PLAIN, 18));
		AnoField.setColumns(10);
		AnoField.setBounds(1060, 240, 63, 29);
		contentPane.add(AnoField);
		
		botaoCamaExtra = new JRadioButton("Cama Extra");
		botaoCamaExtra.setToolTipText("Possibilidade de cama extra no quarto");
		botaoCamaExtra.setBackground(Color.WHITE);
		botaoCamaExtra.setFont(new Font("Tahoma", Font.BOLD, 15));
		botaoCamaExtra.setBounds(202, 300, 131, 29);
		contentPane.add(botaoCamaExtra);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(202, 291, 921, 45);
		contentPane.add(panel);
		
		lblInformaespessoaisDo = new JLabel("Informações Pessoais do Hosṕede");
		lblInformaespessoaisDo.setToolTipText("Nascimento");
		lblInformaespessoaisDo.setForeground(Color.WHITE);
		lblInformaespessoaisDo.setFont(new Font("DejaVu Sans", Font.BOLD, 16));
		lblInformaespessoaisDo.setBounds(55, 119, 420, 29);
		contentPane.add(lblInformaespessoaisDo);
		
		JList list_1 = new JList();
		list_1.setSelectedIndex(1);
		list_1.setBounds(202, 408, 919, 65);
		contentPane.add(list_1);
		
		JLabel background = new JLabel("Hotel Riviera");
		background.setBounds(0, 0, 1241, 739);
		background.setIcon(new ImageIcon("media/background_checkin.png"));
		background.setToolTipText("");
		background.setLabelFor(this);
		background.setBackground(Color.BLACK);
		contentPane.add(background);
	}
}
