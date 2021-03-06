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
import javax.swing.JTextPane;


public class TelaCheckout extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton button;
	private JTextPane txtpnTotalDaFatura;
	private JButton botaoImprimirFatura;
	private JButton botaoFecharContrato;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCheckout frame = new TelaCheckout();
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
	public TelaCheckout() {
		setResizable(false);
		setTitle("Hotel Riviera - Sistema de Manuten\u00E7\u00E3o de Clientes e Servi\u00E7os - Check-out");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Media/icone_janela.png"));
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
		btnNewButton.setSelectedIcon(new ImageIcon("media\\botao_voltaraoinicio.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.main(null);
				setVisible(false);
			}
		});
		
		botaoFecharContrato = new JButton("Fechar contrato");
		botaoFecharContrato.setEnabled(false);
		botaoFecharContrato.setFont(new Font("Tahoma", Font.BOLD, 18));
		botaoFecharContrato.setBackground(Color.WHITE);
		botaoFecharContrato.setBounds(211, 519, 323, 102);
		contentPane.add(botaoFecharContrato);
		
		botaoImprimirFatura = new JButton("Imprimir fatura");
		botaoImprimirFatura.setEnabled(false);
		botaoImprimirFatura.setFont(new Font("Tahoma", Font.BOLD, 18));
		botaoImprimirFatura.setBackground(Color.WHITE);
		botaoImprimirFatura.setBounds(211, 348, 323, 102);
		contentPane.add(botaoImprimirFatura);
		
		txtpnTotalDaFatura = new JTextPane();
		txtpnTotalDaFatura.setForeground(Color.DARK_GRAY);
		txtpnTotalDaFatura.setToolTipText("");
		txtpnTotalDaFatura.setText("------------------------------------------------------                       Total da Fatura");
		txtpnTotalDaFatura.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnTotalDaFatura.setEditable(false);
		txtpnTotalDaFatura.setBounds(677, 371, 397, 275);
		contentPane.add(txtpnTotalDaFatura);
		btnNewButton.setBounds(45, 639, 168, 74);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(677, 167, 60, 38);
		contentPane.add(textField);
		
		button = new JButton("New button");
		button.setIcon(new ImageIcon("media/botao_pesquisa.png"));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.WHITE);
		button.setBounds(763, 156, 60, 59);
		contentPane.add(button);
		
		JLabel background = new JLabel("Hotel Riviera");
		background.setBounds(0, 0, 1241, 739);
		background.setIcon(new ImageIcon("media/background_checkout.png"));
		background.setToolTipText("");
		background.setLabelFor(this);
		background.setBackground(Color.BLACK);
		contentPane.add(background);
	}

}

