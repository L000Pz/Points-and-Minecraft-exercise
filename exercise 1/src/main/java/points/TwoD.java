package points;
/**
 * In this class we first introduce the 2D coordination;
 * Then we calculate two points distances;
 */
public class TwoD {
    public final static TwoD origin = new TwoD(0,0);
    public double x;
    public double y;
    public TwoD(double x , double y ){
        this.x = x;
        this.y = y;
    }
    /**
     * Calculates the 2D distance
     * @param Dobodi
     * @return The 2D distance
     */
    public double distance(TwoD Dobodi){
        double dis =   Math.sqrt(Math.pow(this.x - Dobodi.x , 2) + Math.pow(this.y - Dobodi.y,2));
        dis = Math.round(dis);
        return dis;
    }
}
