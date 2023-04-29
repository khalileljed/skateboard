package eya;

import java.util.ArrayList;

public class Skateboard {
	static int i  ;
	private int id ;
	private ArrayList<Wheel> wheels = new ArrayList<>();
	private Board board ;
	private ArrayList<Axle> axles = new ArrayList<>();
	private ArrayList<Screw> screws = new ArrayList<>();

	public Skateboard() {
		this.id = i ;
		i++;
		this.board = new Board();
		for (int i = 0 ; i < 4 ; i++)
		{
		Wheel wheel = new Wheel();
		this.wheels.add(wheel);
		}
		
		for (int i = 0 ; i < 2 ; i++)
		{
		Axle axle = new Axle();
		this.axles.add(axle);
		}
		
		for (int i = 0 ; i < 8 ; i++)
		{
		Screw screw = new Screw();
		this.screws.add(screw);
		}
		
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Skateboard.i = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public ArrayList<Axle> getAxles() {
		return axles;
	}

	public void setAxles(ArrayList<Axle> axles) {
		this.axles = axles;
	}

	public ArrayList<Screw> getScrews() {
		return screws;
	}

	public void setScrews(ArrayList<Screw> screws) {
		this.screws = screws;
	}

	
}
