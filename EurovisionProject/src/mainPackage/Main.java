package mainPackage;

public class Main {

    public static void main(String[] args) {
        //TODO
        //Definim un array de països, demanem un nom per a cada pais i inicialitzem a 0 el contador de punts totals.
        final int MAX_COUNRIES = 26;
        Country[] countries = new Country[MAX_COUNRIES];
        for(int i = 0; i < countries.length; i++){
            countries[i] = new Country();
            countries[i].setName("Introduel el nom del participant num " + (i + 1));
            countries[i].totalPoints = 0;
        }
        //fem la votacio.
        //contem els punts
        //trobem el best
        //trobem el looser
        //imprimim per pantalla els resultats
        
    }
}
