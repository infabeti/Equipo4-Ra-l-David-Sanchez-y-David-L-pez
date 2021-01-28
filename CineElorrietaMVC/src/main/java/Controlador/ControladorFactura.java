package Controlador;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import App.FacturaCafeteria;
import App.MenuOpciones;
import Modelo.Modelo;
import Vista.Factura;
import Vista.Menu;
import Vista.ResumenFactura;
import Vista.Vista;

public class ControladorFactura {

	private Modelo modelo;
	private Vista vista;
	private ControladorReto controladorReto;
	private Factura factura;
	private ResumenFactura resumenfactura;

	public ControladorFactura(Modelo modelo, Vista vista, ControladorReto controladorReto) {

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

		///////////////////////////////////////////////////////// debe cerrar el
		///////////////////////////////////////////////////////// programa

	}

	public void mostrarFactura() {
		this.factura = new Factura(this);
		this.vista.mostrarPanel(this.factura);

	}
	public void mostrarResumenFactura() {
		this.resumenfactura = new ResumenFactura(this);
		this.vista.mostrarPanel(this.resumenfactura);
		
	}


	public void accionadoBotonAnadirFactura(JTextField textCantidad, JList listProductos, JTable tableFactura) {

	
	}
	public void accionadoBotonEliminarFactura(JTable tableFactura) {
		// TODO Esbozo de método generado automáticamente
		DefaultTableModel modeloTabla = (DefaultTableModel) tableFactura.getModel();
		
		modeloTabla.removeRow(tableFactura.getRowCount() - 1);
		calcularImporteTotal(null, null);
	}

	private void calcularImporteTotal(JTextField textTotal, JTable tableFactura) {
		DefaultTableModel modeloTabla = (DefaultTableModel) tableFactura.getModel();
		int contar = tableFactura.getRowCount();
		Double suma = 0.00;
		for (int i = 0; i < contar; i++) {
			String precio = modeloTabla.getValueAt(i, 1).toString();
			suma = suma + Double.parseDouble(precio.substring(0, precio.length() - 1));
			suma = Math.round(suma * 100d) / 100d;
		}

		textTotal.setText(suma.toString() + "€");

	}

	

	public void accionadoBotonAceptarFactura(JTable tableFactura) {
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////// Destruye esta ventana
		
				

	}

	public void accionadoBotonVolverFactura() {
		this.controladorReto.navegarMenu();

	}

	public void accionadoBotonResumFactuSi() {
		JOptionPane.showMessageDialog(resumenfactura, "Se ha impreso y registrado la factura");
		MenuOpciones Opcion = new MenuOpciones(); // Abre la ventana de Menu
		Opcion.setVisible(true); // Hace visible la ventana de Menu
		/////////////////////////////////////////////////////////////////////////////////////////////////////////// Destruye esta ventana
		
		
	}

	public void accionadoBotonResumFactuNo() {
		this.controladorReto.navegarFactura();
	///////////////////////////////////////////////////////////////////////////////////////////////////////// Destruye esta ventana
		
	}

	
	

}
