public class ClasseB {
  private int B1;
  private double B2;

  ClasseB(int x, double y){
    B1 = x;
    B2 = y;
  }
  
  public int getB1(){
    return B1;
  }

  public double getB2(){
    return B2;
  }

  public void setB1(int B1){
    this.B1 = B1;
  }

  public void setB2(double B2){
    this.B2 = B2;
  }

  public String MB1(){
    return ("Método MB1");
  }

  public String MB2(){
    return ("Método MB2");
  }

};
