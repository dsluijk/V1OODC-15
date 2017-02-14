package w3.p3;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Handles a game.
 */
public class Game {
  /** Title of the game. */
  private String title;
  /** Year of release. */
  private int releaseYear;
  /** Price of the game. */
  private double originalPrice;

  /**
   * Constructor.
   * @param title Title of the game.
   * @param releaseYear Year of release.
   * @param originalPrice Original price of the game.
   */
  public Game(String title, int releaseYear, double originalPrice) {
    this.title = title;
    this.releaseYear = releaseYear;
    this.originalPrice = originalPrice;
  };

  /**
   * Get the title of the game.
   * @return The title of the game.
   */
  public String getNaam() {
    return this.title;
  };

  /**
   * Get the current, discounted, price of the game.
   * @return The price of the game.
   */
  public double huidigeWaarde() {
    double discountIndex = Math.pow(0.7, (LocalDate.now().getYear() - this.releaseYear));
    return this.round(this.originalPrice * discountIndex);
  };

  /**
   * Round a double with double point precission, because Java can't be default.
   * Credits for the idea:
   * https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
   * @param value Value to round.
   * @return The double rounded with double point precission.
   */
  private double round(double value) {
    BigDecimal bd = new BigDecimal(value);
    bd = bd.setScale(2, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    return this.title + ", uitgegeven in " + this.releaseYear + "; nieuwprijs: €"
      + this.originalPrice + " nu voor: €" + this.round(this.huidigeWaarde());
  };
};
