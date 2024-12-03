public class Player{

/*
 * Instance variables - holds the players info
 */
  
  private String name;
  private double trueShootingPs;
  private double pointsPerGame;

/*
 * Constructor - intializes these variables with default values
 */
  
  public Player(){
    String name = "null";
    double trueShootingPs = 0.0;
    double pointsPerGame = 0.0;
  }


/*
 * Parameterlized Constructor - initilizes the player with the given info
 */
  
  public Player(String name, double trueShootingPs, double pointsPerGame){
    this.name = name;
    this.trueShootingPs = trueShootingPs;
    this.pointsPerGame = pointsPerGame;
  }


/*
 * Getter methods - Return the information about the designated instance variable 
 */
  
  public String getName() {
    return name;
  }

  public double getShootingPs() {
    return trueShootingPs;
  }

    public double getPoints() {
    return pointsPerGame;
  }

  /*
 * To String Method - Returns the designated instance variable information as a string.
 */

  public String toString() {
    return "Player: " + name + "\nTrue Shooting PS: " + trueShootingPs + "\nPoints Per Game: " + pointsPerGame;
  }
}