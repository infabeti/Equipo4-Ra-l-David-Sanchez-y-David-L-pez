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
		// TODO Esbozo de m�todo generado autom�ticamente
		
	}
	
	public void mostrarFactura() {
		// TODO Esbozo de m�todo generado autom�ticamente
		
	}
	public void accionadoBotonAnadirFactura() {
		// TODO Esbozo de m�todo generado autom�ticamente
		
	}
	
	

}
