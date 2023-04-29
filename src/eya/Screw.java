package eya;

public class Screw {
	static int i = 0;
	private int id ;
	
	public Screw() {
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
