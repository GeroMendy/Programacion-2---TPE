package TPE;
import java.util.Comparator;

public class CompPuntaje implements Comparator<Pelicula>{

	public int compare(Pelicula p1, Pelicula p2) {
		return (int) (p2.promedioValoracion()-p1.promedioValoracion()*100);
	}
}
