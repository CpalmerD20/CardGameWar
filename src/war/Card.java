package war;

public class Card {
  private Value value;
  private Name name;
  private int pow;

  public Card(Name name, Value value, int pow) {
    this.value = value;
    this.name = name;
    this.pow = pow;
  }

  enum Name {
    Diamonds, Clubs, Hearts, Spades;

    public static Name getNames(int i) {
      Name[] name = Name.values();
      return name[i];
    }

    public static int getNameLength() {
      return Name.values().length;
    }
  }

  enum Value {
    Two(0), Three(1), Four(2), Five(3), Six(4), Seven(5), 
    Eight(6), Nine(7), Ten(8), Jack(9), Queen(10), King(11), Ace(12);

    Value(int pow) {}

    public static Value getValue(int a) {
      Value[] values = Value.values();
      return values[a];
    }

    public static int getValueLength() {
      return Value.values().length;
    }
  }

  public Value getValue() {
    return value;
  }

  public Name getName() {
    return name;
  }

  public int getPow() {
    return pow;
  }

  @Override
  public String toString() {
    String abc = (value + " of " + name);
    return abc;
  }
}
