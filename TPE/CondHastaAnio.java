package TPE;

public class CondHastaAnio extends CondAnio{
	
	public CondHastaAnio(int anio){
		super(anio);
	}

	public boolean cumple(Pelicula p) {
		return p.compararAnios(year)<=0;
	}
}
