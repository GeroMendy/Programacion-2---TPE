package TPE;
import java.util.Vector;

public class CondGeneroTodos extends CondGeneros {

	public CondGeneroTodos(Vector<String>generos) {
		super(generos);
	}
	public CondGeneroTodos(Cliente cliente) {
		super(cliente);
	}
	
	public boolean cumple(Pelicula p) {
		if(g!=null) {
			boolean cumple = true;
			int i=0;
			while(i<g.size()&&cumple) {
				cumple = p.contieneGenero(g.elementAt(i));
				i++;
			}
			return cumple;
		}
		return true;
	}
}
