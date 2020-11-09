public class Demo {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }

/////////////////// Part 3 of SuperArray ///////////////////

  public static void removeDuplicates(SuperArray s) {
    System.out.println(s.toArray()[1]);
    for (int i = 0; i < (s.toArray().length); i++) {
      String toRemove = s.toArray()[i];
      int indexed = s.indexOf(toRemove);
      for (int j = i; j < (s.toArray().length); j++) {
        if ((s.toArray()[j].equals(toRemove)) && (j > indexed)) {
          s.remove(j);
        }
      }
    }
  }
}
