public class Tester {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    for (int i = 0; i < 10; i++) {
      words.add("" + i);
    }
    System.out.println(words);

    // for (int i = 5; i > -5; i--) {
    //   SuperArray wordsTwo = new SuperArray(i);
    //   System.out.println(words + " The array length created was " + i);
    // }

    // for (int i = 5; i <= words.size(); i++) {
    //   words.get(i);
    //   System.out.println(" The string we got was " + i);
    // }

    // for (int i = 5; i <= words.size(); i--) {
    //     words.set(i, "replacer");
    //     System.out.println(words);
    // }

    // for (int i = 5; i <= words.size(); i--) {
    //     words.remove(i);
    //     System.out.println(words);
    // }

    // words.add(-1, "new word");
    // words.add(7, "new word");
    // words.add(10, "new word");
    // System.out.println(words);
  }
}
