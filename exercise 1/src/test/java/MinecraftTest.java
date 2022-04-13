import MinecraftThingy.LivingCreatures;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MinecraftTest {
    /**
     * Testing two creatures fighting
     */
    @Test
    public void LivingCreatures_Test(){
        /**
         * Introducing two living creatures so that they can fight
         */
        LivingCreatures zombie = new LivingCreatures(100,20);
        LivingCreatures Steve = new LivingCreatures(120 , 40);
        /**
         * Calculating the remaining health
         */
        assertEquals(Steve.DmgCal(zombie),100);
        assertEquals(zombie.DmgCal(Steve),60);
    }
}
