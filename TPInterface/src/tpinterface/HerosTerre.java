package tpinterface;

/**
 *
 * @author p1618672
 */
public class HerosTerre extends Hero
{
    private double poids;
    private double agilite;

    /**
     * Constructeur
     * @param poids poids
     * @param agilite agilite
     * @param nom nom
     * @param pdv point de vie
     */
    public HerosTerre(double poids, double agilite) 
    {
        super();
        this.poids = poids;
        this.agilite = agilite;
    }

    /**
     * retourne les infos du heros de terre
     * @return caracteristique du hero de terre
     */
    @Override
    public String toString() 
    {
        return "Heros de Terre "+this.nom + " vie: " +this.pdv + " pese " + poids +"kg agilite "+ agilite;
    }
    
    /**
     * Calcule la puissance du hero de terre
     * @return puissance hero de terre
     */
    public double calculePuissance()
    {
        return poids/20*agilite;
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
            heroDefense.perdPoint(40);
        } else if (puissanceAtk==puissanceDef)
        {
            System.out.println("Les 2 heros ont la meme puissance");
        } else if (puissanceAtk>puissanceDef) 
        {
            this.perdPoint(15);
        } else {
            System.out.println("Cas de figure non pris en compte");
        }
        this.etat();
        this.afficheVie();
        heroDefense.etat();
        heroDefense.afficheVie();
    }
    
    
}
