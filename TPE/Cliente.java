package TPE;
import java.util.Vector;
import java.util.Iterator;

public abstract class Cliente {

	private String nombre;
	
	public Cliente(String n) {
		nombre = n;
	}
	
	public void setNombre(String $nombre) {
		nombre = $nombre;
	}
	protected void addToVector(Vector v,Object o) {
		if(!v.contains(o)) {
			v.add(o);
		}
	}
	
	public boolean peliVista(Pelicula p) {
		boolean vista = false;
		Iterator<Pelicula> aux = this.getVistas();
		while(aux.hasNext()&&!vista) {
			vista = aux.next().equals(p);
		}
		return vista;
	}
	public String getNombre() {
		return nombre;
	}

	public void setValoracion(Pelicula p,int puntaje) {
		this.addVista(p);
		p.putValoracion(this, puntaje);
	}
	
	public abstract Vector<String> getGenerosPref();
	
	public abstract Iterator<Pelicula> getVistas();
	
	public abstract void addVista(Pelicula p);
	
}
