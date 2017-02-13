package w1.p1;

/**
 * Handles the size of a swimming pool.
 */
public class Zwembad {
  /** Width of the pool. */
  private double width;
  /** Length of the pool. */
  private double length;
  /** Length of the pool. */
  private double depth;

  /**
   * Constructor without any parameters, defaults all to 0.0.
   */
  public Zwembad() {
    this.length = 0.0;
    this.width = 0.0;
    this.depth = 0.0;
  };

  /**
   * Constructor with parameters.
   * @param width Width of the swimming pool.
   * @param length Length of the swimming pool.
   * @param Depth Depth of the swimming pool.
   */
  public Zwembad(double width, double length, double depth) {
    this.width = width;
    this.length = length;
    this.depth = depth;
  };

  /**
   * Getter of the length.
   * @return The current length.
   */
  public double getLengte() {
    return this.length;
  };

  /**
   * Setter of the length.
   * @param width The new length.
   */
  public void setLengte(double length) {
    this.length = length;
  };

  /**
   * Getter of the depth.
   * @return The current depth.
   */
  public double getDiepte() {
    return this.depth;
  };

  /**
   * Setter of the depth.
   * @param width The new depth.
   */
  public void setDiepte(double depth) {
    this.depth = depth;
  };

  /**
   * Getter of the width.
   * @return The current width.
   */
  public double getBreedte() {
    return this.width;
  };

  /**
   * Setter of the width.
   * @param width The new width.
   */
  public void setBreedte(double width) {
    this.width = width;
  };

  /**
   * Calculates the volume of the swimming pool
   * @return The volume of the swimming pool.
   */
  public double inhoud() {
    return this.getLengte() * this.getBreedte() * this.getDiepte();
  };

  /**
   * Builds a formatted string.
   * @return A formatted string.
   */
  public String toString() {
    return "Dit zwembad is " + this.getBreedte() + " meter breed, "
      + this.getLengte() + " meter lang, en " + this.getDiepte()
      + " meter diep.";
  };
};
