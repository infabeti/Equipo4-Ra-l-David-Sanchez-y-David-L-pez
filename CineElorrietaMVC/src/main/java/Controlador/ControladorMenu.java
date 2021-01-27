package Controlador;



import Modelo.Modelo;
import Vista.PanelGeneros;
import Vista.PanelMenu;
import Vista.Vista;

public class ControladorMenu  {

	
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelMenu panelMenu;
	
	
	
	
	public ControladorMenu(Modelo modelo, Vista vista, Controlador controlador)  {
		
			this.modelo = modelo;
			this.vista = vista;
			this.controlador = controlador;	
		
	}
	public void mostrarPanelMenu() {
		this.panelMenu = new PanelMenu(this);
		this.vista.mostrarPanel(this.panelMenu);
	}
	public void accionadoBottonCerrarPrograma() {
		this.controlador.navegarPanelBienvenida();
	}
	public void accionadoBottonlistenerBotonCerrarPrograma() {
		this.controlador.navegarBienvenida();
		
	}
}
