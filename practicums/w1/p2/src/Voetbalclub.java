package w1.p2;

/**
 * Handle track keeping of football club scores.
 */
public class Voetbalclub {
  /** Name of the football club. */
  private String clubName;
  /** Amount of wins. */
  private int wins = 0;
  /** Amount of ties. */
  private int ties = 0;
  /** Amount of loses. */
  private int loses = 0;

  /**
   * Constructor, sets the club name.
   * @param clubName Name of the club.
   */
  public Voetbalclub(String clubName) {
    this.clubName = clubName;
  };

  /**
   * Processes a new game.
   * @param score The score of the game.
   *  Can be 'w' for wins, 'g' for ties or 'l' for loses.
   *  Anything else will throw an error.
   */
  public void verwerkResultaat(char score) {
    switch(score) {
      case 'w': {
        this.wins++;
        break;
      }
      case 'g': {
        this.ties++;
        break;
      }
      case 'l': {
        this.loses++;
        break;
      }
      default: {
        throw new Error("Invalid score!");
      }
    };
  };

  /**
   * Returns a formatted row for display.
   * @return A formatted string.
   */
  public String toString() {
    int score = (this.wins * 3) + this.ties;
    int games = this.wins + this.ties + this.loses;
    return this.clubName + "\t" + games + "\t\t" + this.wins + "\t"
      + this.ties + "\t" + this.loses + "\t\t" + score;
  };
};
