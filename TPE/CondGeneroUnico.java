package TPE;
import java.util.Vector;

public class CondGeneroUnico extends CondGeneros{

	public CondGeneroUnico(Vector<String>generos) {
		super(generos);
	}
	public CondGeneroUnico(Cliente cliente) {
		super(cliente);
	}
	
	public boolean cumple(Pelicula p) {
		if(g!=null) {
			if(g.size()!=0) {
				boolean cumple = false;
				int i=0;
				while(i<g.size()&&!cumple) {
					cumple = p.contieneGenero(g.elementAt(i));
					i++;
				}
				return cumple;
			}
		}
		return true;
	}
}
