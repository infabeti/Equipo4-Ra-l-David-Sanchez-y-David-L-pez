package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ResumenLocal extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResumenDomicilio frame = new ResumenDomicilio();
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
	public ResumenLocal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 45, 315, 238);
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(88, 294, 86, 20);
		contentPane.add(textField);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(38, 297, 57, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(298, 294, 141, 20);
		contentPane.add(textField_1);
		
		lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(243, 297, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
		lblNewLabel_3 = new JLabel("N\u00BA Empleado");
		lblNewLabel_3.setBounds(33, 341, 113, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 338, 86, 20);
		contentPane.add(textField_3);
		
		btnAceptar = new JButton("Aceptar");		
		btnAceptar.setBounds(38, 425, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");		
		btnCancelar.setBounds(328, 425, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_4 = new JLabel("Pedido Local");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 0, 429, 34);
		contentPane.add(lblNewLabel_4);
		
		
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(contentPane, "Se ha registrado el Pedido como Local");
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
				Pedido PedidoRealizado = new Pedido(); // Abre la ventana de Factura
				PedidoRealizado.setVisible(true); // Hace visible la ventana de Factura
				dispose(); // Destruye esta ventana
				
			}
		});
		
	}
	public void ActualizarFacturaLoc(TableModel tableModel) {
		
		table_1.setModel(tableModel);
		
	};
}