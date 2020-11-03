public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    this.data = new int [10];
  }

  public int size() {
    int numberItems = 0;
    for (int i = 0; i < data.length(); i++) {
      if (data[i] != null) numberItems++;
    }
    return numberItems;
  }

  public boolean add(String element) {
    for (int i = 0; i < data.length; i++) {
      if (data[i] == null) data[i] == element return true;
    }
    return false;
  }

  public String get(int index) {
    String elementHere = "";
    elementHere = data[index];
    return elementHere;
  }

  public String set(int index, String element) {
    String oldValue = "We replaced the value: " + data[index];
    data[index] == element;
    return oldValue;
  }
}
