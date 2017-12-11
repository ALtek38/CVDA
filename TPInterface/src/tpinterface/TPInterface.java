package tpinterface;

import java.util.Scanner;

/**
 * @author p1618672
 */
public class TPInterface 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String type = null;
        HerosFeu hero1= null;
        HerosMer hero2= null;
        HerosTerre hero3= null;
        
        System.out.println("Entrez le type de votre héro (Feu, Mer, Terre)");
        do 
        {
            Scanner lecture = new Scanner(System.in);
            type = lecture.next();
            switch (type)
            {
                case "Feu":
                    hero1=new HerosFeu(180,115);
                    break;

                case "Mer":
                    hero2=new HerosMer(4,50);
                    break;

                case "Terre":
                    hero3=new HerosTerre(82,50);
                    break;

                case "Stop":
                    break;

                default:
                    System.out.println("Erreur de saisie");
            }
        } while (!"Stop".equals(type));
        
        hero1.combat(hero2);
    }
    
}
