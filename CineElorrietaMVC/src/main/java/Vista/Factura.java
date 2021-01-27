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

public class Factura extends JPanel {
	private JTextField textCantidad;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Factura() {
		setLayout(null);
		
		JLabel TituloFactura = new JLabel("Factura");
		TituloFactura.setFont(new Font("Tahoma", Font.BOLD, 14));
		TituloFactura.setHorizontalAlignment(SwingConstants.CENTER);
		TituloFactura.setBounds(0, 0, 450, 42);
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
		lblNIF.setBounds(23, 201, 46, 14);
		add(lblNIF);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(45, 198, 120, 20);
		add(textField);
		
		JLabel lblEmpleado = new JLabel("N\u00BA Empleado");
		lblEmpleado.setBounds(24, 226, 89, 14);
		add(lblEmpleado);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(91, 223, 86, 20);
		add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Pulsa Aceptar si desea crear una factura");
		lblNewLabel.setBounds(24, 282, 247, 14);
		add(lblNewLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(24, 307, 89, 23);
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

	}
}
