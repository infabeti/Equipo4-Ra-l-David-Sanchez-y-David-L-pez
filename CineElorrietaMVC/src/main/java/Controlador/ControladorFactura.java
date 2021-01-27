package Controlador;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Modelo.Modelo;
import Vista.Factura;
import Vista.Menu;
import Vista.Vista;

public class ControladorFactura {

	private Modelo modelo;
	private Vista vista;
	private ControladorReto controladorReto;
	private Factura factura;

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

	public void accionadoBotonAnadirFactura(JTextField textCantidad, JList listProductos, JTable tableFactura) {

		int posProducto = (int) listProductos.getSelectedIndex();
		// si es distitno de -1 quiere decir que no has seleccionado nada en la lista de
		// productos
		if (posProducto != -1) {

			String productoSeleccionado = (String) listProductos.getSelectedValue();
			DefaultTableModel modeloTabla = (DefaultTableModel) tableFactura.getModel();
			int cantidad = Integer.parseInt(textCantidad.getText());
			Double precioTotal = 0.00;
			textCantidad.setText("");

			switch (productoSeleccionado) {
			case "- Cafe":

				precioTotal = 1.13 * cantidad;
				precioTotal = Math.round(precioTotal * 100d) / 100d;

				Object opcion1[] = { "Cafe", precioTotal + "€", cantidad };
				modeloTabla.addRow(opcion1);

				break;

			case "- CocaCola":
				precioTotal = 1.24 * cantidad;
				precioTotal = Math.round(precioTotal * 100d) / 100d;

				Object opcion2[] = { "CocaCola", precioTotal + "€", cantidad };
				modeloTabla.addRow(opcion2);

				break;

			case "- Cerveza":
				precioTotal = 1.08 * cantidad;
				precioTotal = Math.round(precioTotal * 100d) / 100d;

				Object opcion3[] = { "Cerveza", precioTotal + "€", cantidad };
				modeloTabla.addRow(opcion3);

				break;

			case "- Sandwich Atun":
				precioTotal = 1.33 * cantidad;
				precioTotal = Math.round(precioTotal * 100d) / 100d;

				Object opcion4[] = { "Sandwich Atun", precioTotal + "€", cantidad };
				modeloTabla.addRow(opcion4);

				break;

			case "- Pintxo Tortilla":
				precioTotal = 1.21 * cantidad;
				precioTotal = Math.round(precioTotal * 100d) / 100d;

				Object opcion5[] = { "Pintxo Tortilla", precioTotal + "€", cantidad };
				modeloTabla.addRow(opcion5);

				break;

			case "- Bollo de Mantequilla":
				precioTotal = 1.50 * cantidad;
				precioTotal = Math.round(precioTotal * 100d) / 100d;

				Object opcion6[] = { "Bollo de Mantequilla", precioTotal + "€", cantidad };
				modeloTabla.addRow(opcion6);

				break;

			}

			calcularImporteTotal(textCantidad, tableFactura);

		}
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

	

	public void accionadoBotonAceptarFactura() {
		// TODO Esbozo de método generado automáticamente

	}

	public void accionadoBotonVolverFactura() {
		this.controladorReto.navegarMenu();

	}

	

}
