package eya;

public class Rim {
	static int i = 0;

	private int id ;

	public Rim() {
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
