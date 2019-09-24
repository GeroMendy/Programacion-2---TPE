package TPE;
import java.util.Comparator;

public class CompPopularidad implements Comparator<Pelicula> {
	
	public int compare(Pelicula p1,Pelicula p2) {
		return p2.cantValoraciones()-p1.cantValoraciones();
	}

}
