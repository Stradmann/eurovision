
package mainPackage;

import java.util.Random;

public class Country {
    
    private String name;
    int[] pDistribution = new int[25];
    int totalPoints;
    int[] pointsToAssign = {1,2,3,4,5,6,7,8,10,12};
    
    public void sumTotalPoints(int[] points){
        totalPoints = 0;
        for(int i = 0; i < points.length; i++){
            totalPoints += points[i];
        }
    }
    
    public void setName(String request){
        name = handy.Validator.readString(request);
    }
    //comentari
    public void toVote(Country[] countries, int selfIndex){
        
        Random r = new Random();
        Country[] ballots = new Country[countries.length - 1];
        
        ballots = handy.ArrayManager.removeOne(countries, selfIndex);
        
        for(int i = 0; i < pointsToAssign.length; i++){
            int ballot = r.nextInt(ballots.length);
            boolean pointsAssigned = false;
            for(int j = 0; j < ballots[ballot].pDistribution.length && !pointsAssigned; j++){
                if(ballots[ballot].pDistribution[j] == 0){
                    ballots[ballot].pDistribution[j] = pointsToAssign[i];
                    pointsAssigned = true;
                }
            }
        }
    }
}