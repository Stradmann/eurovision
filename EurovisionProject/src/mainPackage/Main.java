package mainPackage;

import mainPackage.Country;

public class Main {

    final static int MAX_COUNTRIES = 26;
    
    public static void main(String[] args) {
        //TODO
        //Creem la llista de participants
        Country[] countries = createCountries(MAX_COUNTRIES);
        PointsTable.initializePointsTable();
        
        //fem la votacio y assignem el punts.
        for(int i = 0; i < countries.length; i++){
            int[] votes = countries[i].toVote(i);
            PointsTable.assignCountryPoints(i, votes);
        }
        
        //contem els punts
        for(int i = 0; i < countries.length; i++){
            countries[i].totalPoints = PointsTable.sumContryPoints(i);
        }
        //trobem el best
        //trobem el looser
        //imprimim per pantalla els resultats
    }
    
    public static Country[] createCountries(int maxCountries){
        //Definim un array de països, demanem un nom per a cada pais i inicialitzem a 0 el contador de punts totals i l'array de punts rebuts.
        Country[] countries = new Country[maxCountries];
        for(int i = 0; i < countries.length; i++){
            countries[i] = new Country();
            countries[i].setName("Introduex el nom del participant num " + (i + 1));
            countries[i].totalPoints = 0;
            
        }
        
        return countries;
    }
}
