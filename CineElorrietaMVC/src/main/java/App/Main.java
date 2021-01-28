package App;
import Controlador.ControladorReto;
import Modelo.*;
import Modelo.Modelo;
import Vista.Vista;

public class Main {
	
	private static Modelo modelo;
	private static Vista vista;
	@SuppressWarnings("unused")
	private static ControladorReto controladorReto;
	
	public static void main(String[] args) {
		modelo = new Modelo();    
		vista = new Vista();
                
		controladorReto = new ControladorReto(modelo, vista);
	}

}