package TPE;
import java.util.Vector;

public abstract class CondGeneros implements Condicion{

	protected Vector<String> g;
	
	public CondGeneros(Vector<String>generos) {
		g=generos;
	}
	public CondGeneros(Cliente cliente) {
		g=cliente.getGenerosPref();
	}
	
}
