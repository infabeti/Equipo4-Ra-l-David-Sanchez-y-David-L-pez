package Controlador;

import Modelo.Modelo;
import Vista.Bienvenida;
import Vista.Vista;

public class ControladorBienvenida {
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private Bienvenida Bienvenida;

	public ControladorBienvenida(Modelo modelo,Vista vista,Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;		
	}
	
	public void mostrarBienvenida() {
		this.Bienvenida = new Bienvenida(this);
		this.vista.mostrarPanel(this.Bienvenida);
	}
	public void accionadoBottonMenu() {
		this.controlador.navegarPanelGeneros();
	}
	
	
}
