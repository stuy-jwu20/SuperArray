public class Tester {
  public static void main(String[] args) {
    System.out.println("SuperArray Mini-Tester");
    SuperArray words = new SuperArray(0);
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    //words.clear();
    System.out.println(words.toString());
    System.out.println(words.isEmpty());
    System.out.println(words.contains("kani"));
    System.out.println(words.contains("kaniUNI"));
    words.add(1, "addedString");
    System.out.println(words.toString());
    System.out.println(words.remove(0));
    System.out.println(words.toString());
    System.out.println(words.indexOf("addedString"));
    SuperArray newArray = new SuperArray();
    newArray.add("Ah");
    newArray.toArray();
    System.out.println(newArray.toString());
  }
}
