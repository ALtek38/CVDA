package tpinterface;

/**
 *
 * @author p1618672
 */
public abstract interface StructHeros 
{

    @Override
    public String toString();
    public String getNom();
    public void etat();
    public double calculePuissance();
    public void combat(Hero herosDefense);
    public void perdPoint(double nbPointsPerdus);
}
