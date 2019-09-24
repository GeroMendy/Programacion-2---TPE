package TPE;

public class CondContieneActor implements Condicion{

	private String actor;
	
	public CondContieneActor(String $actor) {
		actor=$actor;
	}
	public boolean cumple(Pelicula p) {
		return p.contieneActor(actor);
	}
}
