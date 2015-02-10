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


public class TelaInicial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setTitle("Hotel Riviera - Sistema de Manuten\u00E7\u00E3o de Clientes e Servi\u00E7os");
		setIconImage(Toolkit.getDefaultToolkit().getImage("media/icone_janela.png"));
		setForeground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 1204, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setToolTipText("Oi");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botao_checkin = new JButton("Check-In");
		botao_checkin.setSelectedIcon(new ImageIcon("media/botao_checkin.png"));
		botao_checkin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCheckin.main(null);
				setVisible(false);
			}
		});
		botao_checkin.setIcon(new ImageIcon("media/botao_checkin.png"));
		botao_checkin.setBackground(Color.WHITE);
		botao_checkin.setBounds(202, 257, 392, 194);
		contentPane.add(botao_checkin);
		
		JButton botao_servicos = new JButton("Servi\u00E7os");
		botao_servicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaServicos.main(null);
				setVisible(false);
			}
		});
		botao_servicos.setIcon(new ImageIcon("media/botao_servicos.png"));
		botao_servicos.setBackground(Color.WHITE);
		botao_servicos.setBounds(610, 257, 392, 194);
		contentPane.add(botao_servicos);
		
		JButton botao_consulta = new JButton("Consulta");
		botao_consulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsulta.main(null);
				setVisible(false);
			}
		});
		botao_consulta.setIcon(new ImageIcon("media/botao_consulta.png"));
		botao_consulta.setSelectedIcon(new ImageIcon("media/botao_consulta.png"));
		botao_consulta.setBackground(Color.WHITE);
		botao_consulta.setBounds(202, 472, 392, 194);
		contentPane.add(botao_consulta);
		
		JButton botao_checkout = new JButton("Check-out");
		botao_checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCheckout.main(null);
				setVisible(false);
			}
		});
		botao_checkout.setIcon(new ImageIcon("media/botao_checkout.png"));
		botao_checkout.setBackground(Color.WHITE);
		botao_checkout.setBounds(610, 472, 392, 194);
		contentPane.add(botao_checkout);
		
		JLabel background = new JLabel("Hotel Riviera");
		background.setBounds(0, 0, 1241, 739);
		background.setIcon(new ImageIcon("media/background_telainicial.png"));
		background.setToolTipText("");
		background.setLabelFor(this);
		background.setBackground(Color.BLACK);
		contentPane.add(background);
	}
}
