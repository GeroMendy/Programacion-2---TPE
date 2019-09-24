package TPE;
import java.util.Vector;
import java.util.Comparator;
import java.util.Iterator;

public class _Simulacion {

	public static void main(String[]args) {

		Sistema sist = new Sistema(5,1,5);
		Vector<Cliente>cls = new Vector<Cliente>();

		Usuario lisa = new Usuario("Lisa");
		Usuario bart = new Usuario("Bart");
		Usuario maggie=new Usuario("Maggie");
		Usuario marge = new Usuario("Marge");
		Usuario homero = new Usuario("Homero");

		Grupo hombres = new Grupo("Hombres Simpson");
		Grupo hermanos = new Grupo("Hermanos Simpson");
		Grupo familia = new Grupo("Familia Simpson");

		cls.add(lisa);
		cls.add(bart);
		cls.add(maggie);
		cls.add(marge);
		cls.add(homero);

		cls.add(hombres);
		cls.add(hermanos);
		cls.add(familia);

		lisa.addGenero("romantico");
		lisa.addGenero("musical");
		lisa.addGenero("infantil");
		lisa.addGenero("aventura");

		bart.addGenero("musical");
		bart.addGenero("infantil");
		bart.addGenero("aventura");
		bart.addGenero("accion");

		maggie.addGenero("musical");
		maggie.addGenero("infantil");
		maggie.addGenero("aventura");

		marge.addGenero("romantico");
		marge.addGenero("musical");
		marge.addGenero("infantil");
		marge.addGenero("aventura");

		homero.addGenero("musical");
		homero.addGenero("infantil");
		homero.addGenero("accion");

		hombres.addIntegrante(homero);
		hombres.addIntegrante(bart);

		hermanos.addIntegrante(maggie);
		hermanos.addIntegrante(lisa);
		hermanos.addIntegrante(bart);

		familia.addIntegrante(hermanos);
		familia.addIntegrante(homero);
		familia.addIntegrante(marge);

		Pelicula peli = new Pelicula("Up",2009);
		peli.setSinopsis("Carl Fredricksen es un vendedor de globos de 78 años de edad dispuesto a cumplir su\r\n" + 
				"sueño: atar miles de globos a su casa y volar a Sudamérica. Sin embargo, descubre\r\n" + 
				"demasiado tarde a un joven e inesperado polizón. Lo que en principio será recelo,\r\n" + 
				"acabará por tornarse simpatía hacia el muchacho mientras juntos pasan fascinantes\r\n" + 
				"aventuras en exóticos lugares.");
		peli.addDirector("Pete Docter");
		peli.addDirector("Bob Peterson");
		peli.addProtagonista("Pete Docter");
		peli.addProtagonista("Ed Asner");
		peli.addProtagonista("Bob Peterson");
		peli.addProtagonista("Jordan Nagai");
		peli.addGenero("infantil");
		peli.addGenero("accion");
		peli.addGenero("drama");

		sist.addPeli(peli);

		peli = new Pelicula("Los Simpson: la pelicula",2007);
		peli.setSinopsis("La combinación de Homero (Dan Castellaneta), su nuevo puerco mascota, y un silo\r\n" + 
				"lleno de excremento podrían provocar un desastre que amenace no sólo a Springfield,\r\n" + 
				"sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,\r\n" + 
				"dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara\r\n" + 
				"para intentar redimirse con la intención de salvar al mundo y ganarse el perdón de\r\n" + 
				"Marge (Julie Kavner).");
		peli.addDirector("David Silverman");
		peli.addProtagonista("Dan Castellanata");
		peli.addProtagonista("Harry Shearer");
		peli.addProtagonista("Julie Kavner");
		peli.addGenero("romantico");
		peli.addGenero("musical");
		peli.addGenero("infantil");
		peli.addGenero("aventura");
		peli.addGenero("comedia");

		sist.addPeli(peli);

		peli = new Pelicula("Los Increibles",2004);
		peli.setSinopsis("Un súper héroe retirado lucha contra el aburrimiento en un suburbio y junto con su\r\n" + 
				"familia tiene la oportunidad de salvar al mundo.");
		peli.addDirector("Brad Bird");
		peli.addProtagonista("Brad Bird");
		peli.addProtagonista("Craig T. Nelson");
		peli.addProtagonista("Holly Hunter");
		peli.addGenero("musical");
		peli.addGenero("infantil");
		peli.addGenero("aventura");
		peli.addGenero("accion");

		sist.addPeli(peli);

		peli = new Pelicula("Los Increibles 2",2018);
		peli.setSinopsis("Helen entra en acción y debe luchar contra un cibercriminal que planea hipnotizar el\r\n" + 
				"mundo a través de las pantallas de las computadoras. Eso deja al Sr. Increíble con uno\r\n" + 
				"de sus mayores desafíos: quedarse en casa y cuidar de tres niños traviesos.");
		peli.addDirector("Brad Bird");
		peli.addProtagonista("Brad Bird");
		peli.addProtagonista("Craig T. Nelson");
		peli.addProtagonista("Holly Hunter");
		peli.addGenero("musical");
		peli.addGenero("infantil");
		peli.addGenero("aventura");
		peli.addGenero("accion");

		sist.addPeli(peli);

		peli = new Pelicula("Toy Story",1995);
		peli.setSinopsis("Lo mejor de la animación computarizada produce esta historia sobre juguetes que\r\n" + 
				"cobran vida cuando su dueño se ausenta.");
		peli.addDirector("John Lasseter");
		peli.addProtagonista("Tom Allen");
		peli.addProtagonista("Tom Hanks");
		peli.addProtagonista("Don Rickles");
		peli.addProtagonista("Wallace Shawn");
		peli.addGenero("infantil");
		peli.addGenero("aventura");
		peli.addGenero("accion");

		sist.addPeli(peli);

		peli = new Pelicula("Monster Inc.",2001);
		peli.setSinopsis("Monsters, Incorporated es la fábrica de sustos más grande en el mundo de los\r\n" + 
				"monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores.\r\n" + 
				"Sullivan es un monstruo grande e intimidante de piel azul, grandes manchas color\r\n" + 
				"púrpura y cuernos. Su asistente, mejor amigo y compañero de cuarto es Mike\r\n" + 
				"Wazowski (Billy Crystal), un pequeño y alegre monstruo verde con un solo ojo. Boo\r\n" + 
				"(Mary Gibbs), una niña pequeña visita lugares en donde nunca antes había estado un\r\n" + 
				"ser humano.");
		peli.addDirector("Pete Docter");
		peli.addProtagonista("John Goodman");
		peli.addProtagonista("Billy Crystal");
		peli.addProtagonista("John Ratzenberger");
		peli.addGenero("musical");
		peli.addGenero("infantil");
		peli.addGenero("aventura");
		peli.addGenero("accion");

		sist.addPeli(peli);

		peli = sist.buscar(new CondNombre("Los Increibles")).elementAt(0);
		//System.out.println(peli.getTitulo());

		lisa.setValoracion(peli,5);
		bart.setValoracion(peli,2);
		homero.setValoracion(peli,4);
		marge.setValoracion(peli,2);
		//printVal(lisa,peli);
		//printVal(bart,peli);
		//printVal(homero,peli);
		//printVal(marge,peli);

		peli = sist.buscar(new CondNombre("Los Increibles 2")).elementAt(0);
		//System.out.println(peli.getTitulo());

		marge.setValoracion(peli, 5);
		//printVal(marge,peli);

		peli = sist.buscar(new CondNombre("Toy Story")).elementAt(0);
		//System.out.println(peli.getTitulo());

		maggie.setValoracion(peli, 1);
		//printVal(maggie,peli);

		
		//1)
		
		System.out.println("\n1)\n");
		Iterator<Pelicula> it = marge.getVistas();
		printPelis(it);
		
		//2)
		
		System.out.println("\n2)\n");
		it = bart.getVistas();
		printPelis(it);
		
		
		//3)
		
		System.out.println("\n3)\n");
		Vector<Pelicula> vec = null;
		for(int i=0;i<cls.size();i++) {
			Cliente cl = cls.elementAt(i);
			vec = sist.recomendar(cl, new CompPopularidad(), new CondGeneroTodos(cl), 2);
			System.out.println(cl.getNombre()+":");
			printPelis(vec);
		}
		
		
		//4)
		
		System.out.println("\n4)\n");
		vec = null;
		for(int i=0;i<cls.size();i++) {
			Cliente cl = cls.elementAt(i);
			vec = sist.recomendar(cl, new CompPopularidad(), new CondGeneroUnico(cl));
			System.out.println(cl.getNombre());
			printPelis(vec);
		}
		
		
		//5)

		System.out.println("\n5)\n");
		peli = sist.buscar(new CondNombre("Up")).elementAt(0);
		hermanos.setValoracion(peli, 4);
		
		
		//6)
		
		//6.2)
		System.out.println("\n6.2)\n");
		it = bart.getVistas();
		printPelis(it);
		
		//6.3)
		System.out.println("\n6.3)\n");
		vec = null;

		for(int i=0;i<cls.size();i++) {
			Cliente cl = cls.elementAt(i);
			vec = sist.recomendar(cl, new CompPopularidad(), new CondGeneroTodos(cl), 2);
			System.out.println(cl.getNombre()+":");
			printPelis(vec);
		}
		
		//6.4)
		System.out.println("\n6.4)\n");
		vec = null;
		for(int i=0;i<cls.size();i++) {
			Cliente cl = cls.elementAt(i);
			vec = sist.recomendar(cl, new CompPopularidad(), new CondGeneroUnico(cl));
			System.out.println(cl.getNombre());
			printPelis(vec);
		}
		
		
		//7)
		
		System.out.println("\n7)\n");
		vec = null;
		Condicion aux1 = new CondContieneActor("Pete Docter");
		Condicion aux2 = new CondContieneDirector("Pete Docter");
		Condicion cond = new CondDoble(aux1,aux2);
		vec = sist.buscar(cond);
		printPelis(vec);
		vec = null;
		cond = new CondContieneActor("Tom Hanks");
		vec = sist.buscar(cond);
		printPelis(vec);
		vec = null;
		cond = new CondDesdeAnio(2000);
		vec = sist.buscar(cond);
		printPelis(vec);
		vec = null;
		Vector<String> generos = new Vector<String>();
		generos.add("romantico");
		generos.add("comedia");
		generos.add("drama");
		CondGeneros c = new CondGeneroUnico(generos);
		vec = sist.buscar(c);
		printPelis(vec);
		vec=null;

	}	
	public static void printVal(Cliente cl,Pelicula p) {
		System.out.println("------\n");
		System.out.println(cl.getNombre()+" - "+p.getTitulo()+" : "+p.getVal(cl));
	}
	public static void printPelis(Iterator<Pelicula>it) {
		while(it.hasNext()) {
			System.out.println(it.next().getTitulo());
		}
	}
	public static void printPelis(Vector<Pelicula>v) {
		for(int i=0;i<v.size();i++) {
			System.out.println(v.elementAt(i).getTitulo());
		}
		System.out.print("\n");
	}
}
