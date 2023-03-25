import java.util.Date;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.event.SwingPropertyChangeSupport;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * EJERCICIO 1
		 * 
		 * Crear un programa para que cree, asigne valores y muestre por consola
		 * variables de los siguientes tipos. • boolean • char • byte • short • int •
		 * long • float • double • String
		 * 
		 * 
		 * boolean bool = true; char c=325; byte b=5; short s= 35; int i= 42; long l=22;
		 * float f=25.5f; double d=40.5; String st="Hola mundo";
		 * 
		 * System.out.println(bool+"\n"+c
		 * +"\n"+b+"\n"+s+"\n"+i+"\n"+l+"\n"+f+"\n"+d+"\n"+st);
		 * 
		 * \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		 * \\\\
		 * 
		 * EJERCICO 2
		 * 
		 * • Cree un programa que contenga un array de String. Utilice un bucle for para
		 * mostrar todos los elementos del array. • Haga uso de siguientes caracteres de
		 * escape para mostrar estos textos.
		 * 
		 * 
		 * 
		 * String [] s=new String[5]; s[0]="Hola"; s[1]="Chau"; s[2]="Juan";
		 * s[3]="Jose"; s[4]="Paso";
		 * 
		 * for (int i=0;i<s.length;i++) {
		 * 
		 * System.out.println(s[i]+"\n"); }
		 * 
		 * 
		 * ///////////////////////////////////////////////////////////////////////
		 * 
		 * EJERCICO 4
		 * 
		 * Utilizando el método de entrada JOtionPane, realice una programa que nos
		 * muestre un menú de opciones. Opción 1: muestra 5 números aleatorios. Opción
		 * 2: muestra la suma de 5 números aleatorios. Opción 3: Muestra la fecha y hora
		 * actual. Si se ingresa el comando FIN, se debe cerrar el programa
		 * 
		 */

		String str = "";
		do {
			System.out.println("Opción 1: muestra 5 números aleatorios.\r\n"
					+ "Opción 2: muestra la suma de 5 números aleatorios. \r\n"
					+ "Opción 3: Muestra la fecha y hora actual.");
			str = JOptionPane.showInputDialog("Ingrese un texto");
			switch (str) {
			case "1":

				for (int i = 0; i < 5; i++) {
					double r = Math.random() * 10;
					System.out.println(r);
				}

				break;

			case "2":
				for (int i = 0; i < 5; i++) {
					double r = Math.random() * 10;
					double h = Math.random() * 10;
					double res = r + h;
					System.out.println(r + " + " + h + " = " + res);

				}
				break;
			case "3":
				Date d = new Date();
				System.out.println(d);
				break;
			}
		} while (!str.toLowerCase().equals("fin"));
	}

}
