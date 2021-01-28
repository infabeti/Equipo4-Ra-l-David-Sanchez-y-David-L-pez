package Vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.ControladorPedido;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResumenDomicilio extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private ControladorPedido controladorPedido;
	/**
	 * Create the panel.
	 * @param controladorPedido 
	 */
	public ResumenDomicilio(ControladorPedido controladorPedido) {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 57, 315, 238);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Producto", "Precio", "Cantidad"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("Pedido a Domicilio");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 12, 461, 34);
		add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 306, 86, 20);
		add(textField);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(45, 309, 57, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(216, 309, 89, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(270, 306, 141, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 337, 86, 20);
		add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("N\u00BA Empleado");
		lblNewLabel_3.setBounds(45, 340, 113, 14);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(270, 334, 167, 20);
		add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2.setBounds(226, 340, 136, 14);
		add(lblNewLabel_2);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(69, 390, 89, 23);
		add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		
		btnCancelar.setBounds(322, 390, 89, 23);
		add(btnCancelar);

		
		IniciarEventos();
	}
	private void IniciarEventos() {
		this.btnAceptar.addActionListener(listenerBotonAceptar());
		this.btnCancelar.addActionListener(listenerBotonCancelarPedido()); 	
	

	
		
			
			
			
	}
	private ActionListener listenerBotonCancelarPedido() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controladorPedido.accionadoBotonAceptarDomicilio();
			}
		};
	}
	private ActionListener listenerBotonAceptar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controladorPedido.accionadoBotonCancelarDomicilio();
			}
		};
	}
		
}

	