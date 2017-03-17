package prefab_objects;
import java.util.LinkedList;
import moteur.*;

public class Objects_ustensiles {
	
	static public Objet prefab_Bol(){
		Objet a=new Objet("Bol");
		a.fun=1;
		a.reservoir=2;
		a.transport_objet=1;
		a.place=2;
		a.inventaire=new LinkedList<Objet>();
		return a;
	}
	
	static public Objet prefab_Verre(){
		Objet a=new Objet("Verre");
		a.degat=1;
		a.reservoir=1;
		a.transport_objet=1;
		a.place=2;
		a.inventaire=new LinkedList<Objet>();
		return a;
	}
	
	static public Objet prefab_PlatATarte(){
		Objet a=new Objet("Plat a Tarte");
		a.degat=2;
		a.reservoir=2;
		a.transport_objet=1;
		a.place=3;
		a.inventaire=new LinkedList<Objet>();
		return a;
	}
	
}
