package stationery;

public class Pencil implements Usable{
  private String type;

  public Pencil(){
    this.type = "HB";
  }

  public void getType(){
    System.out.println(type);
  }
}
