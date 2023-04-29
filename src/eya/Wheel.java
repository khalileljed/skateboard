package eya;
import java.util.ArrayList;
public class Wheel {
	static int i ;
	private int id ;
	private Tire tire;
	private Rim rim;
	private ArrayList<Screw> screws = new ArrayList<>();
	public Wheel() {
		this.id = i ;
		i++;
		this.tire = new Tire();
		this.rim = new Rim();
		for (int i = 0 ; i < 4 ; i++)
		{
		Screw screw = new Screw();
		this.screws.add(screw);
		}
	}
	public static int getI() {
		return i;
	}
	public static void setI(int i) {
		Wheel.i = i;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public Rim getRim() {
		return rim;
	}
	public void setRim(Rim rim) {
		this.rim = rim;
	}
	public ArrayList<Screw> getScrews() {
		return screws;
	}
	public void setScrews(ArrayList<Screw> screws) {
		this.screws = screws;
	}

}
