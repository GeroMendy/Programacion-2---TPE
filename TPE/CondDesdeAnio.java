package TPE;

public class CondDesdeAnio extends CondAnio{

	public CondDesdeAnio(int anio) {
		super(anio);
	}
	
	public boolean cumple(Pelicula p) {
		return p.compararAnios(year)>=0;
	}
}
