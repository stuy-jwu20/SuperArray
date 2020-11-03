public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    this.data = new int [10];
  }

  public int size() {
    int numberItems = 0;
    for (int i = 0; i < data.length(); i++) {
      if (data[i] != null) {
        numberItems++;
      }
    }
    return numberItems;
  }
}
