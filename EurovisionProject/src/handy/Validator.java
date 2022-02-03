package handy;

import java.util.Scanner;

public class Validator {

    static Scanner scan = null;
    //Obre l'Scanner si no esta obert.

    /**
     * Funcio per obrir un scanner
     *
     * @return retorna un scan
     */
    //Obre l'Scanner si no esta obert.
    private static Scanner openScan() {
        if (scan == null) {
            scan = new Scanner(System.in);
        }
        return scan;
    }

    /**
     * Funcio per llegir una variable tipus int amb una missatge request
     *
     * @param request variable tipus string per demanar dades
     * @return retorna el resultat comprovat
     */
    //READINT
    public static int readInt(String request) {
        Scanner scan = openScan();
        int result = readInt(scan, request);
        return result;
    }

    /**
     * Funcio que passa com a parametres un scanner i un missatge per comprovar,
     * llegir variable tipus int dades
     *
     * @param scan scanner
     * @param request variable tipus string, missatge per demanar dades
     * @return retorna la dada comprovada
     */
    private static int readInt(Scanner scan, String request) {

        int result = 0;
        boolean isInt;

        do {
            if (request != null) {
                System.out.println(request);
            }
            if (scan.hasNextInt()) {
                result = scan.nextInt();
                scan.nextLine();
                isInt = true;
            } else {
                scan.nextLine();
                isInt = false;
            }
        } while (!isInt);

        return result;
    }

    /**
     * Funcio per llegir una variable tipus int
     *
     * @return retorna resultat comprovat
     */
    public static int readInt() {
        int result = readInt(null);
        return result;
    }

    /**
     * Funcio que llegeix la variable introduida i comprovar si esta dins d'un
     * rang de valors determinats
     *
     * @param request missatge per demanar el valor
     * @param minimum valor minim
     * @param maximum valor maxim
     * @return retorna el valor comprovat
     */
    public static int readInt(String request, int minimum, int maximum) {
        int result;
        do {
            result = readInt(request);
        } while (result < minimum || result > maximum);

        return result;
    }

    /**
     * Funcio per comprovar tipus d'entrada
     *
     * @param scan scanner
     * @param request missatge string per demanar dades
     * @return retorna cadena comprovada
     */
    //READSTRING
    private static String readString(Scanner scan, String request) {
        String result;
        if (request != null) {
            System.out.println(request);
        }
        result = scan.nextLine();
        return result;
    }

    /**
     *
     * @param request missatge string per demanar dades
     * @return
     */
    public static String readString(String request) {
        String result;
        openScan();
        result = readString(scan, request);
        return result;
    }

    /**
     *
     * @return
     */
    public static String readString() {
        String result;
        result = readString(null);
        return result;
    }

    /**
     * Funcio tipus string per per eliminar espais
     *
     * @param input
     * @return retornar cadena comprovada
     */
    //NORMAILIZE
    public static String normalize(String input) {
        input = input.toUpperCase();
        char[] inputArray = input.toCharArray();
        //Eliminar espacios del principio
        while (inputArray[0] == ' ') {
            inputArray = handy.ArrayManager.removeOne(inputArray, 0);
        }
        //Eliminar espacios del final
        while (inputArray[inputArray.length - 1] == ' ') {
            inputArray = handy.ArrayManager.removeOne(inputArray, inputArray.length - 1);
        }

        String result = "";
        for (int i = 0; i < inputArray.length; i++) {
            result += inputArray[i];
        }

        return result;
    }

    /**
     * Funcio per comprovar tipus d'entrada float
     *
     * @param request
     * @return retorna float comprovat
     */
    //FUNCIO READFLOAT
    public static float readFloat(String request) {
        Scanner scan = openScan();
        float result = readFloat(scan, request);
        return result;
    }

    /**
     * Funcio per comprovar tipus d'entrada float amb parametres scan i missatge
     * request
     *
     * @param scan
     * @param request
     * @return retorna float comprovat
     */
    private static float readFloat(Scanner scan, String request) {

        float result = 0f;
        boolean isFloat;

        do {
            if (request != null) {
                System.out.println(request);
            }
            if (scan.hasNextFloat()) {
                result = scan.nextFloat();
                scan.nextLine();
                isFloat = true;
            } else {
                scan.nextLine();
                isFloat = false;
            }
        } while (!isFloat);

        return result;
    }

    /**
     *
     * @return
     */
    public static float readFloat() {
        float result = readFloat(null);
        return result;
    }

    /**
     * Funcio per comprovar tipus d'entrada float si està en una rang de valors
     *
     * @param request missatge per demanar valor
     * @param minimum valor minim
     * @param maximum valor maxim
     * @return
     */
    public static float readFloat(String request, int minimum, int maximum) {
        float result;
        do {
            result = readFloat(request);
        } while (result < minimum || result > maximum);

        return result;
    }
}
