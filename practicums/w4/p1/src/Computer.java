package w4.p1;

import java.time.LocalDate;

/**
 * Handles the computer objects.
 */
public class Computer implements Goed {
  /** Model of the computer. */
  private String type;
  /** Mac adres of the computer. */
  private String macAdres;
  /** Original price of the computer. */
  private double price;
  /** Year of production of the computer. */
  private int productionYear;

  /**
   * Constructor.
   * @param type Type of the computer.
   * @param mac Mac adres of the computer.
   * @param price Original price of the computer.
   * @param productionYear Year of the production of the computer.
   */
  public Computer(String type, String mac, double price, int productionYear) {
    this.type = type;
    this.macAdres = mac;
    this.price = price;
    this.productionYear = productionYear;
  };

  /**
   * Calculates the current worth of the car.
   * @return The car's worth in euro.
   */
  public double huidigeWaarde() {
    double worth = this.price - this.price
     * ((LocalDate.now().getYear() - this.productionYear) * 0.4);
    return worth >= 0.0 ? worth : 0.0;
  };

  /**
   * Tests if a object is equal to this object.
   * @param e Object to compare
   * @return True if equal, false if not.
   */
  public boolean equals(Object e) {
    if(e instanceof Computer != true) {
      return false;
    }
    if(((Computer) e).macAdres != this.macAdres) {
      return false;
    }
    return true;
  };

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    return "Computer: " + this.type + " heeft een waarde van: " + this.huidigeWaarde();
  };
};
