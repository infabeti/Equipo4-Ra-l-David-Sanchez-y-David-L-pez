package App;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("ACEPTAR");	
		btnNewButton.setBounds(166, 164, 91, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 98, 269, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pulsa en el bot\u00F3n de aceptar, para continuar.");
		lblNewLabel_1.setBounds(89, 139, 253, 14);
		contentPane.add(lblNewLabel_1);

		
		
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MenuOpciones Opcion = new MenuOpciones(); // Abre la ventana de LoginContraseña
				Opcion.setVisible(true); // Hace visible la ventana de LoginContraseña
				dispose(); // Destruye esta ventana

			}

		});
	}
}
