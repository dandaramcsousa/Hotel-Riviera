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
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JComboBox;


public class TelaConsulta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsulta frame = new TelaConsulta();
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
	public TelaConsulta() {
		setResizable(false);
		setTitle("Hotel Riviera - Sistema de Manuten\u00E7\u00E3o de Clientes e Servi\u00E7os - Consulta");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Pedro Paulo\\workspace\\hotelriviera\\Media\\icone_janela.png"));
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
		btnNewButton.setIcon(new ImageIcon("/home/pedropfo/Música/HotelRiviera/media/botao_voltaraoinicio.png"));
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\Pedro Paulo\\workspace\\hotelriviera\\Media\\botao_voltaraoinicio.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.main(null);
				setVisible(false);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Remover servi\u00E7o");
		btnNewButton_2.setToolTipText("Remover o servi\u00E7o selecionado");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(841, 315, 279, 29);
		contentPane.add(btnNewButton_2);
		
		JTextPane informacoesQuarto = new JTextPane();
		informacoesQuarto.setEditable(false);
		informacoesQuarto.setText("toString do quarto");
		informacoesQuarto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		informacoesQuarto.setBounds(83, 410, 348, 197);
		contentPane.add(informacoesQuarto);
		
		JLabel lblXx = new JLabel("XXXX");
		lblXx.setForeground(new Color(139, 0, 0));
		lblXx.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblXx.setBounds(260, 383, 43, 16);
		contentPane.add(lblXx);
		btnNewButton.setBounds(45, 639, 168, 74);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(678, 168, 60, 38);
		contentPane.add(textField);
		
		JTextPane informacoesHospedeServicos = new JTextPane();
		informacoesHospedeServicos.setEditable(false);
		informacoesHospedeServicos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		informacoesHospedeServicos.setText("toString do hospede e dos servi\u00E7os ");
		informacoesHospedeServicos.setBounds(449, 301, 348, 306);
		contentPane.add(informacoesHospedeServicos);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Pedro Paulo\\workspace\\HotelRiviera\\Media\\botao_pesquisa.png"));
		btnNewButton_1.setBounds(763, 155, 60, 59);
		contentPane.add(btnNewButton_1);
		
		JComboBox selecaoAdicionais = new JComboBox();
		selecaoAdicionais.setToolTipText("Servi\u00E7os contratados");
		selecaoAdicionais.setBackground(Color.WHITE);
		selecaoAdicionais.setBounds(841, 275, 279, 29);
		contentPane.add(selecaoAdicionais);
		
		JButton btnModificarDados = new JButton("Modificar dados");
		btnModificarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaEditarDados telaEdicao = new TelaEditarDados();
				telaEdicao.setVisible(true);
				telaEdicao.move(950, 450);
			}
		});
		btnModificarDados.setBackground(Color.WHITE);
		btnModificarDados.setBounds(841, 552, 279, 59);
		contentPane.add(btnModificarDados);
		
		JLabel background = new JLabel("Hotel Riviera");
		background.setBounds(0, 0, 1241, 739);
		background.setIcon(new ImageIcon("/home/pedropfo/Música/HotelRiviera/media/background_consulta.png"));
		background.setToolTipText("");
		background.setLabelFor(this);
		background.setBackground(Color.BLACK);
		contentPane.add(background);
	}
}

