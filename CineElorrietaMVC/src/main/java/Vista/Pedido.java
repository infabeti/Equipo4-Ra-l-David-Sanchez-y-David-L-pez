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
import javax.swing.AbstractListModel;

public class Pedido extends JPanel {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Pedido() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pedido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 0, 450, 29);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(83, 60, 86, 20);
		add(textField);
		
		JLabel lblerrep = new JLabel("Cantidad");
		lblerrep.setBounds(24, 63, 89, 14);
		add(lblerrep);
		
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
		listProductos.setBounds(24, 115, 171, 106);
		add(listProductos);
		
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
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
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

	}
}
