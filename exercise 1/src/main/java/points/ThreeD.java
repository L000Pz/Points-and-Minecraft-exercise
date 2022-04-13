package points;

/**
 * In this class we first introduce the 3D coordination;
 * Then we calculate two points distances;
 */
public class ThreeD {
    public final static ThreeD origin = new ThreeD(0,0,0);
    public double x;
    public double y;
    public double z;
    public ThreeD(double x , double y , double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Calculates the 3D distance
     * @param Sebodi
     * @return The 3D distance
     */
    public double distance(ThreeD Sebodi){
        double dis = Math.sqrt(Math.pow(this.x - Sebodi.x , 2) + Math.pow(this.y - Sebodi.y,2) + Math.pow(this.z - Sebodi.z,2));
        dis = Math.round(dis);
        return dis;
    }
}

