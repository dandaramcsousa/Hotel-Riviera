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


public class TelaServicos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numeroDoQuarto;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
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
		setTitle("Hotel Riviera - Sistema de Manuten\u00E7\u00E3o de Clientes e Servi\u00E7os - Servi�os");
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
		
		JButton btnNewButton_1 = new JButton("Contratar servi\u00E7o");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(927, 271, 178, 87);
		contentPane.add(btnNewButton_1);
		
		JLabel lblIdade = new JLabel("Idade da crian\u00E7a");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBackground(Color.WHITE);
		lblIdade.setBounds(550, 421, 130, 25);
		contentPane.add(lblIdade);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(677, 421, 47, 25);
		contentPane.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(660, 323, 147, 25);
		contentPane.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(660, 290, 39, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tanque cheio");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(366, 314, 178, 38);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("Seguro Incluso");
		radioButton.setBackground(Color.WHITE);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton.setBounds(366, 284, 178, 38);
		contentPane.add(radioButton);
		
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
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 21, 73, 24);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblValorDaRefeio = new JLabel("Valor da refei\u00E7\u00E3o:");
		lblValorDaRefeio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorDaRefeio.setBounds(10, 21, 157, 22);
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
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(145, 32, 47, 25);
		panel_1.add(textField_3);
		
		JRadioButton rdbtnHoraDobrada = new JRadioButton("Hora dobrada");
		rdbtnHoraDobrada.setBounds(10, 7, 178, 24);
		panel_1.add(rdbtnHoraDobrada);
		rdbtnHoraDobrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnHoraDobrada.setBackground(Color.WHITE);
		
		JButton btnContratarServio = new JButton("Contratar servi\u00E7o");
		btnContratarServio.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnContratarServio.setBackground(Color.WHITE);
		btnContratarServio.setBounds(927, 400, 178, 87);
		contentPane.add(btnContratarServio);
		
		JButton btnContratarServio_1 = new JButton("Contratar servi\u00E7o");
		btnContratarServio_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnContratarServio_1.setBackground(Color.WHITE);
		btnContratarServio_1.setBounds(927, 524, 178, 87);
		contentPane.add(btnContratarServio_1);
		
		JLabel background = new JLabel("Hotel Riviera");
		background.setBounds(0, 0, 1241, 739);
		background.setIcon(new ImageIcon("/home/pedropfo/Música/HotelRiviera/media/background_servicos.png"));
		background.setToolTipText("");
		background.setLabelFor(this);
		background.setBackground(Color.BLACK);
		contentPane.add(background);
	}
}

