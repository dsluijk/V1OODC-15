package w4.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Handles the assets of a company.
 */
public class BedrijfsInventaris {
  /** Name of the companyName. */
  private String bedrijsnaam;
  /** Budget of the company. */
  private double budget;
  /** All assets of the company */
  private List<Goed> assets = new ArrayList<Goed>();

  /**
   * Constructor.
   * @param name Name of the company.
   * @param budget Total budget for assets.
   */
  public BedrijfsInventaris(String name, double budget) {
    this.bedrijsnaam = name;
    this.budget = budget;
  };

  /**
   * Buy a new asset.
   * @param item Asset to buy.
   */
  public void schafAan(Goed item) {
    if(this.assets.contains(item)) {
      return;
    }
    if(item.huidigeWaarde() < this.budget) {
      this.budget -= item.huidigeWaarde();
      assets.add(item);
    }
  };

  /**
   * Returns a human readable representation of the class.
   * @return Human readable string.
   */
  public String toString() {
    String outString = "HU met inventaris:\n";
    Iterator<Goed> iterator = this.assets.iterator();
		while (iterator.hasNext()) {
			outString += iterator.next().toString() + "\n";
		}
    return outString;
  };
};
