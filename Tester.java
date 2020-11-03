public class Tester {
  public static void main(String[] args) {
    System.out.println("SuperArray Mini-Tester");
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
  }
}
