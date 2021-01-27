package Controlador;



import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Menu;
import Vista.Vista;

public class ControladorMenu  {

	
	private Modelo modelo;
	private Vista vista;
	private ControladorReto controladorReto;
	private Menu menu;
	
	
	
	
	public ControladorMenu(Modelo modelo, Vista vista, ControladorReto controladorReto)  {
		
			this.modelo = modelo;
			this.vista = vista;
			this.controladorReto = controladorReto;	
		
	}
	public void mostrarMenu() {
		this.menu = new Menu(this);
		this.vista.mostrarPanel(this.menu);
	}
	public void accionadoBotonCerrarPrograma() {
		this.controladorReto.navegarBienvenida();
	}
	public void accionadoBotonPedidos() {
		// TODO Esbozo de método generado automáticamente
		
	}
	public void accionadoBotonFactura() {
		this.controladorReto.navegarFactura();
		
	}
	
	
}
