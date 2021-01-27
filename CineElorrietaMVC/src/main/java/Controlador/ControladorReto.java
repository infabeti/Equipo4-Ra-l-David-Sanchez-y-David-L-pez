package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class ControladorReto {

	private Modelo modelo;
	private Vista vista;
	private ControladorBienvenida controladorBienvenida;
	private ControladorMenu controladorMenu;
	
	public ControladorReto(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorBienvenida = new ControladorBienvenida(this.modelo, this.vista, this);
		this.controladorMenu = new ControladorMenu(this.modelo, this.vista, this);
		this.navegarBienvenida();
	}
	
	public void navegarBienvenida() {
		System.out.println("Navegar panel Bienvenida");
		this.controladorBienvenida.mostrarBienvenida();
	}
	
	public void navegarMenu() {
		System.out.println("Navegar panel Generos");
		this.controladorMenu.mostrarMenu();
	}
}
