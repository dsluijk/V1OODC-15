package w2.p1;

/**
 * Handles a house.
 */
public class Huis {
  /** Adres of the house. */
  private String adres;
  /** Build year of the house. */
  private int buildYear;
  /** Owner of the house. */
  private Persoon huisbaas;

  /**
   * Constructor.
   * @param adres Adres of the house.
   * @param buildYear Year of the build of the house.
   */
  public Huis(String adres, int buildYear) {
    this.adres = adres;
    this.buildYear = buildYear;
  };

  /**
   * Set the owner of the house.
   * @param huisbaas New owner of the house.
   */
  public void setHuisbaas(Persoon huisbaas) {
    this.huisbaas = huisbaas;
  };

  /**
   * Get the owner of the house.
   * @return The owner of the house.
   */
  public Persoon getHuisbaas() {
    return this.huisbaas;
  };

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    return "Huis " + this.adres + " is gebouwd in " + this.buildYear + "\n"
      + "en heeft huisbaas " + this.huisbaas.toString();
  };
};
