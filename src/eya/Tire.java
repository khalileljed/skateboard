package eya;

public class Tire {
	static int i  ;
	private int id ;
	public Tire() {
		this.id = i ;
		i ++ ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
