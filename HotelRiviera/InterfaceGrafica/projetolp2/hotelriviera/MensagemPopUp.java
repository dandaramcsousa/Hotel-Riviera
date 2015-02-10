package projetolp2.hotelriviera;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class MensagemPopUp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MensagemPopUp(String mensagem) {
		setTitle("Aviso");
		setIconImage(Toolkit.getDefaultToolkit().getImage("media/icone_janela.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 149);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoConfirmar = new JButton("OK");
		botaoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		botaoConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		botaoConfirmar.setBackground(UIManager.getColor("Button.light"));
		botaoConfirmar.setBounds(130, 77, 170, 29);
		contentPane.add(botaoConfirmar);
		
		JTextPane caixaMensagem = new JTextPane();
		caixaMensagem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		caixaMensagem.setEditable(false);
		caixaMensagem.setText(mensagem);
		caixaMensagem.setBackground(UIManager.getColor("Button.background"));
		caixaMensagem.setBounds(23, 21, 368, 50);
		contentPane.add(caixaMensagem);
	}
}
