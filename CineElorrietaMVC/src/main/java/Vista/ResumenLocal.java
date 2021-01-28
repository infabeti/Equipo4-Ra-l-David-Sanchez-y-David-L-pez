package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import App.MenuOpciones;
import Controlador.ControladorPedido;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResumenLocal extends JPanel {
	private JTable tableResumenLocal;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private ControladorPedido controladorPedido;
	
	
	
	/**
	 * Create the panel.
	 * @param controladorPedido 
	 */
	public ResumenLocal(ControladorPedido controladorPedido) {
		setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Pedido Local");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 11, 429, 34);
		add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 51, 315, 238);
		add(scrollPane);
		
		tableResumenLocal = new JTable();
		tableResumenLocal.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(tableResumenLocal);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(85, 305, 86, 20);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 350, 141, 20);
		add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(31, 308, 57, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(31, 353, 89, 14);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(284, 305, 86, 20);
		add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("N\u00BA Empleado");
		lblNewLabel_3.setBounds(210, 308, 113, 14);
		add(lblNewLabel_3);
		
		JButton btnAceptar = new JButton("Aceptar");	
		btnAceptar.setBounds(61, 406, 89, 23);
		add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");	
		btnCancelar.setBounds(287, 406, 89, 23);
		add(btnCancelar);

		
		
		IniciarEventos();
	}
	



	private void IniciarEventos() {
		this.btnCancelar.addActionListener(listenerBotonCancelarPedido()); 			
		this.btnAceptar.addActionListener(listenerBotonAceptarLocal());
			
	}




	private ActionListener listenerBotonAceptarLocal() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controladorPedido.accionadoBotonAceptarLocal();
			}
		};
	}




	private ActionListener listenerBotonCancelarPedido() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPedido.accionadoBotonCancelarLocal();
			}
		};
	
	}
}
