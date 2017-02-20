package w4.p1;

/**
 * Abstract class, as a framework for vehicles.
 */
public abstract class Voertuig implements Goed {
  /** type of vehicle. */
  private String type;
  /** Price of the vehicle when new. */
  protected double nieuwprijs;
  /** Build year of the vehicle */
  protected int bouwjaar;

  /**
   * Constructor.
   * @param type Type of the vehicle.
   * @param price Price of the vehicle when new.
   * @param year Build year of the vehicle.
   */
  public Voertuig(String type, double price, int year) {
    this.type = type;
    this.nieuwprijs = price;
    this.bouwjaar = year;
  };

  /**
   * Tests if a object is equal to this object.
   * @param e Object to compare
   * @return True if equal, false if not.
   */
  public boolean equals(Object e) {
    if(e instanceof Voertuig != true) {
      return false;
    }
    if(((Voertuig) e).type != this.type) {
      return false;
    }
    return true;
  };

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    return "Voertuig: " + this.type + " met bouwjaar " + this.bouwjaar
      + " heeft een waarde van: " + this.huidigeWaarde();
  };
};
