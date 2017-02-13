package w2.p2;

/**
 * Handles a rental of a car.
 */
public class AutoHuur {
  /** Amount of days the rental is for. */
  private int rentalLength = 0;
  /** The tenant of the car. */
  private Klant tenant;
  /** The rented car. */
  private Auto car;

  /** Constructor. */
  public AutoHuur() { };

  /**
   * Set the length of the rental.
   * @param rentalLength Length of the rental.
   */
  public void setAantalDagen(int rentalLength) {
    this.rentalLength = rentalLength;
  };

  /**
   * Set the rented car.
   * @param car Rented car.
   */
  public void setGehuurdeAuto(Auto car) {
    this.car = car;
  };

  /**
   * Get the rented car.
   * @return the rented car.
   */
  public Auto getGehuurdeAuto() {
    return this.car;
  };

  /**
   * Set the tenant of the car.
   * @param tenant The tenant.
   */
  public void setHuurder(Klant tenant) {
    this.tenant = tenant;
  };

  /**
   * Get the tenant.
   * @return the tenant.
   */
  public Klant getHuurder() {
    return this.tenant;
  };

  /**
   * Calculate the total price of the rental.
   * Returns 0.0 if a required value was missing.
   * @return The total price.
   */
  public double totaalPrijs() {
    if(this.rentalLength == 0 || this.tenant == null || this.car == null) {
      return 0.0;
    };
    return this.rentalLength * this.car.getPrijsPerDag() * ((100.0 - this.tenant.getKorting()) / 100);
  };

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    String returnText;
    if (this.car == null) {
      returnText = "er is geen auto bekent\n";
    } else {
      returnText = "autoType: " + this.car.toString() + "\n";
    }

    if (this.tenant == null) {
      returnText = returnText + "er is geen huurder bekent\n";
    } else {
      returnText = returnText + "op naam van: " + this.tenant.toString() + "\n";
    }

    returnText = returnText + "aantal dagen: " + this.rentalLength
      + " en dat kost " + this.totaalPrijs();
    return returnText;
  };
};
