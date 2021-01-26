package App;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class FacturaCafeteria extends JFrame {

	private JPanel contentPane;
	private JTextField textNIF;
	private JTextField textEmpleado;
	private JTextField textCantidad;
	private JTable table_1;
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacturaCafeteria ventana = new FacturaCafeteria();
					ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FacturaCafeteria() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 653, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNIF = new JLabel("NIF");
		lblNIF.setBounds(20, 292, 46, 14);
		contentPane.add(lblNIF);

		JLabel lblEmpleado = new JLabel("N\u00BA Empleado");
		lblEmpleado.setBounds(20, 320, 89, 14);
		contentPane.add(lblEmpleado);

		JLabel Cantidad = new JLabel("Cantidad");
		Cantidad.setBounds(31, 89, 89, 14);
		contentPane.add(Cantidad);

		textNIF = new JTextField();
		textNIF.setBounds(50, 289, 120, 20);
		contentPane.add(textNIF);
		textNIF.setColumns(10);

		textEmpleado = new JTextField();
		textEmpleado.setBounds(95, 317, 86, 20);
		contentPane.add(textEmpleado);
		textEmpleado.setColumns(10);

		textCantidad = new JTextField();

		textCantidad.setBounds(84, 86, 86, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);

		JButton btnFacturaSi = new JButton("Si");		
		btnFacturaSi.setBounds(20, 379, 89, 23);
		contentPane.add(btnFacturaSi);

		JButton btnFacturaNo = new JButton("No");
		btnFacturaNo.setBounds(137, 379, 89, 23);
		contentPane.add(btnFacturaNo);

		JLabel lblNewLabel = new JLabel("\u00BFQuieres crear una factura?");
		lblNewLabel.setBounds(20, 354, 197, 14);
		contentPane.add(lblNewLabel);

		JScrollPane pnlFactura = new JScrollPane();
		pnlFactura.setBounds(312, 64, 271, 238);
		getContentPane().add(pnlFactura);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Producto", "Precio", "Cantidad" }) {
			Class[] columnTypes = new Class[] { String.class, Integer.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		pnlFactura.setViewportView(table_1);

		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(335, 350, 89, 23);
		btnAnadir.setEnabled(false);
		getContentPane().add(btnAnadir);

		JLabel lblNewLabel_1 = new JLabel("Factura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(-34, 11, 617, 33);
		contentPane.add(lblNewLabel_1);

		JList listProductos = new JList();
		listProductos.setModel(new AbstractListModel() {
			String[] values = new String[] {"- Cafe", "- CocaCola", "- Cerveza", "- Sandwich Atun", "- Pintxo Tortilla", "- Bollo de Mantequilla"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});

		listProductos.setBounds(31, 160, 187, 111);
		contentPane.add(listProductos);
		
		JButton btnEliminar = new JButton("Eliminar");		
		btnEliminar.setBounds(469, 350, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblNewLabel_2 = new JLabel("Listado de Productos:");
		lblNewLabel_2.setBounds(31, 140, 156, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(469, 403, 89, 23);
		contentPane.add(btnVolver);
		
		textTotal = new JTextField();
		textTotal.setBounds(472, 317, 86, 20);
		contentPane.add(textTotal);
		textTotal.setColumns(10);

		// Eventos

		// Evento lista de productos
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int posProducto = (int) listProductos.getSelectedIndex();
				// si es distitno de -1 quiere decir que no has seleccionado nada en la lista de
				// productos
				if (posProducto != -1) {

					String productoSeleccionado = (String) listProductos.getSelectedValue();
					DefaultTableModel modeloTabla = (DefaultTableModel) table_1.getModel();
					int cantidad = Integer.parseInt(textCantidad.getText());
					Double precioTotal = 0.00;

					switch (productoSeleccionado) {
					case "- Cafe":
						
						precioTotal = 1.13 * cantidad;
						precioTotal = Math.round(precioTotal * 100d) / 100d;

						Object opcion1[] = { "Cafe", precioTotal + "€", cantidad };
						modeloTabla.addRow(opcion1);

						break;
						
						
						
					case "- CocaCola":
						precioTotal = 1.24 * cantidad;
						precioTotal = Math.round(precioTotal * 100d) / 100d;

						Object opcion2[] = { "CocaCola", precioTotal + "€", cantidad };
						modeloTabla.addRow(opcion2);

						break;
						
						
						
					case "- Cerveza":
						precioTotal = 1.08 * cantidad;
						precioTotal = Math.round(precioTotal * 100d) / 100d;

						Object opcion3[] = { "Cerveza", precioTotal + "€", cantidad };
						modeloTabla.addRow(opcion3);

						break;
						
					case "- Sandwich Atun":
						precioTotal = 1.33 * cantidad;
						precioTotal = Math.round(precioTotal * 100d) / 100d;
	
						Object opcion4[] = { "Sandwich Atun", precioTotal + "€", cantidad };
						modeloTabla.addRow(opcion4);
	
						break;
						
						
					case "- Pintxo Tortilla":
						precioTotal = 1.33 * cantidad;
						precioTotal = Math.round(precioTotal * 100d) / 100d;
	
						Object opcion5[] = { "Pintxo Tortilla", precioTotal + "€", cantidad };
						modeloTabla.addRow(opcion5);
	
						break;
						
						
					case "- Bollo de Mantequilla":
						precioTotal = 1.33 * cantidad;
						precioTotal = Math.round(precioTotal * 100d) / 100d;
	
						Object opcion6[] = { "Bollo de Mantequilla", precioTotal + "€", cantidad };
						modeloTabla.addRow(opcion6);
	
						break;	
						
					}
					
					
				

		
				
				}
			}

		});
		//Evento eliminar linea de tabla.
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					DefaultTableModel modeloTabla = (DefaultTableModel) table_1.getModel();
					
						modeloTabla.removeRow(table_1.getRowCount() - 1);

						
		
			}

		});

		// Evento cambio de texto de Cantidad,
		textCantidad.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				validacionSoloNumeros();
			}

			public void removeUpdate(DocumentEvent e) {
				validacionSoloNumeros();
			}

			public void insertUpdate(DocumentEvent e) {
				validacionSoloNumeros();
			}

			public void validacionSoloNumeros() {

				// se mira si esta vacio
				if (textCantidad.getText().isEmpty()) {
					btnAnadir.setEnabled(false);
				} else {
					// limitar opciones a numeros
					String regex = "[0-9]+";
					// Expresion regular
					if (textCantidad.getText().matches(regex)) {
						btnAnadir.setEnabled(true);
					} else {
						btnAnadir.setEnabled(false);

					}
				}
			}
		});
		
		btnFacturaSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResumenFactura ResumFactura = new ResumenFactura(); // Abre la ventana de LoginContraseña
				ResumFactura.ActualizarFactura(table_1.getModel());
				ResumFactura.setVisible(true); // Hace visible la ventana de LoginContraseña
				;
				
				
				
				dispose();
				
				
				
				
				
				
				
				
			}
		});
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuOpciones Menu = new MenuOpciones(); // Abre la ventana de LoginContraseña
				Menu.setVisible(true); // Hace visible la ventana de LoginContraseña
				dispose();
				
				
			}
		});

	}
}
