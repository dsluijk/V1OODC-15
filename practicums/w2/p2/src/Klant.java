package w2.p2;

/**
 * Handles a customer.
 */
public class Klant {
  /** Name of the customer. */
  private String name;
  /** Amount of discount for this customer. */
  private double discountRate = 0.0;

  /**
   * Constructor.
   * @param name Name of the customer
   */
  public Klant(String name) {
    this.name = name;
  };

  /**
   * Set a new discount rate for the customer.
   * @param discountRate Amount of discount to apply.
   */
  public void setKorting(double discountRate) {
    this.discountRate = discountRate;
  };

  /**
   * Get the current discount rate for the customer.
   * @return The discount rate.
   */
  public double getKorting() {
    return this.discountRate;
  };

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    return this.name + " (korting: " + this.discountRate + "%)";
  };
};
