public class Demo {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray wordsTwo = new SuperArray();
    wordsTwo.add("kani");   wordsTwo.add("uni");     wordsTwo.add("ebi");     wordsTwo.add("una");
    wordsTwo.add("una");    wordsTwo.add("ebi");     wordsTwo.add("kani");    wordsTwo.add("una");
    wordsTwo.add("una");    wordsTwo.add("ebi");     wordsTwo.add("toro");
    System.out.println(findOverlap(words, wordsTwo));
  }

/////////////////// Part 3 of SuperArray ///////////////////

  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < (s.toArray().length); i++) {
      String toRemove = s.toArray()[i];
      int indexed = s.indexOf(toRemove);
      for (int j = i; j < (s.toArray().length); j++) {
        if ((s.toArray()[j].equals(toRemove)) && (j > indexed)) {
          s.remove(j);
          j--;
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray overlaps = new SuperArray();
    for (int i = 0; i < (a.toArray().length); i++) {
      String toOverlap = a.toArray()[i];
      for (int j = 0; j < (b.toArray().length); j++) {
        if (b.toArray()[j].equals(toOverlap)) {
          overlaps.add(toOverlap);
        }
      }
    }
    removeDuplicates(overlaps);
    return overlaps;
  }
}
