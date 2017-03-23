package moteur;

import java.util.LinkedList;

public abstract class endroit {
	public LinkedList<Objet> inventaire=new LinkedList<Objet>();
	public LinkedList<Personnage> personne=new LinkedList<Personnage>();
	
	public endroit Nord=null;
	public endroit Sud=null;
	public endroit Est=null;
	public endroit Ouest=null;
	
	
	public int SortieHauteur=0;
	public endroit Hauteur=null;
	public endroit RetourEnBas=null;
	
	public boolean SortieNord=false;
	public boolean SortieSud=false;
	public boolean SortieEst=false;
	public boolean SortieOuest=false;
	
}
