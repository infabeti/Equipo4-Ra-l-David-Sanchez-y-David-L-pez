package App;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MenuOpciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuOpciones frame = new MenuOpciones();
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
	public MenuOpciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Operaciones");
		lblNewLabel.setBounds(5, 5, 424, 17);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);

		JButton btnFactura = new JButton("Ticket");
		btnFactura.setBounds(50, 72, 89, 23);
		contentPane.add(btnFactura);

		JButton btnAprovisionamiento = new JButton("Aprovisionamiento");
		btnAprovisionamiento .setBounds(25, 165, 137, 23);
		contentPane.add(btnAprovisionamiento );

		JButton btnPedido = new JButton("Pedido");
		btnPedido.setBounds(276, 72, 89, 23);
		contentPane.add(btnPedido);

		JButton btnComandas = new JButton("Comandas");
		btnComandas.setBounds(276, 165, 89, 23);
		contentPane.add(btnComandas);

		JButton btnCerrarPrograma = new JButton("Cerrar Programa");
		btnCerrarPrograma.setBounds(160, 227, 113, 23);
		contentPane.add(btnCerrarPrograma);


		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FacturaCafeteria Factura = new FacturaCafeteria(); // Abre la ventana de Ticket
				Factura.setVisible(true); // Hace visible la ventana de Ticket
				dispose(); // Destruye esta ventana

			}

		});
		btnPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido MenuPedido = new Pedido(); // Abre la ventana de Ticket
				MenuPedido.setVisible(true); // Hace visible la ventana de Ticket
				dispose(); // Destruye esta ventana
				
			}
		});

	}

}
