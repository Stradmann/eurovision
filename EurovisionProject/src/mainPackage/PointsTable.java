
package mainPackage;

public class PointsTable {
    
    static int[][] table = new int[Main.MAX_COUNTRIES][Main.MAX_COUNTRIES];
    static int[] pointsToAssign = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12};
    
    public static void initializePointsTable(){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                if(i == j){
                    table[i][j] = -1; //-1 per indicar que es el mateix pais
                }else{
                    table[i][j] = 0; //0 com a valor inicial dels vots
                }
            }
        }
    }
    
    public static void assignCountryPoints(int countryIndex, int[] votedCountries){
        for(int i = 0; i < votedCountries.length; i++){
            table[countryIndex][votedCountries[i]] = pointsToAssign[i];
        }
    }
    
    public static int sumContryPoints(int countryIndex){
        
        int sum = 0;
        
        for(int i = 0; i < table.length; i++){
            if(table[i][countryIndex] != -1){
                sum += table[i][countryIndex];
            }
        }
        
        return sum;
    }
    
    public static int findBest(){
        
        int maxTwelves = 0;
        int result;
        
        for(int j = 0; j < table[0].length; j++){
            int countTwelves = 0;
            for(int i = 0; i < table.length; i++){
                if(table[i][j] == 12){
                    countTwelves++;
                }
            }
            if(countTwelves > maxTwelves)
        }
    }
}
