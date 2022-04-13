package MinecraftThingy;

/**
 * In this class we have a simple method to show if two living creatures faced each other in the famous game minecraft
 * (ideally an enemy and a friendly)
 * who damages who and how much;
 */
public class LivingCreatures {

    double hp;
    double dmg;

    public LivingCreatures(double hp, double dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    /**
     * the method to calculate the health after damage
     * @param TheEnemy
     * @return the rest of your health after the damage
     */
    public double DmgCal(LivingCreatures TheEnemy){
        double Dmged = hp - TheEnemy.dmg;
        return Math.round(Dmged);
    }
}
