package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.ControladorPedido;

import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pedido extends JPanel {
	private JTextField textCantidadPedido;
	private JTable tablePedido;
	private JTextField textField_1;
	private ControladorPedido controladorPedido;
	private JButton btnEliminar;
	private JButton btnAnadir;
	private JButton btnAceptar;
	private JButton btnVolver;
	private JList listProductosPedido;
	private JButton btnLocal;
	private JButton btnDomicilio;
	
	
	
	/**
	 * Create the panel.
	 * @param controladorPedido2 
	 */
	public Pedido(ControladorPedido controladorPedido2) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pedido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 0, 450, 29);
		add(lblNewLabel);
		
		textCantidadPedido = new JTextField();
		textCantidadPedido.setColumns(10);
		textCantidadPedido.setBounds(83, 60, 86, 20);
		add(textCantidadPedido);
		
		JLabel lblerrep = new JLabel("Cantidad");
		lblerrep.setBounds(24, 63, 89, 14);
		add(lblerrep);
		
		JList listProductosPedido = new JList();
		listProductosPedido.setModel(new AbstractListModel() {
			String[] values = new String[] {"- Cafe", "- CocaCola", "- Cerveza", "- Sandwich Atun", "- Pintxo Tortilla", "- Bollo de Mantequilla"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listProductosPedido.setBounds(24, 115, 171, 106);
		add(listProductosPedido);
		
		JLabel lblNewLabel_3 = new JLabel("Listado de Productos:");
		lblNewLabel_3.setBounds(24, 91, 171, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFQu\u00E9 tipo de pedido desea realizar?");
		lblNewLabel_1.setBounds(24, 291, 208, 14);
		add(lblNewLabel_1);
		
		JButton btnDomicilio = new JButton("Domicilio");			
		btnDomicilio.setBounds(24, 316, 86, 23);
		add(btnDomicilio);
		
		JButton btnLocal = new JButton("Local");		
		btnLocal.setBounds(24, 360, 86, 23);
		add(btnLocal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(226, 40, 271, 238);
		add(scrollPane);
		
		tablePedido = new JTable();
		tablePedido.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Producto", "Precio", "Cantidad"
			}
		));
		scrollPane.setViewportView(tablePedido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(411, 288, 86, 20);
		add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio Total:");
		lblNewLabel_2.setBounds(334, 291, 99, 14);
		add(lblNewLabel_2);
		
		JButton btnEliminar = new JButton("Eliminar");		
		btnEliminar.setBounds(411, 334, 89, 23);
		add(btnEliminar);
		
		JButton btnVolver = new JButton("Volver");	
		btnVolver.setBounds(411, 391, 89, 23);
		add(btnVolver);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(263, 334, 89, 23);
		add(btnAnadir);
		
		
		
		IniciarEventos();
	}
	
	private void IniciarEventos() {

		
		
		this.btnAnadir.addActionListener(listenerBotonAnadirPedido(this.controladorPedido, textCantidadPedido,listProductosPedido,tablePedido));
		this.btnEliminar.addActionListener(listenerBotonEliminarPedido(this.controladorPedido, tablePedido));
		this.btnVolver.addActionListener(listenerBotonVolverPedido(this.controladorPedido));
		this.btnLocal.addActionListener(listenerBotonLocalPedido(this.controladorPedido));	
		this.btnDomicilio.addActionListener(listenerBotonDomicilioPedido(this.controladorPedido));
	}

	private ActionListener listenerBotonDomicilioPedido(ControladorPedido controladorPedido2) {


		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPedido.accionadoBotonDomicilioPedido(tablePedido);
			}
		};
	}

	private ActionListener listenerBotonLocalPedido(ControladorPedido controladorPedido2) {


		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPedido.accionadoBotonLocalPedido(tablePedido);
			}
		};
	}

	

	private ActionListener listenerBotonEliminarPedido(ControladorPedido controladorPedido2, JTable tablePedido2) {
		
		
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPedido.accionadoBotonEliminarPedido(tablePedido);
			}
		};
	}

	private ActionListener listenerBotonAnadirPedido(ControladorPedido controladorPedido2,
			JTextField textCantidadPedido2, JList listProductosPedido2, JTable tablePedido2) {
		
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPedido.accionadoBotonAnadirPedido(tablePedido);
			}
		};
	}

	private ActionListener listenerBotonVolverPedido(ControladorPedido controladorPedido2) {
		
		
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPedido.accionadoBotonVolverPedido(tablePedido);
			}
		};
	
	}
	
}
