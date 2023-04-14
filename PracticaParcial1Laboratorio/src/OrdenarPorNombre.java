import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Catedra> {

	@Override
	public int compare(Catedra o1, Catedra o2) {
		// TODO Auto-generated method stub
		return o1.getCatedra().compareTo(o2.getCatedra());
	}

}
