package Controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import App.MenuOpciones;
import Modelo.Modelo;
import Vista.Factura;
import Vista.Pedido;
import Vista.ResumenDomicilio;
import Vista.ResumenFactura;
import Vista.ResumenLocal;
import Vista.Vista;

public class ControladorPedido {
	
	
	private Modelo modelo;
	private Vista vista;
	private ControladorReto controladorReto;
	private Pedido pedido;
	private ResumenLocal resumenlocal;
	private ResumenDomicilio resumendomicilio;




	public ControladorPedido(Modelo modelo, Vista vista, ControladorReto controladorReto) {

		this.modelo = modelo;
		this.vista = vista;
		this.controladorReto = controladorReto;

	}
	
	
	
	
	public void mostrarPedido() {
		this.pedido = new Pedido(this);
		this.vista.mostrarPanel(this.pedido);
		
	}
	public void mostrarLocal() {
		this.resumenlocal = new ResumenLocal(this);
		this.vista.mostrarPanel(this.resumenlocal);
		
	}
	public void mostrarDomicilio() {
		this.resumendomicilio = new ResumenDomicilio(this);
		this.vista.mostrarPanel(this.resumendomicilio);
		
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
		this.controladorReto.navegarDomicilio();
		
	}




	public void accionadoBotonLocalPedido(JTable tablePedido) {
		this.controladorReto.navegarLocal();
		
	}






	public void accionadoBotonAceptarLocal() {
		JOptionPane.showMessageDialog(resumenlocal, "Se ha impreso y registrado el pedido Local");
		this.controladorReto.navegarMenu();  // Abre la ventana de Menu

		
	}




	public void accionadoBotonCancelarLocal() {
		this.controladorReto.navegarPedido();
		
	}




	public void accionadoBotonAceptarDomicilio() {
		
		JOptionPane.showMessageDialog(resumenlocal, "Se ha impreso y registrado el Pedido a domicilio");
		this.controladorReto.navegarMenu(); // Abre la ventana de Menu
		// Hace visible la ventana de Menu
	}




	public void accionadoBotonCancelarDomicilio() {
		this.controladorReto.navegarPedido();
		
	}




	




	

}
