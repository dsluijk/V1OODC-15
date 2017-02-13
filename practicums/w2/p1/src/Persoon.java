package w2.p1;

/**
 * Handles a person.
 */
public class Persoon {
  /** Name of the person. */
  private String name;
  /** Age of the person. */
  private int age;

  /**
   * Constructor.
   * @param name Name of the person.
   * @param age Age of the person.
   */
  public Persoon(String name, int age) {
    this.name = name;
    this.age = age;
  };

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    return this.name + "; leeftijd " + this.age + " jaar";
  };
};
