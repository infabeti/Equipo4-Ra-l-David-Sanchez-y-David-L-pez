package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import App.MenuOpciones;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Domicilio extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreCliente;
	private JTextField textApellidosCliente;
	private JTextField textDireccion;
	private JTextField textEmpleado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Domicilio frame = new Domicilio();
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
	public Domicilio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos de Pedido a Domicilio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 414, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 59, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		textNombreCliente = new JTextField();
		textNombreCliente.setColumns(10);
		textNombreCliente.setBounds(67, 56, 86, 20);
		contentPane.add(textNombreCliente);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setBounds(10, 87, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textApellidosCliente = new JTextField();
		textApellidosCliente.setColumns(10);
		textApellidosCliente.setBounds(67, 84, 141, 20);
		contentPane.add(textApellidosCliente);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion");
		lblNewLabel_3.setBounds(10, 118, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(67, 115, 167, 20);
		contentPane.add(textDireccion);
		
		JLabel lblNewLabel_4 = new JLabel("N\u00BA Empleado");
		lblNewLabel_4.setBounds(10, 149, 104, 14);
		contentPane.add(lblNewLabel_4);
		
		textEmpleado = new JTextField();
		textEmpleado.setColumns(10);
		textEmpleado.setBounds(87, 146, 86, 20);
		contentPane.add(textEmpleado);
		
		JButton btnAceptar = new JButton("Aceptar");		
		btnAceptar.setBounds(67, 207, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");	
		btnCancelar.setBounds(240, 207, 89, 23);
		contentPane.add(btnCancelar);
		
		
		
		
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuOpciones Opcion = new MenuOpciones(); // Abre la ventana de LoginContraseña
				Opcion.setVisible(true); // Hace visible la ventana de LoginContraseña
				dispose(); // Destruye esta ventana
				
				
				
			}
		});
	}

}
