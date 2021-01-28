package Modelo;

import javax.swing.table.DefaultTableModel;

public class Modelo {

	
	
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
	
}
