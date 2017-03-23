package language;

public class Francais implements _Language {
	
	public Francais() {
	
	}

	@Override
	public String backpack() {
		return "inventaire";
	}

	@Override
	public String help() {
		return "help";
	}

	@Override
	public String eat() {
		return "manger";
	}

	@Override
	public String dig() {
		return "creuser";
	}

	@Override
	public String observ() {
		return "observer";
	}

	@Override
	public String pick() {
		return "ramasser";
	}

	@Override
	public String north() {
		return "nord";
	}

	@Override
	public String south() {
		return "sud";
	}

	@Override
	public String west() {
		return "ouest";
	}

	@Override
	public String east() {
		return "est";
	}

	@Override
	public String use() {
		return "utiliser";
	}

	@Override
	public String goIn() {
		return "entrer";
	}

	@Override
	public String goOut() {
		return "sortir";
	}

	@Override
	public String thro() {
		return "jeter";
	}

	@Override
	public String turnOn() {
		return "allumer";
	}

	@Override
	public String turnOff() {
		return "eteindre";
	}

	@Override
	public String juggle() {
		return "jongler";
	}

	@Override
	public String playPc() {
		return "jouer";
	}

	@Override
	public String onbreak() {
		return "casser";
	}
	
	public String climb(){
		return "escalader";
	}
}
