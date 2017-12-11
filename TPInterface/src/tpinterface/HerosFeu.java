package tpinterface;

/**
 *
 * @author p1618672
 */
public class HerosFeu extends Hero
{
    private double taille;
    private double puissanceDeFeu;

    /**
     * Constructeur
     * @param taille taille
     * @param puissanceDeFeu Puissance de feu 
     * @param nom nom
     * @param pdv Point de vie
     */
    public HerosFeu(double taille, double puissanceDeFeu) 
    {
        super();
        this.taille = taille;
        this.puissanceDeFeu = puissanceDeFeu;
    }
    
    /**
     * retourne les infos du heros de feu
     * @return caracteristique du hero de feu
     */
    @Override
    public String toString() 
    {
        return "Heros de Feu "+this.nom + " vie: " +this.pdv + " mesure " + taille +"cm puissancede feu "+ puissanceDeFeu;
    }
    
    /**
     * Calcule la puissance du hero de feu
     * @return puissance hero de feu
     */
    public double calculePuissance()
    {
        return taille/100*puissanceDeFeu;
    }
    
    /**
     * Gere les combats entre heros
     * @param heroDefense Hero qui se defend
     */
    public void combat(Hero heroDefense)
    {
        double puissanceAtk = this.calculePuissance();
        double puissanceDef = heroDefense.calculePuissance();
        if (this.pdv>=20)
        {
            if (puissanceAtk<puissanceDef)
            {
                System.out.println("Pas de point de vie perdu pour les 2 heros");
            } else if (puissanceAtk==puissanceDef)
            {
                heroDefense.perdPoint(20);
            } else if (puissanceAtk>puissanceDef)
            {
                heroDefense.perdPoint(60);
            }
        } else {
            System.out.println("Le Hero n'a pas assez de point de vie pour attaquer");
        }
        this.etat();
        this.afficheVie();
        heroDefense.etat();
        heroDefense.afficheVie();
    } 
}
