package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.ControladorFactura;
import Controlador.ControladorMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Factura extends JPanel {
	private JTextField textCantidad;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private ControladorFactura controladorFactura;
	private JButton btnAnadir;
	private JButton btnEliminar;
	private JButton btnVolver;
	private JButton btnAceptar;
	
	
	/**
	 * Create the panel.
	 * @param controladorFactura 
	 */
	public Factura(ControladorFactura controladorFactura) {
		setLayout(null);
		
		JLabel TituloFactura = new JLabel("Factura");
		TituloFactura.setFont(new Font("Tahoma", Font.BOLD, 14));
		TituloFactura.setHorizontalAlignment(SwingConstants.CENTER);
		TituloFactura.setBounds(0, 0, 549, 42);
		add(TituloFactura);
		
		JLabel lblCantidadFactura = new JLabel("Cantidad:");
		lblCantidadFactura.setBounds(10, 56, 70, 14);
		add(lblCantidadFactura);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(62, 53, 86, 20);
		add(textCantidad);
		textCantidad.setColumns(10);
		
		JList listProductos = new JList();
		listProductos.setModel(new AbstractListModel() {
			String[] values = new String[] {"- Cafe", "- Coca-Cola", "- Cerveza", "- Sandwich Atun", "- Pintxo de Tortilla", "- Bollo de mantequilla"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listProductos.setBounds(24, 94, 187, 96);
		add(listProductos);
		
		JLabel lblNIF = new JLabel("NIF");
		lblNIF.setBounds(24, 242, 46, 14);
		add(lblNIF);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(57, 239, 120, 20);
		add(textField);
		
		JLabel lblEmpleado = new JLabel("N\u00BA Empleado");
		lblEmpleado.setBounds(24, 267, 89, 14);
		add(lblEmpleado);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(91, 264, 86, 20);
		add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Pulsa Aceptar si desea crear una factura");
		lblNewLabel.setBounds(24, 343, 247, 14);
		add(lblNewLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(24, 368, 89, 23);
		add(btnAceptar);
		
		JScrollPane pnlFactura = new JScrollPane();
		pnlFactura.setBounds(243, 43, 271, 238);
		add(pnlFactura);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Producto", "Precio", "Cantidad"
			}
		));
		pnlFactura.setViewportView(table);
		
		JLabel lblNewLabel_3 = new JLabel("Precio Total:");
		lblNewLabel_3.setBounds(353, 295, 86, 14);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(428, 292, 86, 20);
		add(textField_2);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		
		btnAnadir.setEnabled(false);
		btnAnadir.setBounds(281, 323, 89, 23);
		add(btnAnadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(425, 323, 89, 23);
		add(btnEliminar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(425, 368, 89, 23);
		add(btnVolver);

		
		
		initializeEvents();
	}
	private void initializeEvents() {
		this.btnAnadir.addActionListener(listenerBotonAnadirFactura(this.controladorFactura));
		this.btnEliminar.addActionListener(listenerBotonEliminarFactura(this.controladorFactura));
		this.btnVolver.addActionListener(listenerBotonVolverFactura(this.controladorFactura));
		this.btnAceptar.addActionListener(listenerBotonAceptarFacturas(this.controladorFactura));	
	}
	private ActionListener listenerBotonAceptarFacturas(ControladorFactura controladorFactura2) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorFactura.accionadoBotonAnadirFactura();
			}
		};
	}
	private ActionListener listenerBotonVolverFactura(ControladorFactura controladorFactura2) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorFactura.accionadoBotonAnadirFactura();
			}
		};
	}
	private ActionListener listenerBotonEliminarFactura(ControladorFactura controladorFactura2) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorFactura.accionadoBotonAnadirFactura();
			}
		};
	}
	private ActionListener listenerBotonAnadirFactura(ControladorFactura controladorFactura) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorFactura.accionadoBotonAnadirFactura();
			}
		};


	}
}
