package eya;

import java.io.*;
import java.util.List;

public class main {
	public static Skateboard getProduct()
	{
		Skateboard sb = new Skateboard() ;
		return sb;
	}
	public static void main(String[] args)
    {
		Skateboard sb = getProduct();
        System.out.println(sb.getScrews().size());
        System.out.println(sb.getWheels().size());
        System.out.println(sb.getWheels().get(0).getScrews().size());

    }

}
