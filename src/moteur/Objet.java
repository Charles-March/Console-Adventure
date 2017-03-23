package moteur;

import java.util.LinkedList;
import java.util.List;

public class Objet {
	public String name;
	
	public int reservoir=0;
	public int degat=0;
	public int creuse=0;
	public int vetement=0;
	public int ecrire=0;
	public int fun=0;
	public int communication=0;
	public int hygiene=0;
	public int fumer=0;
	public int nourir=0;
	public int boire=0;
	public int transport_corps=0;
	public int alcool=0;
	public int support_ecriture=0;
	public int transport_objet=0;
	public int lumineux=0;
	public int repose=0;
	public int escalader=0;	
	
	public int faitdufeu=0;
	public int brule=0;
	
	public int place=0;
	public int liquide=0;
	
	public boolean besoin_electricite=false;
	public boolean besoin_eau=false;
	public boolean actif=false;
	public boolean allumable=false;
	
	public Objet Onbreak;
	public boolean breakable=false;
	
	public int besoin_force=0;
	public int besoin_agilite=0;
	public int besoin_intelligence=0;
	public int besoin_chance=0;
	
	public String message_echec;
	public List<Objet> inventaire;
	
	public Objet(String s){
		name=s;
	}
	
	public Objet(String s, LinkedList<Objet> l){
		name=s;
		inventaire=l;
	}
	
	public void RemoveFromAnywhere(Player pl){
		if(pl.inventaire.contains(this)){
			pl.inventaire.remove(this);
		}
		else{
			pl.endroit().inventaire.remove(this);
		}
	}
	
}
