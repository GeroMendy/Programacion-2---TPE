package TPE;

public class CondDoble implements Condicion{
	
	private Condicion c1,c2;
	
	public CondDoble(Condicion cond1,Condicion cond2) {
		c1=cond1;
		c2=cond2;
	}
	
	public boolean cumple(Pelicula p) {
		return c1.cumple(p)&&c2.cumple(p);
	}

}
