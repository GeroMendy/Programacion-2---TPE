package TPE;

public class CondNombre implements Condicion{
	
	private String nombre;
	public CondNombre(String n) {
		nombre = n;
	}
	
	public boolean cumple(Pelicula p) {
		return nombre.equals(p.getTitulo());
	}

}
