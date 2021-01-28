package Controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import App.MenuOpciones;
import Modelo.Modelo;
import Vista.Factura;
import Vista.Pedido;
import Vista.ResumenFactura;
import Vista.ResumenLocal;
import Vista.Vista;

public class ControladorPedido {
	
	
	private Modelo modelo;
	private Vista vista;
	private ControladorReto controladorReto;
	private Pedido pedido;
	private ResumenLocal resumenlocal;




	public ControladorPedido(Modelo modelo, Vista vista, ControladorReto controladorReto) {

		this.modelo = modelo;
		this.vista = vista;
		this.controladorReto = controladorReto;

	}
	
	
	
	
	public void mostrarPedido() {
		this.pedido = new Pedido(this);
		this.vista.mostrarPanel(this.pedido);
		
	}
	public void mostrarResumenFactura() {
		this.resumenlocal = new ResumenLocal(this);
		this.vista.mostrarPanel(this.resumenlocal);
		
	}




	public void accionadoBotonAnadirPedido(JTable tablePedido) {
		// TODO Esbozo de método generado automáticamente
		
	}




	public void accionadoBotonEliminarPedido(JTable tablePedido) {
		// TODO Esbozo de método generado automáticamente
		
	}




	public void accionadoBotonVolverPedido(JTable tablePedido) {
		this.controladorReto.navegarMenu();
		
	}




	public void accionadoBotonDomicilioPedido(JTable tablePedido) {
		// TODO Esbozo de método generado automáticamente
		
	}




	public void accionadoBotonLocalPedido(JTable tablePedido) {
		// TODO Esbozo de método generado automáticamente
		
	}




	public void accionadoBotonAceptarPedido() {
		JOptionPane.showMessageDialog(resumenlocal, "Se ha impreso y registrado la factura");
		MenuOpciones Opcion = new MenuOpciones(); // Abre la ventana de Menu
		Opcion.setVisible(true); // Hace visible la ventana de Menu
		
	}




	public void accionadoBotonCancelarPedido() {
		this.controladorReto.navegarPedido();
		
	}

}
