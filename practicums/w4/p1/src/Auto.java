package w4.p1;

import java.time.LocalDate;

/**
 * Handles the car objects.
 */
public class Auto extends Voertuig {
  /** Licence plate number of the car. */
  private String licencePlate;

  /**
   * Constructor.
   * @param type Type of the car.
   * @param price Price of the car when new.
   * @param year Build year of the car.
   * @param licencePlate The licenseplate of the car.
   */
  public Auto(String type, double price, int year, String licencePlate) {
    super(type, price, year);
    this.licencePlate = licencePlate;
  };

  /**
   * Calculates the current worth of the car.
   * @return The car's worth in euro.
   */
  public double huidigeWaarde() {
    double worth = this.nieuwprijs - this.nieuwprijs * ((LocalDate.now().getYear() - this.bouwjaar) * 0.3);
    return worth >= 0.0 ? worth : 0.0;
  };
};
