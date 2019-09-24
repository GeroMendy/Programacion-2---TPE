package TPE;
import java.util.Vector;
import java.util.Iterator;
import java.util.Comparator;

public class Sistema {
	
	private int cantRecomendadas;
	private Vector<Pelicula> pelis = new Vector();
	private int pMin,pMax;
	
	public Sistema(int cant,int puntajeMin,int puntajeMax) {
		cantRecomendadas = cant;
		pMin = puntajeMin;
		pMax = puntajeMax;
	}
	
	//Set/Add:
	public void setCantRecomendadas(int c) {
		if(c>0) {
			cantRecomendadas = c;
		}
	}
	public void addPeli(Pelicula p) {
		if(!pelis.contains(p)) {
			pelis.add(p);
		}
	}
	
	//Remove:
	public void removePeli(Pelicula p) {
		pelis.remove(p);
	}
	
	
	
	public Vector<Pelicula> buscar(Condicion cond){
		Vector<Pelicula> salida = new Vector();
		for(int i=0;i<pelis.size();i++) {
			Pelicula p = pelis.elementAt(i);
			if(cond.cumple(p)) {
				salida.add(p);
			}
		}
		return salida;
	}
	
	public Vector<Pelicula> recomendar(Cliente cl,Comparator<Pelicula> orden,Condicion cond, int cant){
		Condicion noVista = new CondNoVista(cl);
		Condicion total = new CondDoble(noVista,cond);
		Vector<Pelicula>sal = buscar(total);
		sal.sort(orden);
		while(sal.size()>cant) {
			sal.remove(cant);
		}
		return sal;
	}
	public Vector<Pelicula> recomendar(Cliente cl,Comparator<Pelicula> orden,Condicion cond){
		return recomendar(cl,orden,cond,cantRecomendadas);
	}
	public void valorar(Cliente cl,Pelicula p,int punt) {
		if(punt<=pMax&&punt>=pMin) {
			cl.setValoracion(p, punt);
		}
	}
	

}
