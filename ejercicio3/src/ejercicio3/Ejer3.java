package ejercicio3;

import javax.swing.JOptionPane;

public class Ejer3 {

	public static void main(String[] args) {
		int monto;
		int cliente;
		int vuelto;
		int mil = 0;
		int quinientos = 0;
		int dosc = 0;
		int cien = 0;
		int cincu = 0;
		int venti = 0;
		int diez = 0;
		// int [] billetes = new int[] {10,20,50,100,200,500,1000};
		String montos = JOptionPane.showInputDialog("ingrese monto");
		monto = Integer.parseInt(montos);
		String clientes = JOptionPane.showInputDialog("ingrese lo que va a pagar");
		cliente = Integer.parseInt(clientes);
		vuelto = cliente - monto;

		while (vuelto > 10) {

			if (vuelto >= 1000) {
				mil++;
				vuelto = vuelto - 1000;
			} else if (vuelto < 1000 && vuelto >= 500) {
				quinientos++;
				vuelto = vuelto - 500;
			} else if (vuelto < 500 && vuelto >= 200) {
				dosc++;
				vuelto = vuelto - 200;
			} else if (vuelto < 200 && vuelto >= 100) {
				cien++;
				vuelto = vuelto - 100;
			} else if (vuelto < 100 && vuelto >= 50) {
				cincu++;
				vuelto = vuelto - 50;
			} else if (vuelto < 50 && vuelto >= 20) {
				venti++;
				vuelto = vuelto - 20;
			} else if (vuelto < 20 && vuelto >= 10) {
				diez++;
				vuelto = vuelto - 10;
			}
		}

		if (monto <= cliente) {
			System.out.println("Precio: " + monto);
			System.out.println("Pago con: " + clientes);
			System.out.println("Vuelto en billetes de 1000: " + mil + " billetes de 500 : " + quinientos
					+ " billetes de 200 " + dosc + " billetes de 100 " + cien + " billetes de 50 " + cincu
					+ " billetes de 20 " + venti + " billetes de 10 " + diez + " " + vuelto + " de monedas");

		} else {

			vuelto = vuelto * -1;
			System.out.println("debe $" + vuelto);

		}

	}

}
