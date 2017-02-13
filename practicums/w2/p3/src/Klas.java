package w2.p3;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles a class.
 */
public class Klas {
  /** Name of the class. */
  private String className;
  /** List of students */
  private List<Leerling> students = new ArrayList<Leerling>();

  /**
   * Constructor, sets the class name.
   * @param className Name of the class.
   */
  public Klas(String className) {
    this.className = className;
  };

  /**
   * Add a new student to the class.
   * @param newStudent Student to add.
   */
  public void voegLeerlingToe(Leerling newStudent) {
    this.students.add(newStudent);
  };

  /**
   * Get all registered students.
   * @return All registered students in a List.
   */
  public List<Leerling> getLeerlingen() {
    return this.students;
  };

  /**
   * Get the amount of registered students.
   * @return The amount of students.
   */
  public int aantalLeerlingen() {
    return this.students.size();
  };

  /**
   * Change the mark of a student.
   * @param studentName Student to change the mark for.
   * @param newMark New mark of the student.
   */
  public void wijzigCijfer(String studentName, double newMark) {
    for(int i = 0; i < this.students.size(); i++) {
      Leerling student = this.students.get(i);
      if(student.getNaam() == studentName) {
        student.setCijfer(newMark);
      };
    };
  };

  /**
   * Returns the student in a human readable format.
   * @return The student in human readable format.
   */
  public String toString() {
    String humanString =  "In Klas " + this.className
      + " zitten de volgende leerlingen:\n";
    for(int i = 0; i < this.students.size(); i++) {
      Leerling student = this.students.get(i);
      humanString = humanString + student.getNaam() + " heeft cijfer: "
        + student.getCijfer() + "\n";
    };
    return humanString;
  };
};
