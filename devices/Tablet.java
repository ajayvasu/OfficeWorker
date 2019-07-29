package devices;

import java.util.*;

public class Tablet{
	private int id;
	static int count;

	public Tablet(){
		id = count++;
	}
	public Tablet(int id){
		this.id = id;
	}

	public void getId(){
		System.out.println(this.id);
	}
}
