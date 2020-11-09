public class Demo {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    SuperArray wordsTwo = new SuperArray();
    wordsTwo.add("1");   wordsTwo.add("2");     wordsTwo.add("3");     wordsTwo.add("4");
    wordsTwo.add("5");    wordsTwo.add("6");     wordsTwo.add("7");    wordsTwo.add("8");
    wordsTwo.add("9");    wordsTwo.add("10");     wordsTwo.add("11");
    System.out.println(zip(words, wordsTwo));
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

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray zipped = new SuperArray();
    int largerArray = a.size();
    if (b.size() > a.size()) {
      largerArray = b.size();
    }
    for (int i = 0; i < largerArray; i++) {
      if ((i < (a.size())) && (i < b.size())){
        zipped.add(a.toArray()[i]);
        zipped.add(b.toArray()[i]);
      }
      else if ((i >= b.size()) && (a.size() > b.size())) {
        zipped.add(a.toArray()[i]);
      }
      else if ((i >= a.size()) && (a.size() < b.size())) {
        zipped.add(b.toArray()[i]);
      } else {
      }
    }
  return zipped;
  }
}
