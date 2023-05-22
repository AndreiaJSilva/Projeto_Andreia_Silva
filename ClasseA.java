public class ClasseA {
  private int A1;
  private double A2;

  ClasseA(int x, double d){
    A1 = x;
    A2 = d;
  }
  
  public int getA1(){
    return A1;
  }

  public double getA2(){
    return A2;
  }

  public void setA1(int A1){
    this.A1 = A1;
  }

  public void setA2(double A2){
    this.A2 = A2;
  }

  public String MA1(){
    return ("Método MA1");
  }

  public String MA2(){
    return ("Método MA2");
  }

};
