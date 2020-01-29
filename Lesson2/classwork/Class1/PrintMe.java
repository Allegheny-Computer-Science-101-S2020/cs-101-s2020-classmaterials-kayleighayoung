public class PrintMe{
  public static void main(String[] args){
    for(int i = 10; i < 10; i++)
    /*
      System.out.println(i);
    */
      if (i % 2 == 0)
        System.out.println(i + "is even");
      else
        System.out.println(i + "is odd");
        
  }
}
