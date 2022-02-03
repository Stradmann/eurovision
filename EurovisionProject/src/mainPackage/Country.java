
package mainPackage;

import handy.ArrayManager;
import java.util.Random;

/**
 * La Classe <b>Country</b> es un objecte amb els atributs <b>name</b> i <b>totalPoints</b>.
 * Tambe conté una serie de funcions pròpies per posar el nom, per votar i per convertirlo en un String.
 */
public class Country {
    
    String name;
    int totalPoints;
    
    /**
     * Aquesta funcio demana el nom del <b>Country</b> i l'assigna a l'atrivut <b>name</b> del <b>Country</b> en questio
     * @param request el misatge amb el que es demanara el nom del <b>Country</b>
     */
    public void setName(String request){
        String inputName = handy.Validator.readString(request);
        name = handy.Validator.normalize(inputName);
    }
    /**
     * Aquesta funcio simula la votació de un pais. Es creeen unes paperetas que es van eliminant de l'array de <b>ballots</b>
     * a mida que surten per tal que no es repeteixi la elecció
     * @param selfIndex L'index del propi <b>Country</b>, que eliminat el primer de las <b>ballots</b> per tal que no es voti a si mateix.
     * @return un array de int que representen els indexs dels països seleccionats.
     */
    public int[] toVote(int selfIndex){
      
        //Creamos las papeletas
        Random r = new Random();
        int[] ballots = new int[Main.MAX_COUNTRIES];
        for(int i = 0; i < ballots.length; i++){
            ballots[i] = i;
        }
        //Quitamos la papeleta propia
        ArrayManager.removeOne(ballots, selfIndex);
        
        //Sacamos 10 papeletas
        int[] ballotsSelected = new int[PointsTable.pointsToAssign.length];
        for(int i = 0; i < PointsTable.pointsToAssign.length; i++){
            int choicedBallot = r.nextInt(ballots.length);
            ballotsSelected[i] = ballots[choicedBallot];
            ArrayManager.removeOne(ballots, choicedBallot);
        }
        
        return ballotsSelected;
    }
    
    /**
     * Aquesta funcio converteix en un String l'objecte <b>Country</b> per tal de poderlo imprimir formatat.
     * @return l'String que descriu l'objecte
     */
    @Override
    public String toString(){
        
        final int CELLNAMEWIDTH = 40;
        final int CELLPOINTSWIDTH = 10;
        String result = "";
        for (int i = 0; i < CELLNAMEWIDTH - name.length(); i++){
            result += " ";
        }
        result += name;
        String pointStr = String.valueOf(totalPoints);
        for(int i = 0; i < CELLPOINTSWIDTH - pointStr.length(); i++){
            result += " ";
        }
        result += pointStr;
        
        return result;
    }
}