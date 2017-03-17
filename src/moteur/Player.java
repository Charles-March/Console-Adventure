package moteur;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import actions.*;

public class Player {
	public List<Objet> inventaire = new LinkedList<Objet>();
	public int locationID=0;
	public String name;
	public int force=0;
	public int intelligence=0;
	public int agilite=0;
	public int chance=50;
	public Lieu LieuActuel;
	public Piece PieceActuelle=null;
	static public LinkedList<£Action> ListeAction = new LinkedList<£Action>();
	static public LinkedList<£Action> ListeActionAffichee = new LinkedList<£Action>();
	Scanner sc = new Scanner(System.in);
	
	public Player(){
		LieuActuel=prefab_Lieu.Lieu_Maison.maMaison1();
		PieceActuelle=(Piece)LieuActuel.EntreePiece.Sud.Sud;
		inventaire.add(prefab_objects.Objects_outils.prefab_mouchoir());
	}
	
	public LinkedList<£Action> ActionPossibleDansLieu(){
		LinkedList<£Action> l= new LinkedList<£Action>();
		endroit lieu;

		if(PieceActuelle!=null) lieu=PieceActuelle;
		else lieu=LieuActuel;
		
		int i;
		for(i=0;i<lieu.inventaire.size();i++){
			LinkedList<£Action> l2= ActionPossibleSurObjet(lieu.inventaire.get(i));
			
			for(int j=0;j<l2.size();j++){
				£Action o=l.get(j);
				if(o.AppartientA(l)){
					l.add(o);
				}
			}
		}
	return l;	
	}
	
	public LinkedList<£Action> ActionPossibleSurObjet(Objet o) {
		LinkedList<£Action> l= new LinkedList<£Action>();
		for(int i=0;i<ListeAction.size();i++){
			£Action a=ListeAction.get(i);
			if(a.possible(this,o)){
				l.add(a);
			}
		}
	return l;
	}
	
	public void InitAction(){
		ListeAction.add(new Manger());
		ListeAction.add(new Nord());
		ListeAction.add(new Sud());
		ListeAction.add(new Est());
		ListeAction.add(new Ouest());
		ListeAction.add(new Sortir());
		ListeAction.add(new Entrer());
		ListeAction.add(new Jeter());
	}
	
	public boolean fait(ActionDefinies ad){
		if(ad==null) return false;
		LinkedList<£Action> l = ActionPossibleSurObjet(ad.o);
		for(int i=0;i<l.size();i++){
			£Action a = l.get(i);
			if(a.name.equals(ad.s)){
				a.fait(this,ad.o);
				return true;
			}
		}
	return false;
	}

	public boolean over() {
		return false;
	}
	
	public endroit endroit(){
		return(PieceActuelle==null)?LieuActuel:PieceActuelle;
	}
	
	public void setEndroit(endroit e){
		if(e instanceof Piece){
			PieceActuelle=(Piece) e;
		}
		else{
			LieuActuel = (Lieu) e;
			PieceActuelle=null;
		}
	}
}
