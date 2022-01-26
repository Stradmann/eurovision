
package mainPackage;

import handy.ArrayManager;
import java.util.Random;

public class Country {
    
    String name;
    int totalPoints;
    
    public void setName(String request, Country[] countries){
        String inputName = handy.Validator.readString(request);
        name = handy.Validator.normalize(inputName);
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
    
    @Override
    public String toString(){
        
        final int CELLNAMEWIDTH = 60;
        final int CELLPOINTSWIDTH = 10;
        String result = "";
        for (int i = 0; i < CELLNAMEWIDTH - name.length(); i++){
            result += " ";
        }
        result += name;
        String pointStr = String.valueOf(totalPoints);
        for(int i = 0; i < CELLPOINTSWIDTH - pointStr.length(); i++){
            result += " ";
        }
        result += pointStr;
        
        return result;
    }
}