package TPE;
import java.util.Vector;
import java.util.Iterator;

public class Usuario extends Cliente {
	
	private int edad;
	private Vector<String> generosPref = new Vector<String>();
	private Vector<Pelicula> vistas = new Vector<Pelicula>();

	public Usuario(String nombre) {
		super(nombre);
	}
	
	public Vector<String> getGenerosPref(){
		return generosPref;
	}
	public Iterator<Pelicula> getVistas() {
		return vistas.iterator();
	}
	
	
	//add, set:
	public void addGenero(String genero) {
		addToVector(generosPref,genero);
	}
	public void setEdad(int $edad) {
		edad = $edad;
	}
	public void addVista(Pelicula p) {
		addToVector(vistas,p);
	}
	
	//remove:
	public void removeGenero(String genero) {
		generosPref.remove(genero);
	}
	
}
