public class MyClass {
    public static void main(String args[]) {
      String num = args[0];
      long numAsInt = Long.parseLong(num);
      long sqr = numAsInt*numAsInt;
      
      if ((""+sqr).endsWith(num)) {
          System.out.println("Automorphic");
      } else {
          System.out.println("not");
      }
    }
}
