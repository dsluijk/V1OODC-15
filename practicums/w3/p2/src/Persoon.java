package w3.p2;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Handles a person.
 */
public class Persoon {
  /** Name of the person. */
  private String name;
  /** Budget of the person. */
  private double budget;
  /** List of games owned. */
  private List<Game> games = new ArrayList<Game>();

  /**
   * Constructor.
   * @param name The name of the person.
   * @param budget Budget of the person.
   */
  public Persoon(String name, double budget) {
    this.name = name;
    this.budget = budget;
  };

  /**
   * Buy a new game, if possible.
   * @return Indication if the transaction succeeded.
   */
  public boolean koop(Game game) {
    for(int i = 0; i < this.games.size(); i++) {
      Game listedGame = this.games.get(i);
      if(listedGame.getNaam() == game.getNaam()) {
        return false;
      };
    };
    if(this.budget < game.huidigeWaarde()) {
      return false;
    };
    this.budget -= game.huidigeWaarde();
    this.games.add(game);
    return true;
  };

  /**
   * Sell a game from this person.
   * @return Indication if the transaction succeeded.
   */
  public boolean verkoop(Game game, Persoon koper) {
    for(int i = 0; i < this.games.size(); i++) {
      Game listedGame = this.games.get(i);
      if(listedGame.getNaam() != game.getNaam()) {
        continue;
      };
      boolean hasBought = koper.koop(game);
      if(!hasBought) {
        return false;
      };
      this.budget += game.huidigeWaarde();
      this.games.remove(i);
      return true;
    };
    return false;
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
    String returnString = this.name + " heeft een budget van €"
      + this.round(this.budget) + " en bezit de volgende games:";
    for(int i = 0; i < this.games.size(); i++) {
      returnString += "\n\t" + this.games.get(i);
    };
    return returnString;
  };
};
