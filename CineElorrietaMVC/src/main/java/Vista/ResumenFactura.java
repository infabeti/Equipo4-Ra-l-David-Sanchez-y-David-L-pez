package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controlador.ControladorFactura;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResumenFactura extends JPanel {
	private JTable tableConfirmacionFactura;
	private JButton btnResumFactuSI;
	private JButton btnResumFactuNO;
	private ControladorFactura controladorFactura;
	/**
	 * Create the panel.
	 * @param controladorFactura 
	 */
	public ResumenFactura(ControladorFactura controladorFactura) {
		setLayout(null);
		
		JLabel lblTituloResumenFactura = new JLabel("Confirmacion Factura");
		lblTituloResumenFactura.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTituloResumenFactura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloResumenFactura.setBounds(0, 0, 450, 29);
		add(lblTituloResumenFactura);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 29, 315, 238);
		add(scrollPane);
		
		tableConfirmacionFactura = new JTable();
		tableConfirmacionFactura.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Producto", "Precio", "Cantidad"
			}
		));
		scrollPane.setViewportView(tableConfirmacionFactura);
		
		JLabel lblTextoResumenFactura = new JLabel("\u00BFImprimir y guardar factura?");
		lblTextoResumenFactura.setBounds(21, 292, 178, 14);
		add(lblTextoResumenFactura);
		
		JButton btnResumFactuSI = new JButton("Si");		
		btnResumFactuSI.setBounds(21, 336, 89, 23);
		add(btnResumFactuSI);
		
		JButton btnResumFactuNO = new JButton("No");
		btnResumFactuNO.setBounds(166, 336, 89, 23);
		add(btnResumFactuNO);
		
		
		
		initializeEvents();
	}

	private void initializeEvents() {
		this.btnResumFactuSI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorFactura.accionadoBotonResumFactuSi();
			}
		});
		this.btnResumFactuNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorFactura.accionadoBotonResumFactuNo();
			}
		});
		
	}

	

	
}
