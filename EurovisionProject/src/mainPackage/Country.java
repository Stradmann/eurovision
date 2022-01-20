
package mainPackage;

import handy.ArrayManager;
import java.util.Random;

public class Country {
    
    private String name;
    int totalPoints;
    
    public void setName(String request){
        name = handy.Validator.readString(request);
    }
    //comentari
    public int[] toVote(int selfIndex){
      
        //Creamos las papeletas
        Random r = new Random();
        int[] ballots = new int[Main.MAX_COUNTRIES];
        for(int i = 0; i < ballots.length; i++){
            ballots[i] = i;
        }
        //Quitamos la papeleta propia
        ArrayManager.removeOne(ballots, selfIndex);
        
        //Sacamos 10 papeletas
        int[] ballotsSelected = new int[PointsTable.pointsToAssign.length];
        for(int i = 0; i < PointsTable.pointsToAssign.length; i++){
            int choicedBallot = r.nextInt(ballots.length);
            ballotsSelected[i] = ballots[choicedBallot];
            ArrayManager.removeOne(ballots, choicedBallot);
        }
        
        return ballotsSelected;
    }
}