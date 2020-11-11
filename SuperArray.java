public class SuperArray {
  private String[] data;
  private int size;

  private void resize() {
    if (size == 0) {
      size += 1;
    } else {
    size = size * 2;
    }
    String[] largerArray = new String [size];
    for (int i = 0; i < data.length; i++) {
      largerArray[i] = data[i];
    }
    data = largerArray;
  }

  public SuperArray() {
    size = 10;
    data = new String [size];
  }

  public int size() {
    int numberItems = 0;
    for (int i = 0; i < size; i++) {
      if (data[i] != null) numberItems++;
    }
    return numberItems;
  }

  public boolean add(String element) {
    if (size() == size) resize();
    for (int i = size(); i < size; i++) {
      if (data[i] == null) {
        set(i, element);
        return true;
      } else {
        System.out.println("Error! Something is wrong with your code...");
        return false;
      }
    }
    return false;
  }

  public String set(int index, String element) {
    String oldValue = data[index];
    data[index] = element;
    return oldValue;
  }

  public String get(int index) {
    return "" + data[index];
  }

/////////////////// Part 2 of SuperArray ///////////////////

  public void clear() {
    for (int i = 0; i < size; i++) {
      set(i, null);
    }
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public String toString() {
    String arrToString = "[";
    for (int i = 0; i < size - 1; i++) {
      if (i < size() -1) {
        arrToString += data[i] + ", ";
      }
      else if ((i == size() - 1)) {
        arrToString += data[i];
      } else {
      }
    }
    arrToString += "]";
    return arrToString;
  }

  public boolean contains(String s) {
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(s)) return true;
    }
    return false;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("\n ! Illegal Argument, your value is " + initialCapacity + " and we expected a value of at least 0. !");
    }
    size = initialCapacity;
    data = new String [size];
  }

  public void add(int index, String element) {
    if (size() == size) resize();
    String firstTemp = "" + data[index];
    String secondTemp = "";
    for (int i = index; i < size - 1; i++) {
      if (i == index) {
        set(i, element);
      } else {
        secondTemp = firstTemp;
        firstTemp = "" + data[i];
        set(i, secondTemp);
      }
    }
  }

  public String remove(int index) {
    String removedString = "" + data[index];
    String tempString = "";
    for (int i = index; i < size() - 1; i++) {
      tempString = "" + data[i+1];
      set(i, tempString);
    }
    set(size()-1, null);
    return removedString;
  }

  public int indexOf(String s) {
    int firstIndex = -1;
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(s)) {
        firstIndex = i;
        return firstIndex;
      }
    }
    return firstIndex;
  }

  public String[] toArray() {
    String[] safeArray = new String [size()];
    for (int i = 0; i < size(); i++) {
      safeArray[i] = data[i];
    }
    return safeArray;
  }

/////////////////// Part 3 of SuperArray ///////////////////

  public int lastIndexOf(String value) {
    int firstIndex = -1;
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(value)) {
        firstIndex = i;
      }
    }
    return firstIndex;
  }

  public boolean equals(SuperArray other) {
    if (other.size() != size()) {
      return false;
    }
    for (int i = 0; i < size(); i++) {
      if (!(data[i].equals(other.toArray()[i]))) {
        return false;
      }
    }
    return true;
  }
}
