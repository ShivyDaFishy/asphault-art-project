import java.util.Scanner;

public class UserStory {
/*
 * Instance Variables - stores the players info in here
 */
  private Player[] person;
/*
 * Parameterlized Constructor - initilizes the person array with the given file names
 */
  public UserStory(String playersFile, String trueShootingPsFile, String pointsPerGameFile){
    person = createPlayer(playersFile, trueShootingPsFile, pointsPerGameFile);
  }

/*
 * Method: Create Player - creates a player and obtaines the players' info from the files that we created.
 */
  
  public Player[] createPlayer(String playersFile, String trueShootingPsFile, String pointsPerGameFile) {
    String [] players = FileReader.toStringArray(playersFile);
    double [] trueShootingPs = FileReader.toDoubleArray(trueShootingPsFile);
    double [] pointsPerGame = FileReader.toDoubleArray(pointsPerGameFile);
    Player [] nbaPlayer = new Player [players.length];

    for (int i = 0; i < nbaPlayer.length; i++){
      nbaPlayer[i] = new Player(players[i], trueShootingPs[i], pointsPerGame[i]);
    
    }
    return nbaPlayer;
  }

/*
 * Method: Gets the best scorer - Checks to see whcih player has the highest shootingPS and points. this player is then stored and if
 *another player has more points, they will then be the best scorer.
 */ 
  
  public String calcBestOverallScorer(){
    double totalPoints = person[0].getShootingPs() + person[0].getPoints();
    int highestIndex = 0;
    
    for(int i = 0; i < person.length; i++){
      double currentOverall = person[i].getShootingPs() + person[i].getPoints();
      if (currentOverall > totalPoints) {
        totalPoints = currentOverall;
        highestIndex = i;
      }
      
    }
      return person[highestIndex].getName(); 
  }

  /*
 * To String method - returns the greatest overall scorer using the previous method.
 */
public String toString() {
  return "Greatest Overall Scorer is: " + calcBestOverallScorer(); 
} 
}
    
  
  






  
