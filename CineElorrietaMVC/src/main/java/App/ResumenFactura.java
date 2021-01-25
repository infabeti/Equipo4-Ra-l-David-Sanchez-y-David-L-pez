package App;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class ResumenFactura extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTextField textNIF;
	private JTextField textEmpleado;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResumenFactura frame = new ResumenFactura();
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
	public ResumenFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(103, 94, 315, 238);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Producto", "Precio Unidad", "Precio", "Cantidad"
			}
		));
		scrollPane.setViewportView(table_1);
		
		textNIF = new JTextField();
		textNIF.setColumns(10);
		textNIF.setBounds(68, 35, 120, 20);
		textNIF.setEnabled(true);
		contentPane.add(textNIF);
		
		JLabel lblNIF = new JLabel("NIF");
		lblNIF.setBounds(42, 38, 46, 14);
		contentPane.add(lblNIF);
		
		JLabel lblEmpleado = new JLabel("N\u00BA Empleado");
		lblEmpleado.setBounds(285, 38, 89, 14);
		contentPane.add(lblEmpleado);
		
		textEmpleado = new JTextField();
		textEmpleado.setColumns(10);
		textEmpleado.setBounds(361, 35, 86, 20);
		textEmpleado.setEnabled(false);
		contentPane.add(textEmpleado);
		
		lblNewLabel = new JLabel("Confirmacion Factura");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 509, 24);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\u00BFImprimir y guardar factura?");
		lblNewLabel_1.setBounds(10, 353, 178, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Si");
		btnNewButton.setBounds(42, 390, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.setBounds(180, 390, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
