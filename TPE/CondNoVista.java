package TPE;

public class CondNoVista implements Condicion{
	
	private Cliente cl;
	
	public CondNoVista(Cliente cliente) {
		cl = cliente;
	}
	public boolean cumple(Pelicula p) {
		return !cl.peliVista(p);
	}

}
