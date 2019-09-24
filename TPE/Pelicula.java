package TPE;
import java.util.Vector;
import java.util.Hashtable;
import java.util.Iterator;

public class Pelicula {
	
	private String titulo, sinopsis;
	private int minutosDurac, year;
	private Vector<String> protagonistas = new Vector<String>();
	private Vector<String> directores = new Vector<String>();
	private Vector<String> generos = new Vector<String>();
	private Hashtable<Cliente,Integer> vals = new Hashtable<Cliente,Integer>();
	
	public Pelicula(String $titulo,int $year) {
		titulo = $titulo;
		year = $year;
	}
	
	//Metodos para Condicion.cumple():
	public int compararAnios(int $year) {
		return year-$year;
	}
	public boolean contieneGenero(String g) {
		return generos.contains(g);
	}
	public boolean contieneActor(String a) {
		return protagonistas.contains(a);
	}
	public boolean contieneDirector(String d) {
		return directores.contains(d);
	}
	
	//Metodos para ordenar la lista de recomendadas:

	public double promedioValoracion() {
		if(this.cantValoraciones()>0) {
			int valor = 0;
			Iterator<Cliente> itAux = vals.keySet().iterator();
			while(itAux.hasNext()) {
				valor += vals.get(itAux.next());
			}
			return valor/this.cantValoraciones();
		}else {
			return 0;
		}
		
	}
	public int cantValoraciones() {
		return vals.size();
	}
	

	//equals() redefinido:
	public boolean equals(Object o) {
		try {
			Pelicula aux = (Pelicula)o;
			return ((aux.compararAnios(year)==0)&&(aux.mismoTitulo(titulo)));
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean mismoTitulo(String t) {
		return titulo.equals(t);
	}
	
	
	//Sets, adds:
	public void setTitulo(String _titulo) {
		titulo = _titulo;
	}
	public void setSinopsis(String $sinopsis) {
		sinopsis = $sinopsis;
	}
	public void setMinutos(int $minutosDurac) {
		minutosDurac = $minutosDurac;
	}
	public void setAnio(int $year) {
		year = $year;
	}
	public void addProtagonista(String p) {
		if(!protagonistas.contains(p)) {
			protagonistas.add(p);
		}
	}
	public void addDirector(String d) {
		if(!directores.contains(d)) {
			directores.add(d);
		}		
	}
	public void addGenero(String g) {
		if(!generos.contains(g)) {
			generos.add(g);
		}
	}
	public void putValoracion(Cliente cl,int puntaje) {
		vals.put(cl, puntaje);
	}
	
	
	//removes:
	public void removeProtagonista(String p) {
		protagonistas.remove(p);
	}
	public void removeDirector(String d) {
		directores.remove(d);
	}
	public void removeValoracion(Cliente cl) {
		vals.remove(cl);
	}
	
	
	//gets:
	public String getTitulo() {
		return titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public int getDuracion() {
		return minutosDurac;
	}
	public int getAnio() {
		return year;
	} 
	public Vector<String> getProtagonistas(){
		Vector<String> aux = new Vector<String>();
		aux.addAll(protagonistas);
		return aux;
	}
	public Vector<String> getDirectores(){
		Vector<String> aux = new Vector<String>();
		aux.addAll(directores);
		return aux;
	}
	public Vector<String> getGeneros(){
		Vector<String> aux = new Vector<String>();
		aux.addAll(generos);
		return aux;
	}
	public int getVal(Cliente cl) {
		int val = -1;
		val = vals.get(cl);
		return val;
	}
}
