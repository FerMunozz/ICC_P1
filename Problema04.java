/**
 * El programa imprime un poema inicial y otro modificado 
 * @author Fernanda Muñoz Arroyo y Ulises Abdiel cabello Cabrera
 * @version 1.0
 * @date 16 ago 2024.           
 */
public class Problema04{
    public static void main(String[] pps){
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GR = "\u001B[32m";
        final String YEL = "\u001B[33m";
        final String BL = "\u001B[34m";
        final String PUR = "\u001B[35m";
        final String CI = "\u001B[36m";

// Construcción del poema inical 
        String l1=RED + "Bailan las espigas\n" + RESET;
        String l2=BL + "con las mariposas\n" + RESET;
        String l3= "y los colibres\n";
        String l4=YEL + "con algunas osas.\n" + RESET;
        String l5=RED + "Y se va la Brisa\n" + RESET;
        String l6=CI + "mientras anochece\n" + RESET;
        String l7=GR + "y " + "sale " + "la " + "luna\n" + RESET;
        String l8=PUR + "y los tallos crecen.\n" + RESET;
        String po=l1+l2+l3+l4+l5+l6+l7+l8;

// Modificaciones a la línea 3
        String l31=l3.replaceAll("o","#"); 
        String l32=l31.replaceAll("e",":)");
        String l33=l32.replaceAll("i","%");

// Modificaciones a la línea 5        
        String l55=l5.toLowerCase();

// Modificaciones a la línea 7
        String l71=YEL+"y "+RESET;
        String l72=RED+"sale "+RESET;
        String l73=CI+"la "+RESET;
        String l74=GR+"luna\n"+RESET;
        String l77= l71+l72+l73+l74;

// Construcción del poema con // Modificaciones a la línea 1, 3, 5, 7
        String poe=RED+l1.toUpperCase()+RESET+l2+l33+l4+l55+l6+l77.replaceAll(" ","")+l8;

//Impresión de poema inical y poema final            
        System.out.print(po+"\n");
        System.out.print(poe);


    }
}