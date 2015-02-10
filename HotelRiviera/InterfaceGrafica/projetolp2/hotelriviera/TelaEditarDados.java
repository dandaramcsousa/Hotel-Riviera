package projetolp2.hotelriviera;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaEditarDados extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton botaoAtualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEditarDados frame = new TelaEditarDados();
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
	public TelaEditarDados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(188, 143, 143));
		panel.setBounds(0, 0, 548, 422);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nome");
		label.setToolTipText(" Nome completo do titular");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setBounds(12, 92, 96, 29);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Endereço");
		label_1.setToolTipText("Endereço Completo; Rua, Bairro, Cidade e UF");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 18));
		label_1.setBounds(12, 132, 96, 29);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("CPF");
		label_2.setToolTipText("CPF do responsável");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.BOLD, 18));
		label_2.setBounds(12, 172, 96, 29);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setToolTipText("Nome completo do titular");
		textField.setText("PP");
		textField.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(147, 92, 361, 29);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Endereço completo; Rua, Bairro, Cidade e UF");
		textField_1.setText("Rua tal");
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(147, 132, 361, 29);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("CPF do responsável; Formato XXX.XXX.XXX-XX");
		textField_2.setText("111.835.234-32");
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(147, 172, 361, 29);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Telefone para contato. Formato (XX) XXXX-XXX");
		textField_3.setText("(83) 8124-1511");
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(147, 213, 361, 29);
		panel.add(textField_3);
		
		JLabel label_3 = new JLabel("Tel. Contato");
		label_3.setToolTipText("Telefone para contato. Formato (XX) XXXX-XXX");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.BOLD, 18));
		label_3.setBounds(12, 213, 158, 29);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Num. Cartão");
		label_4.setToolTipText("Número do cartão de crédito do responsável");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Dialog", Font.BOLD, 18));
		label_4.setBounds(12, 254, 138, 29);
		panel.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Mês");
		textField_4.setText("11");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(363, 293, 39, 29);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Ano; Formato XXXX");
		textField_5.setText("1996");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(445, 293, 63, 29);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("Dia");
		textField_6.setText("01");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(274, 293, 39, 29);
		panel.add(textField_6);
		
		JLabel label_5 = new JLabel("Data de Nascimento:  Dia        Mês        Ano");
		label_5.setToolTipText("Nascimento");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Dialog", Font.BOLD, 18));
		label_5.setBounds(12, 294, 446, 29);
		panel.add(label_5);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("Número do cartão de crédito do responsável");
		textField_7.setText("41234-4587-8794-7891");
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(147, 254, 361, 29);
		panel.add(textField_7);
		
		botaoAtualizar = new JButton("Atualizar dados");
		botaoAtualizar.setBounds(147, 334, 260, 47);
		panel.add(botaoAtualizar);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel}));
	}
}
