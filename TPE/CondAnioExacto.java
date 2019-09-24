package TPE;

public class CondAnioExacto  extends CondAnio{
	
	public CondAnioExacto(int anio) {
		super(anio);
	}
	
	public boolean cumple(Pelicula p) {
		return p.compararAnios(year) == 0;
	}
}
