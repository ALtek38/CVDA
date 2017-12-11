package tpinterface;

/**
 *
 * @author p1618672
 */
public class HerosMer extends Hero
{
    private double nbNageoire;
    private double vitesse;

    /**
     * Constructeur
     * @param nbNageoire nombre de nageoire
     * @param vitesse vitesse
     * @param nom nom
     * @param pdv Point de vie
     */
    public HerosMer(double nbNageoire, double vitesse) 
    {
        super();
        this.nbNageoire = nbNageoire;
        this.vitesse = vitesse;
    }
    
    /**
     * retourne les infos du heros de mer
     * @return caracteristique du hero de mer
     */
    @Override
    public String toString() 
    {
        return "Heros de mer "+this.nom + " vie: " +this.pdv + " possede " + nbNageoire +" nageoires vitesse "+ vitesse+" km/h";
    }
    
    /**
     * Calcule la puissance du hero de mer
     * @return puissance hero de mer
     */
    public double calculePuissance()
    {
        return nbNageoire*vitesse;
    }
    
    /**
     * Gere les combats entre heros
     * @param heroDefense Hero qui se defend
     */
    public void combat(Hero heroDefense)
    {
        double puissanceAtk = this.calculePuissance();
        double puissanceDef = heroDefense.calculePuissance();
        
        if (puissanceAtk>puissanceDef)
        {
            heroDefense.perdPoint(50);
        } else if (puissanceAtk==puissanceDef && this.pdv>=50)
        {
            heroDefense.perdPoint(15);
        } else if (puissanceAtk<puissanceDef && this.pdv>=50)
        {
            heroDefense.perdPoint(15);
        } else if (puissanceAtk<puissanceDef && this.pdv<50)
        {
            this.perdPoint(10);
        } else {
            System.out.println("Cas de figure non pris en compte");
        }
        this.etat();
        this.afficheVie();
        heroDefense.etat();
        heroDefense.afficheVie();
    }
    
    
}
