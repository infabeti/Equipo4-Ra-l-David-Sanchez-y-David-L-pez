package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import App.FacturaCafeteria;
import App.Pedido;
import Controlador.ControladorPanelGeneros;

public class PanelMenu extends JPanel {

	private JButton btnCerrarPrograma;
	private JButton btnFactura;
	private JButton btnAprovisionamiento;
	private JButton btnPedido;
	private JButton btnComandas;
	private JLabel lblTituloMenu;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	
	
	
	
	
	
	
	
	public PanelMenu() {
		
		setBounds(100, 100, 450, 300);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);

		JLabel lblTituloMenu = new JLabel("Operaciones");
		lblTituloMenu.setBounds(5, 5, 424, 17);
		lblTituloMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblTituloMenu);

		JButton btnFactura = new JButton("Ticket");
		btnFactura.setBounds(27, 72, 112, 23);
		add(btnFactura);

		JButton btnAprovisionamiento = new JButton("Aprovisionamiento");
		btnAprovisionamiento.setBounds(27, 205, 172, 23);
		add(btnAprovisionamiento);

		JButton btnPedido = new JButton("Pedido");
		btnPedido.setBounds(27, 115, 120, 23);
		add(btnPedido);

		JButton btnComandas = new JButton("Comandas");
		btnComandas.setBounds(27, 160, 120, 23);
		add(btnComandas);

		JButton btnCerrarPrograma = new JButton("Desconectar");
		btnCerrarPrograma.setBounds(281, 205, 143, 23);
		add(btnCerrarPrograma);

		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FacturaCafeteria Factura = new FacturaCafeteria(); // Abre la ventana de Factura
				Factura.setVisible(true); // Hace visible la ventana de Factura
				// Destruye esta ventana

			}

		});
		btnPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido MenuPedido = new Pedido(); // Abre la ventana de Pedido
				MenuPedido.setVisible(true); // Hace visible la ventana de Pedido
				 // Destruye esta ventana

			}
		});
		btnCerrarPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Destruye esta ventana

			}
		});

	}

}
