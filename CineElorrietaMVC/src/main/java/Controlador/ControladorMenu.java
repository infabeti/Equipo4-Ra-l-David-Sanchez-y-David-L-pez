package Controlador;

import javax.swing.JPanel;

import Modelo.Modelo;
import Vista.PanelGeneros;
import Vista.Vista;

public class ControladorMenu extends JPanel {

	
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelGeneros panelMenu;
	
	
	
	
	public ControladorMenu(Modelo modelo, Vista vista, Controlador controlador)  {
		
			this.modelo = modelo;
			this.vista = vista;
			this.controlador = controlador;	
		
	}
	public void mostrarPanelMenu() {
		this.PanelMenu = new PanelMenu(this);
		this.vista.PanelMenu(this.PanelMenu);
	}
	public void accionadoBottonCerrarPrograma() {
		this.controlador.navegarPanelBienvenida();
	}
}
