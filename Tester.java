public class Tester {
  public static void main(String[] args) {
    System.out.println("SuperArray Mini-Tester");
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    SuperArray otherArray = new SuperArray();
    otherArray.add("kani");   otherArray.add("uni");     otherArray.add("ebi");     otherArray.add("una");
    otherArray.add("una");    otherArray.add("ebi");     otherArray.add("kani");    otherArray.add("una");
    otherArray.add("una");    otherArray.add("ebi");     otherArray.add("toro");
    System.out.println(words.equals(otherArray));
  }
}
