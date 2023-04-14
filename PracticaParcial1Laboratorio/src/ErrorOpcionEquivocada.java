
public class ErrorOpcionEquivocada extends Exception {

	public ErrorOpcionEquivocada() {
		super("Error opcion equivocada");
	}
	public ErrorOpcionEquivocada(String args) {
		super("args");
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
