import org.junit.jupiter.api.Test;
import points.Spherical;
import points.ThreeD;
import points.TwoD;

import static org.junit.jupiter.api.Assertions.*;
public class PointsTest {
    /**
     * Testing 2D distance
     */
    @Test
    public void TwoDD_Test(){
        TwoD p1 = new TwoD(4 , 5);
        TwoD p2 = new TwoD(5,9);
        assertEquals(p1.distance(p2),4);
    }

    /**
     * Testing 3D distance
     */
    @Test
    public void ThreeDD_Test(){
        ThreeD p1 = new ThreeD(4,5,1);
        ThreeD p2 = new ThreeD(2,3,5);
        assertEquals(p1.distance(p2),5);
    }

    /**
     * Testing Spherical class
     */
    @Test
    public void SphericalCord_Test(){
        /**
         * Introducing point 1 :
         */
        Spherical p1 = new Spherical(4.32,2.14,1.18);
        /**
         * Getting p1 coordination :
         */
        assertEquals(p1.cordX(), -2);
        assertEquals(p1.cordY(), 3);
        assertEquals(p1.cordZ(), -2);
        /**
         * Introducing point 2 :
         */
        Spherical p2 = new Spherical(3,2,1);
        /**
         *  Getting p2 coordination :
         */
        assertEquals(p2.cordX(), -1);
        assertEquals(p2.cordY(), 2);
        assertEquals(p2.cordZ(), -1);
        /**
         * Calculating p1 and p2 distance :
         */
        assertEquals(p1.distance(p2), 2);

    }
}
