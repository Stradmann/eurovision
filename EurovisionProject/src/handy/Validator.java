package handy;

import java.util.Scanner;

public class Validator {

    static Scanner scan = null;
    //Obre l'Scanner si no esta obert.
    private static Scanner openScan() {
        if(scan == null)
            scan = new Scanner(System.in);
        return scan;
    }

    //READINT
    public static int readInt(String request) {
        Scanner scan = openScan();
        int result = readInt(scan, request);
        return result;
    }

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

    public static int readInt() {
        int result = readInt(null);
        return result;
    }
    
    public static int readInt(String request, int minimum, int maximum){
        int result;
        do{
            result = readInt(request);
        }while(result < minimum || result > maximum);
        
        return result;
    }
    
    //READSTRING
    private static String readString(Scanner scan, String request){
        String result;
        if(request != null)
            System.out.println(request);
        result = scan.nextLine();
        return result;
    }
    
    public static String readString(String request){
        String result;
        openScan();
        result = readString(scan, request);
        return result;
    }
    
    public static String readString(){
        String result;
        result = readString(null);
        return result;
    }
    
    //NORMAILIZE
    public static String normalize(String input){
        input = input.toUpperCase();
        char[] inputArray = new char[input.length()];
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = input.charAt(i);
        }
        //Eliminar espacios del principio
        while(inputArray[0] == ' '){
            inputArray = handy.ArrayManager.removeOne(inputArray, 0);
        }
        //Eliminar espacios del final
        while(inputArray[inputArray.length - 1] == ' '){
            inputArray = handy.ArrayManager.removeOne(inputArray, inputArray.length -1);
        }
        
        String result = "";
        for(int i = 0; i < inputArray.length; i++){
            result += inputArray[i];
        }
        
        return result;
    }
    
    //FUNCIO READFLOAT
    public static float readFloat(String request) {
        Scanner scan = openScan();
        float result = readFloat(scan, request);
        return result;
    }

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

    public static float readFloat() {
        float result = readFloat(null);
        return result;
    }
    
    public static float readFloat(String request, int minimum, int maximum){
        float result;
        do{
            result = readFloat(request);
        }while(result < minimum || result > maximum);
        
        return result;
    }
}
