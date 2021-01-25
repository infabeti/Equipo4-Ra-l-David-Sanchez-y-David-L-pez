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
		btnFactura.setBounds(27, 72, 112, 23);
		contentPane.add(btnFactura);

		JButton btnAprovisionamiento = new JButton("Aprovisionamiento");
		btnAprovisionamiento.setBounds(27, 205, 172, 23);
		contentPane.add(btnAprovisionamiento);

		JButton btnPedido = new JButton("Pedido");
		btnPedido.setBounds(27, 115, 120, 23);
		contentPane.add(btnPedido);

		JButton btnComandas = new JButton("Comandas");
		btnComandas.setBounds(27, 160, 120, 23);
		contentPane.add(btnComandas);

		JButton btnCerrarPrograma = new JButton("Desconectar");
		btnCerrarPrograma.setBounds(281, 205, 143, 23);
		contentPane.add(btnCerrarPrograma);

		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FacturaCafeteria Factura = new FacturaCafeteria(); // Abre la ventana de Factura
				Factura.setVisible(true); // Hace visible la ventana de Factura
				dispose(); // Destruye esta ventana

			}

		});
		btnPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido MenuPedido = new Pedido(); // Abre la ventana de Pedido
				MenuPedido.setVisible(true); // Hace visible la ventana de Pedido
				dispose(); // Destruye esta ventana

			}
		});
		btnCerrarPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Destruye esta ventana

			}
		});

	}

}
