package mainPackage;

/**
 * La Classe PointsTable guarda una taula amb les puntuacions que han repartit els països
 * i un array amb els punts que poden distribuïr els països. A mes de funcios per inicialitzar la taula,
 * assignar els punts, sumar els punts de cada país, i trobar els que mes d'un determinat numero de punts, ha obtingut
 */
public class PointsTable {

    static int[][] table = new int[Main.MAX_COUNTRIES][Main.MAX_COUNTRIES];
    static int[] pointsToAssign = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12};

    /**
     * Inicialitza la taula de punts a 0, excepte en les posicions en que coincideixen el mateix país,
     * on posa un -1 per indicar-ho.
     */
    public static void initializePointsTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                    table[i][j] = -1; //-1 per indicar que es el mateix pais
                } else {
                    table[i][j] = 0; //0 com a valor inicial dels vots
                }
            }
        }
    }

    /**
     * Assigna els punts del array de punts per assignar a els diferents paisos
     * @param countryIndex l'index del propi país, coordenada per saber en quina fila s'han de colocar els punts.
     * @param votedCountries array de indexs dels paisos votats.
     */
    public static void assignCountryPoints(int countryIndex, int[] votedCountries) {
        for (int i = 0; i < votedCountries.length; i++) {
            table[countryIndex][votedCountries[i]] = pointsToAssign[i];
        }
    }

    /**
     * suma el total de punts que ha obtingut un país, es a dir la columna, excepte el -1.
     * @param countryIndex l'index del propi país que identifica la columna que s'ha de sumar.
     * @return el valor de punts total de un país en concret.
     */
    public static int sumContryPoints(int countryIndex) {

        int sum = 0;

        for (int i = 0; i < table.length; i++) {
            if (table[i][countryIndex] != -1) {
                sum += table[i][countryIndex];
            }
        }

        return sum;
    }

    /**
     * Busca els paisos que han tret la máxima quantitat d'una determinada puntuació
     * @param x puntuació concreta de la qual ha de buscar la máxima quantitat.
     * @return array dels index de països que han tret aquest máxim.
     * @see maxCount
     */
    public static int[] countPointType(int x) {
        //Busco el maxim
        int max = maxCount(x);
        //conto quant hi han que tinguin el maxim
        int listLength = 0;
        for (int j = 0; j < table[0].length; j++) {
            int count = 0;
            for (int i = 0; i < table.length; i++) {
                if (table[i][j] == x) {
                    count++;
                }
            }
            if (count == max) {
                listLength++;
            }
        }
        //creo l'array
        int[] result = new int[listLength];
        //afageixo els indexs del que compleixen la condicio al array
        int a = 0;
        for (int j = 0; j < table[0].length; j++) {
            int count = 0;
            for (int i = 0; i < table.length; i++) {
                if (table[i][j] == x) {
                    count++;
                }
            }
            if (count == max) {
                result[a] = j;
                a++;
            }
        }
        return result;
    }

    /**
     * troba el máxim numero de <b>x</b> en la taula de punts
     * @param x el numero que s'esta buscant
     * @return la quantitat máxima de <b>x</b> que te una columna.
     */
    public static int maxCount(int x) {

        int max = 0;
        for (int j = 0; j < table[0].length; j++) {
            int count = 0;
            for (int i = 0; i < table.length; i++) {
                if (table[i][j] == x) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}
