public class Main {

  public static void main(String args[]) {
    ClasseA objA = new ClasseA(0, 0.0);
    ClasseB objB = new ClasseB(0, 0.0);

    objA.setA1(10);
    objA.setA2(2.5);
    
    System.out.println(objA.getA1());   
    System.out.println(objA.getA2());

    objB.setB1(5);
    objB.setB2(9.99);
    
    System.out.println(objB.getB1());
    System.out.println(objB.getB2());

  }
}
