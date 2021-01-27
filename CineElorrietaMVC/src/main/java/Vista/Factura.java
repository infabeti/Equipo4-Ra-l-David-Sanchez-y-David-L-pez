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
	private JTextField textNIF;
	private JTextField textEmpleado;
	private JTable tableFactura;
	private JTextField textTotal;
	private ControladorFactura controladorFactura;
	private JButton btnAnadir;
	private JButton btnEliminar;
	private JButton btnVolver;
	private JButton btnAceptar;
	private JList listProductos;
	
	public JTextField getTextCantidad() {
		return textCantidad;
	}

	public void setTextCantidad(JTextField textCantidad) {
		this.textCantidad = textCantidad;
	}
	public JList getListProductos() {
		return listProductos;
	}
	public void setListProductos(JList listProductos) {
		this.listProductos = listProductos;
		
	}
	
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
		
		textNIF = new JTextField();
		textNIF.setColumns(10);
		textNIF.setBounds(57, 239, 120, 20);
		add(textNIF);
		
		JLabel lblEmpleado = new JLabel("N\u00BA Empleado");
		lblEmpleado.setBounds(24, 267, 89, 14);
		add(lblEmpleado);
		
		textEmpleado = new JTextField();
		textEmpleado.setColumns(10);
		textEmpleado.setBounds(91, 264, 86, 20);
		add(textEmpleado);
		
		JLabel lblNewLabel = new JLabel("Pulsa Aceptar si desea crear una factura");
		lblNewLabel.setBounds(24, 343, 247, 14);
		add(lblNewLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(24, 368, 89, 23);
		add(btnAceptar);
		
		JScrollPane pnlFactura = new JScrollPane();
		pnlFactura.setBounds(243, 43, 271, 238);
		add(pnlFactura);
		
		tableFactura = new JTable();
		tableFactura.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Producto", "Precio", "Cantidad"
			}
		));
		pnlFactura.setViewportView(tableFactura);
		
		JLabel lblNewLabel_3 = new JLabel("Precio Total:");
		lblNewLabel_3.setBounds(353, 295, 86, 14);
		add(lblNewLabel_3);
		
		textTotal = new JTextField();
		textTotal.setColumns(10);
		textTotal.setBounds(428, 292, 86, 20);
		add(textTotal);
		
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
		this.btnAnadir.addActionListener(listenerBotonAnadirFactura(this.controladorFactura, textCantidad,listProductos,tableFactura));
		this.btnEliminar.addActionListener(listenerBotonEliminarFactura(this.controladorFactura, tableFactura));
		this.btnVolver.addActionListener(listenerBotonVolverFactura(this.controladorFactura));
		this.btnAceptar.addActionListener(listenerBotonAceptarFacturas(this.controladorFactura));	
	}
	private ActionListener listenerBotonAceptarFacturas(ControladorFactura controladorFactura) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorFactura.accionadoBotonAceptarFactura(tableFactura);
			}
		};
	}
	private ActionListener listenerBotonVolverFactura(ControladorFactura controladorFactura) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorFactura.accionadoBotonVolverFactura();
			}
		};
	}
	private ActionListener listenerBotonEliminarFactura(ControladorFactura controladorFactura,JTable tableFactura) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorFactura.accionadoBotonEliminarFactura(tableFactura);
			}
		};
	}
	private ActionListener listenerBotonAnadirFactura(ControladorFactura controladorFactura,JTextField textCantidad, JList listProductos, JTable tableFactura) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorFactura.accionadoBotonAnadirFactura(textCantidad,listProductos,tableFactura);
				
			}
		};


	}
	
	
	
}
