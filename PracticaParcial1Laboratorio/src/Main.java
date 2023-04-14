import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
		ArrayList<Catedra> listaCatedra = new ArrayList<Catedra>();
		Catedra c1 = new Catedra(25, "Matematicas");
		Catedra c2 = new Catedra(32, "Laboratorio III");
		Catedra c3 = new Catedra(19, "Programacion III");
		listaCatedra.add(c1);
		listaCatedra.add(c2);
		listaCatedra.add(c3);
		for (int i = 0; i < 40; i++) {
			if (i < 10) {
				Alumno a = new Alumno(44000000 + (i + 1), "Jorge " + (i + 1), "Ameal " + (i + 1));
				listaAlumno.add(a);
				c1.alumno(a);
			} else if (i >= 10 && i < 20) {
				Alumno a = new Alumno(44000000 + (i + 1), "Jorge " + (i + 1), "Ameal " + (i + 1));
				listaAlumno.add(a);
				c2.alumno(a);
			} else if (i >= 20 && i < 30) {
				Alumno a = new Alumno(44000000 + (i + 1), "Jorge " + (i + 1), "Ameal " + (i + 1));
				listaAlumno.add(a);
				c3.alumno(a);
			}

		}

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n1 Agregar Catedra"
					+ "\n2 Mostrar la lista de Cátedras  \n3 Ordenar y mostrar: (luego debe elegir una opción): \n4 Salir\r\n"
					+ ""));
			switch (opcion) {

			case 1:

				int numeroAula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de aula"));
				String catedra = JOptionPane.showInputDialog("Ingrese el nombre de la catedra");
				Catedra nuevaCatedra = new Catedra(numeroAula, catedra);
				listaCatedra.add(nuevaCatedra);
				break;

			case 2:

				System.out.println("Lista de catedras: ");
				for (Catedra c : listaCatedra) {
					System.out.println(c.toString());
				}
				break;

			case 3:
				int Tipoorden = 0;
				do {
					Tipoorden = Integer.parseInt(JOptionPane
							.showInputDialog("Seleccione una opcion:\n1 Por Nombre de cátedra\n" + "2 Por nro de aula"));
					if (Tipoorden == 1) {
						Collections.sort(listaCatedra, new OrdenarPorNombre());
						for (Catedra c : listaCatedra) {
							System.out.println(c.toString());
						}
						Tipoorden=-1;
					} 
					else if (Tipoorden == 2) {
						Collections.sort(listaCatedra, new OrdenarPorAula());
						for (Catedra c : listaCatedra) {
							System.out.println(c.toString());
						}
						Tipoorden=-1;
					} 
					else if(Tipoorden > 2) {
						Tipoorden = Integer.parseInt(JOptionPane
								.showInputDialog("Seleccione una opcion:\n1 Por Nombre de cátedra\n" + "2 Por nro de aula"));
					}
					

				} while (Tipoorden != -1);
				break;
			}
		} while (opcion != 4);

	}

}
