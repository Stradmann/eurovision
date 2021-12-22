package mainPackage;

import mainPackage.Country;

public class Main {

    public static void main(String[] args) {
        //TODO
        //Creem la llista de participants
        final int MAX_COUNTRIES = 26;
        Country[] countries = createCountries(MAX_COUNTRIES);
        
        //fem la votacio.
        for(int i = 0; i < countries.length; i++){
            countries[i].toVote(countries, i);
        }
        
        //contem els punts
        for(int i = 0; i < countries.length; i++){
            countries[i].sumTotalPoints(countries[i].pDistribution);
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
            handy.ArrayManager.initializeToZero(countries[i].pDistribution);
        }
        
        return countries;
    }
}
