public class SuperArray {
  private String[] data;
  private int size;

  private void resize(){
    size = size + 10;
    String[] largerArray = new String [size];
    for (int i = 0; i < data.length-1; i++) {
      largerArray[i] = data[i];
    }
    data = largerArray;
  }

  public void clear() {
    int count = 0;
    while (count < size()) {
      add(null);
      count++;
    }
  }

  public SuperArray() {
    size = 10;
    this.data = new String [size];
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    int numberItems = 0;
    for (int i = 0; i < size-1; i++) {
      if (data[i] != null) numberItems++;
    }
    return numberItems;
  }

  public boolean add(String element) {
    for (int i = 0; i < size-1; i++) {
      if (data[i] == null) {
        data[i] = element;
        return true;
      }
      if ((data[i] != null) && (i == size-2)) {
        resize();
      }
    }
    return false;
  }

  public String get(int index) {
    String elementHere = "" + data[index];
    return elementHere;
  }

  public String set(int index, String element) {
    String oldValue = data[index];
    data[index] = element;
    return oldValue;
  }


}
