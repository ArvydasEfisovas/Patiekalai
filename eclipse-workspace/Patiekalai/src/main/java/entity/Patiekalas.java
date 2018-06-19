package entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class Patiekalas {
	private int id;
	
	
	
	
	@Min(value = 1, message = "Ivestas ne skaicius.")
	@Max(value = 99999, message = "Ivestas ne skaicius.")
	private int kalorijuSkaicius;
	@Min(value = 1, message = "Ivestas ne skaicius.")
	@Max(value = 99999, message = "Ivestas ne skaicius.")
	private double kaina;
	@Pattern(regexp = "[A-Za-z0-9]{5,100}+", message = "Klaidingai ivesta grupe!")
	private String patiekaloGrupe;
	@Pattern(regexp = "[A-Za-z0-9]{5,100}+", message = "Klaidingai ivestas pavadinimas!")
	private String patiekaloPavadinimas;
	
	
	
	public Patiekalas() {
		super();
	}

	public Patiekalas(int id, String patiekaloGrupe, String patiekaloPavadinimas, int kalorijuSkaicius, double kaina) {
		super();
		this.id = id;
		this.patiekaloGrupe = patiekaloGrupe;
		this.patiekaloPavadinimas = patiekaloPavadinimas;
		this.kalorijuSkaicius = kalorijuSkaicius;
		this.kaina = kaina;
	}
	

	public Patiekalas(
			String patiekaloGrupe,
			 String patiekaloPavadinimas,
			 int kalorijuSkaicius,
			 double kaina
			 ) {
		super();
		this.kalorijuSkaicius = kalorijuSkaicius;
		this.kaina = kaina;
		this.patiekaloGrupe = patiekaloGrupe;
		this.patiekaloPavadinimas = patiekaloPavadinimas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatiekaloGrupe() {
		return patiekaloGrupe;
	}

	public void setPatiekaloGrupe(String patiekaloGrupe) {
		this.patiekaloGrupe = patiekaloGrupe;
	}

	public String getPatiekaloPavadinimas() {
		return patiekaloPavadinimas;
	}

	public void setPatiekaloPavadinimas(String patiekaloPavadinimas) {
		this.patiekaloPavadinimas = patiekaloPavadinimas;
	}

	public int getKalorijuSkaicius() {
		return kalorijuSkaicius;
	}

	public void setKalorijuSkaicius(int kalorijuSkaicius) {
		this.kalorijuSkaicius = kalorijuSkaicius;
	}

	public double getKaina() {
		return kaina;
	}

	public void setKaina(double kaina) {
		this.kaina = kaina;
	}
	
	
	
	
	
	
	
	
}
