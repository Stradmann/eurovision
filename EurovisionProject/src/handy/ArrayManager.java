
package handy;

import mainPackage.Country;

public class ArrayManager {
    
    public static void initializeToZero(int[] nArray){
        for(int i = 0; i < nArray.length; i++){
            nArray[i] = 0;
        }
    }
    
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