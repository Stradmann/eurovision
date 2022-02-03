
package handy;

import mainPackage.Country;

public class ArrayManager {
    /**
     * Funcio per inicialitzar un vector tots a zero, no retorna res
     * @param nArray vector per inicialitzar
     */
    public static void initializeToZero(int[] nArray){
        for(int i = 0; i < nArray.length; i++){
            nArray[i] = 0;
        }
    }
    /**
     * Funcio per treure un element d'una posicio determinada del vector tipus int
     * @param nArray vector
     * @param iToRemove posicio per esborrar
     * @return retorna el vector amb l'element esborrat
     */
    //REMOVE ONE
    public static int[] removeOne(int[] nArray, int iToRemove){
        
        int[] result = new int[nArray.length - 1];
        
        int j = 0;
        for(int i = 0; i < nArray.length; i++){
            if( i != iToRemove){
                result[j] = nArray[i];
                j++;
            }
        }
        
        return result;
    }
    /**
     * Funcio per treure un element d'una posicio determinada del vector de la classe Country
     * @param cArray vector de la classe Country
     * @param iToRemove posicio per esborrar
     * @return retorna el vector amb l'element esborrat
     */
    public static Country[] removeOne(Country[] cArray, int iToRemove){
        
        Country[] result = new Country[cArray.length - 1];
        
        int j = 0;
        for(int i = 0; i < cArray.length; i++){
            if( i != iToRemove){
                result[j] = cArray[i];
                j++;
            }
        }
        
        return result;
    }
    /**
     * Funcio que treure un element d'una posicio determinada del vector tipus char
     * @param charArray  vector de tipus char
     * @param iToRemove posicio per esborrar
     * @return retorna el vector amb l'element esborrat
     */
    public static char[] removeOne(char[] charArray, int iToRemove){
        
        char[] result = new char[charArray.length - 1];
        
        int j = 0;
        for(int i = 0; i < charArray.length; i++){
            if( i != iToRemove){
                result[j] = charArray[i];
                j++;
            }
        }
        
        return result;
    }
    /**
     * Funcio per cambiar les posicions d'elements del vector tipus int al revés
     * @param array vector 
     */
    //REVERSE
    public static void reverseArray(int[] array){
        int aux;
        int j = array.length - 1;
        
        for (int i = 0; i < array.length; i++){
            if(i < j){
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
            j--;
        }
    }
    /**
     * Funcio per cambiar les posicions d'elements del vector de la classe Country al revés
     * @param array vector de la classe Country
     */
    public static void reverseArray(Country[] array){
        Country aux;
        int j = array.length - 1;
        
        for (int i = 0; i < array.length; i++){
            if(i < j){
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
            j--;
        }
    }
}