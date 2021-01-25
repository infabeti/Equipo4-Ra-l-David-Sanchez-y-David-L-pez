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
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResumenFactura extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
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
		table_1.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Producto", "Precio Unidad", "Precio", "Cantidad" }));
		scrollPane.setViewportView(table_1);

		lblNewLabel = new JLabel("Confirmacion Factura");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 509, 24);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("\u00BFImprimir y guardar factura?");
		lblNewLabel_1.setBounds(10, 353, 178, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnResumFactuSI = new JButton("Si");
		btnResumFactuSI.setBounds(42, 390, 89, 23);
		contentPane.add(btnResumFactuSI);

		JButton btnResumFactuNO = new JButton("No");
		btnResumFactuNO.setBounds(180, 390, 89, 23);
		contentPane.add(btnResumFactuNO);

		btnResumFactuSI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Se ha imprimido y registrado la factura");
			}
		});

		btnResumFactuNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FacturaCafeteria Factura = new FacturaCafeteria(); // Abre la ventana de Factura
				Factura.setVisible(true); // Hace visible la ventana de Factura
				dispose(); // Destruye esta ventana

			}
		});
	}

	public void ActualizarFactura(TableModel tableModel) {
		
		table_1.setModel(tableModel);
		
		tableModel.getValueAt(ALLBITS, ABORT);
		
		DefaultTableModel modeloTabla = (DefaultTableModel) tableModel;
		String Producto="";
		Double PrecioTotal= 0.00;
		int Cantidad=0;
		for (int i=0;i<tableModel.getRowCount();i++){
			
			Object arrays[]= {tableModel};
			Double PrecioUnitario=PrecioTotal/Cantidad;
			
			for(int j=0;j<tableModel.getColumnCount();j++) {
				Object arrays2[]= {tableModel};
			}
		}
	
		
		
	};

}
