package stationery;

import java.util.*;

public class Ruler implements Usable{
  int length;

  public Ruler(){
    this.length = 15;
  }

  public void getLength(){
    System.out.println(this.length);
  }
}
