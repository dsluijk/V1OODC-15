package w2.p2;

/**
 * Handles a car.
 */
public class Auto {
  /** Type of the car. */
  private String type;
  /** Price of the rent per day. */
  private double price;

  /**
   * Constructor.
   * @param type Type of the car.
   * @param price Price of the car for rental, per day.
   */
  public Auto(String type, double price) {
    this.type = type;
    this.price = price;
  };

  /**
   * Set a new price per day.
   * @param price the new price.
   */
  public void setPrijsPerDag(double price) {
    this.price = price;
  };

  /**
   * Get the price per day.
   * @return The price.
   */
  public double getPrijsPerDag() {
    return this.price;
  };

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    return this.type + " met prijs per dag: " + this.price;
  };
};
