package Controlador;

import Modelo.Modelo;
import Vista.Bienvenida;
import Vista.Vista;

public class ControladorBienvenida {
	private Modelo modelo;
	private Vista vista;
	private ControladorReto controladorReto;
	private Bienvenida Bienvenida;

	public ControladorBienvenida(Modelo modelo,Vista vista,ControladorReto controladorReto) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorReto = controladorReto;		
	}
	
	public void mostrarBienvenida() {
		this.Bienvenida = new Bienvenida(this);
		this.vista.mostrarPanel(this.Bienvenida);
	}
	public void accionadoBottonMenu() {
		this.controladorReto.navegarMenu();
	}
	
	
}
