package Vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import App.Main;
import App.MenuOpciones;
import Controlador.ControladorBienvenida;
import Controlador.ControladorPanelBienvenida;

public class Bienvenida extends JPanel {

	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private ControladorBienvenida controladorBienvenida;
	
	public Bienvenida(ControladorBienvenida ControladorBienvenida) {
		this.controladorBienvenida = ControladorBienvenida;
		
		
		
		setBounds(100, 100, 450, 300);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);

		JButton btnNewButton = new JButton("ACEPTAR");	
		btnNewButton.setBounds(166, 164, 91, 23);
		add(btnNewButton);

		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 98, 269, 30);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pulsa en el bot\u00F3n de aceptar, para continuar.");
		lblNewLabel_1.setBounds(89, 139, 253, 14);
		add(lblNewLabel_1);

		
		
		IniciarEventos();
		
	}
	private void IniciarEventos() {
		this.btnNewButton.addActionListener(listenerNewButton(this.controladorBienvenida));
	}
	private ActionListener listenerNewButton(ControladorBienvenida controladorBienvenida) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Generos");
				controladorBienvenida.accionadoBottonMenu();
			}
		};
	}
}
