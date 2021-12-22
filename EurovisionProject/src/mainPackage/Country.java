
package mainPackage;

public class Country {
    
    private String name;
    int[] pDistribution = new int[25];
    int totalPoints;
    int[] pointToAssign = {1,2,3,4,5,6,7,8,10,12};
    
    public void sumTotalPoints(int[] points){
        totalPoints = 0;
        for(int i = 0; i < points.length; i++){
            totalPoints += points[i];
        }
    }
    
    public void setName(String request){
        name = handy.Validator.readString(request);
    }
}

