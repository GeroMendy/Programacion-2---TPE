package TPE;
import java.util.Iterator;
import java.util.Vector;

public class Grupo extends Cliente{

	private Vector<Cliente> integrantes = new Vector<Cliente>();
	
	public Grupo(String nombre) {
		super(nombre);
	}
	
	public Vector<String> getGenerosPref(){
		Vector<String> salida = new Vector<String>();
		Vector<String> aux;
		for(int i=0;i<integrantes.size();i++) {
			aux = integrantes.elementAt(i).getGenerosPref();
			for(int j=0;j<aux.size();j++) {
				addToVector(salida, aux.elementAt(j));
			}
		}
		return salida;
	}
	public Iterator<Pelicula> getVistas() {
		Vector<Pelicula> salida = new Vector<Pelicula>();
		for(int i=0;i<integrantes.size();i++) {
			Iterator<Pelicula> it;
			it = integrantes.elementAt(i).getVistas();
			while(it.hasNext()) {
				addToVector(salida,it.next());
			}
		}
		return salida.iterator();
	}
	
	//add:
	public void addIntegrante(Cliente nuevo) {
		if(!integrantes.contains(nuevo)) {
			integrantes.add(nuevo);
		}
	}
	public void addVista(Pelicula p) {
		for(int i=0;i<integrantes.size();i++) {
			integrantes.elementAt(i).addVista(p);
		}
	}
	
	//remove:
	public void removeIntegrante(Cliente cl) {
		integrantes.remove(cl);
	}	
}
