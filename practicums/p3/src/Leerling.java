package p3;

/**
 * Handles a student.
 */
public class Leerling {
  /** Name of the student. */
  private String name;
  /** Mark of the student. */
  private double mark = 0.0;

  /**
   * Constructor, sets the name of the student.
   */
  public Leerling(String name) {
    this.name = name;
  };

  /**
   * Get the name of the student.
   * @return The name of the student.
   */
  public String getNaam() {
    return this.name;
  };

  /**
   * Get the mark of the student.
   * @return The mark of the student. A 0.0 indicates no mark.
   */
  public double getCijfer() {
    return this.mark;
  };

  /**
   * Change the mark of the student.
   * @param newMark the new mark of the student.
   */
  public void setCijfer(double newMark) {
    this.mark = newMark;
  };
};
