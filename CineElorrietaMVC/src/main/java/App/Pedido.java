package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;

public class Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField textCantidad;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
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
	public Pedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(227, 52, 271, 238);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Producto", "Precio", "Cantidad"
			}
		));
		scrollPane.setViewportView(table_1);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(63, 64, 86, 20);
		contentPane.add(textCantidad);
		
		JLabel lblerrep = new JLabel("Cantidad");
		lblerrep.setBounds(10, 67, 89, 14);
		contentPane.add(lblerrep);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(247, 301, 89, 23);
		contentPane.add(btnAnadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(366, 301, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblNewLabel = new JLabel("Pedido");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 488, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnDomicilio = new JButton("Domicilio");		
		btnDomicilio.setBounds(39, 328, 86, 23);
		contentPane.add(btnDomicilio);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFQue tipo de pedido se desea realizar?");
		lblNewLabel_1.setBounds(29, 301, 208, 14);
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
		listProductos.setBounds(32, 112, 171, 156);
		contentPane.add(listProductos);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(366, 381, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnLocal = new JButton("Local");	
		btnLocal.setBounds(39, 362, 86, 23);
		contentPane.add(btnLocal);
		
		
		
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int posProducto = (int) listProductos.getSelectedIndex();
				// si es distitno de -1 quiere decir que no has seleccionado nada en la lista de
				// productos
				if (posProducto != -1) {

					String productoSeleccionado = (String) listProductos.getSelectedValue();
					DefaultTableModel modeloTabla = (DefaultTableModel) table_1.getModel();
					int cantidad = Integer.parseInt(textCantidad.getText());
					Double precioTotal;

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
		
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					DefaultTableModel modeloTabla = (DefaultTableModel) table_1.getModel();
					
						modeloTabla.removeRow(table_1.getRowCount() - 1);

						
		
			}

		});
		
		
		btnDomicilio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ResumenDomicilio ResumDomicilio = new ResumenDomicilio(); // Abre la ventana de LoginContraseña
				ResumDomicilio.setVisible(true); // Hace visible la ventana de LoginContraseña
				dispose();
				
				
				
				
			}
		});	
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuOpciones Opcion = new MenuOpciones(); // Abre la ventana de Menu
				Opcion.setVisible(true); // Hace visible la ventana de Menu
				dispose(); // Destruye esta ventana
			}
		});
		
		btnLocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResumenLocal Domicili = new ResumenLocal(); // Abre la ventana de LoginContraseña
				Domicili.setVisible(true); // Hace visible la ventana de LoginContraseña
				dispose();
				
				
			
				
			}
		});
	}
}
