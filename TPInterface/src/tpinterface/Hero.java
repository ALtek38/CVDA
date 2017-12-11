package tpinterface;

import java.util.Scanner;

/**
 * @author p1618672
 */
public abstract class Hero  implements StructHeros
{
    protected String nom;
    protected double pdv=100;

    /**
     * Constructeur
     * @param nom nom
     * @param pdv  point de vie
     */
    public Hero(String nom, double pdv) 
    {
        System.out.println("Entrer le nom de votre Héro");
        Scanner nomh = new Scanner(System.in);
        this.nom = nomh.toString();

        this.pdv = pdv;
    }
    
    /**
     * Constructeur
     */
     public Hero() 
    {
        System.out.println("Entrer le nom de votre Héro:");
        Scanner lecture = new Scanner(System.in);
        String nomh = lecture.next();
        this.nom = nomh.toString();
        this.pdv = pdv;
    }

     /**
      * Accesseur Nom
      * @return nom du hero
      */
    public String getNom() 
    {
        return nom;
    }
    
    /**
     * Methode pour faire perdre des points de vie
     * @param nbPointsPerdus nombre de points de vie perdus
     */
    public void perdPoint(double nbPointsPerdus)
    {
        pdv-=nbPointsPerdus;
    }
     
    /**
     * Affiche l'etat du héros
     */
    public void etat()
    {
        if (this.pdv>0)
        {
            System.out.println(this.nom+" a "+this.pdv+" points de vie");
        }
        else {
            System.out.println(this.nom+" est mort");
        }
    }
    
    public void afficheVie()
    {
        String[][] vie = new String[4][100] ;
        System.out.println("Vie:");
        for (int j=0; j<4;j++){
            System.out.println("");
            System.out.print("[");
            for (int i=0; i<this.pdv;i++) {
                System.out.print("#");  
            }
            double vieRest = 100-this.pdv;
            for (int i=0; i<vieRest;i++) {
                System.out.print("_");
            }
            System.out.print("]");
        }
        System.out.println("");
    }

}
