import java.util.ArrayList;

public class Catedra {
	private int nroDeAula;
	private String catedra;
	private ArrayList<Alumno> listaAlumnosCatedra = new ArrayList<Alumno>();

	public Catedra(int nroDeAula, String catedra) {
		super();
		this.nroDeAula = nroDeAula;
		this.catedra = catedra;
	}

	public int getNroDeAula() {
		return nroDeAula;
	}

	public void setNroDeAula(int nroDeAula) {
		this.nroDeAula = nroDeAula;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public ArrayList<Alumno> getListaAlumnosCatedra() {
		return listaAlumnosCatedra;
	}

	public void setListaAlumnosCatedrao(ArrayList<Alumno> alumno) {
		this.listaAlumnosCatedra = alumno;
	}

	public void alumno(Alumno alumnos) {
		listaAlumnosCatedra.add(alumnos);
	}

	@Override
	public String toString() {
		return "Catedra [nroDeAula=" + nroDeAula + ", catedra=" + catedra + ", alumno=" + listaAlumnosCatedra + "]";
	}

}
