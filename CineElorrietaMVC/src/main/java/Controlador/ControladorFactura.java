package Controlador;

import Modelo.Modelo;
import Vista.Factura;
import Vista.Menu;
import Vista.Vista;

public class ControladorFactura {

	
	private Modelo modelo;
	private Vista vista;
	private ControladorReto controladorReto;
	private Factura factura;
	
	
	
	
	public ControladorFactura(Modelo modelo, Vista vista, ControladorReto controladorReto)  {
		
			this.modelo = modelo;
			this.vista = vista;
			this.controladorReto = controladorReto;	
		
	}
	public void mostrarMenu() {
		this.factura = new Factura(this);
		this.vista.mostrarPanel(this.factura);
	}
	public void accionadoBotonCerrarPrograma() {
		this.controladorReto.navegarBienvenida();
	}
	public void accionadoBotonPedidos() {
		// TODO Esbozo de método generado automáticamente
		
	}
	
	public void mostrarFactura() {
		// TODO Esbozo de método generado automáticamente
		
	}
	public void accionadoBotonAnadirFactura() {
		// TODO Esbozo de método generado automáticamente
		
	}
	
	

}
