package w4.p1;

import java.time.LocalDate;

/**
 * Handles the bicycle objects.
 */
public class Fiets extends Voertuig {
  /** Number of the bicycle frame. */
  private int frameNumber;

  /**
   * Constructor.
   * @param type Type of the bicycle.
   * @param price Price of the bicycle when new.
   * @param year Build year of the bicycle.
   * @param frameNumber Number of the bicycle frame.
   */
  public Fiets(String type, double price, int year, int frameNumber) {
    super(type, price, year);
    this.frameNumber = frameNumber;
  };

  /**
   * Calculates the current worth of the bicycle.
   * @return The bicycle's worth in euro.
   */
  public double huidigeWaarde() {
    double worth = this.nieuwprijs - this.nieuwprijs * ((LocalDate.now().getYear() - this.bouwjaar) * 0.1);
    return worth >= 0.0 ? worth : 0.0;
  };
};
