package TPE;

public class CondContieneDirector implements Condicion{

	private String director;
	
	public CondContieneDirector(String $director) {
		director = $director;
	}
	
	public boolean cumple(Pelicula p) {
		return p.contieneDirector(director);
	}
}
