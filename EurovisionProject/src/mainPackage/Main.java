package mainPackage;

import java.util.ArrayList;
import java.util.Collections;
import mainPackage.Country;

/**
 * Classe Main del programa. Aqui es criden les funcions principals.
*/
public class Main {

    final static int MAX_COUNTRIES = 26;
    final static int MAX_POINT = 12;
    final static int MIN_POINT = 0;
    
    /**
     * Aqui es criden les funcions que fan la tasca que demana el programa
     * @param args Arguments per a l'execucio. Aqui no s'usa.
     */
    public static void main(String[] args) {
        //TODO
        //Creem la llista de participants
        Country[] countries = createCountries(MAX_COUNTRIES);
        PointsTable.initializePointsTable();

        //fem la votacio y assignem el punts.
        for (int i = 0; i < countries.length; i++) {
            int[] votes = countries[i].toVote(i);
            PointsTable.assignCountryPoints(i, votes);
        }

        //contem els punts
        for (int i = 0; i < countries.length; i++) {
            countries[i].totalPoints = PointsTable.sumContryPoints(i);
        }
        //trobem el best
        int[] bestCountryIndex = PointsTable.countPointType(MAX_POINT);
        Country[] theBests = new Country[bestCountryIndex.length];
        for (int i = 0; i < theBests.length; i++) {
            theBests[i] = countries[bestCountryIndex[i]];
        }
        //trobem el looser
        int[] looserCountryIndex = PointsTable.countPointType(MIN_POINT);
        Country[] theLoosers = new Country[looserCountryIndex.length];
        for (int i = 0; i < theLoosers.length; i++) {
            theLoosers[i] = countries[looserCountryIndex[i]];
        }
        //ordenem els resultats       
        countryQuicksort(countries, 0, countries.length -1);
        handy.ArrayManager.reverseArray(countries);
        //imprimim per pantalla els resultats
        for (int i = 0; i < countries.length / 2; i++) {
            System.out.print(countries[i].toString() + countries[i + (countries.length / 2)].toString() + "\n");
        }
        printCountryList("THE LOOSERS", theLoosers);
        printCountryList("THE BEST", theBests);
    }
    
    /**
     * Imprimeix per panatalla objectes Country en forma de llista
     * @param msg Nom de la llista
     * @param countryList Array de Country que es vol imprimir
     */
    public static void printCountryList(String msg, Country[] countryList) {
        System.out.println("\n" + msg + "\n");
        for(int i = 0; i < countryList.length; i++){
            System.out.println(countryList[i].toString());
        }
    }
    
    /**
     * Aquesta funcio demana al usuari el nom de cada un dels 26 paisos(MAX_COUNTRIES),
     * i crea un array de <b>Country</b> inicialitzant el <b>name</b> i el <b>totalPoints</b>. 
     * @param maxCountries es el nombre máxim de Country's que tindrá el array. Prové d'una constant. En aquest cas 26.
     * @return reotna un array de Country inicialitzat de <b>maxCountries</b> posicions
     */
    public static Country[] createCountries(int maxCountries) {
        //Definim un array de països, demanem un nom per a cada pais i inicialitzem a 0 el contador de punts totals i l'array de punts rebuts.
        Country[] countries = new Country[maxCountries];
        for (int i = 0; i < countries.length; i++) {
            countries[i] = new Country();

            boolean sameCountry = false;
            do {
                countries[i].setName("Introduex el nom del participant num " + (i + 1));
                for (int j = 0; j < countries.length && !sameCountry; j++) {
                    if (i != j && countries[j] != null) {
                        if (countries[i].name.equals(countries[j].name)) {
                            sameCountry = true;
                        }
                    }
                }
            } while (sameCountry);

            countries[i].totalPoints = 0;

        }

        return countries;
    }
    
    /**
     * Aplica el métode Quicksort a un array de <b>Country</b> ordenat per l'atribut <b>totalPoints</b>
     * @param A array que ha de ser ordenat
     * @param izq posicio mes a l'esquerra de l'array.
     * @param der posicio mes a la dreta de l'array.
     */
    public static void countryQuicksort(Country[] A, int izq, int der) {

        Country pivote = A[izq]; // primer numero de la cadena
        int i = izq;         // i scan dreta a esquerra
        int j = der;         // j scan dreta a esquerra
        Country aux;

        while (i < j) {                          // mentres no es creuen les búsquedes                                   
            while (A[i].totalPoints <= pivote.totalPoints && i < j) {
                i++; // busca l'element major que pivote
            }
            while (A[j].totalPoints > pivote.totalPoints) {
                j--;           // busca l'element menor que pivote
            }
            if (i < j) {                        // si no s'han creuat                      
                aux = A[i];                      // els intercanvia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];
        A[j] = pivote;

        if (izq < j - 1) {
            countryQuicksort(A, izq, j - 1);
        }
        if (j + 1 < der) {
            countryQuicksort(A, j + 1, der);
        }
    }

}
