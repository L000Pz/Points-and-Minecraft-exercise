package points;

/**
 *in this class we can calculate a points' 3D coordination by entering its spherical coordination;
 * Here P represents the points' distance from origin (point (0,0,0) or the radius);
 * Tet is the angle between radius and the x-axis;
 * And fi is the angle between radius and the z-axis;
 * Using the given formulas you can calculate its 3D coordination;
 */
public class Spherical {
    double P;
    double Tet;
    double fi;

    /**
     * P represents the points' distance from origin (point (0,0,0) or the radius);
     * Tet is the angle between radius and the x-axis;
     * And fi is the angle between radius and the z-axis;
     * @param P
     * @param Tet
     * @param fi
     */
    public Spherical(double P, double Tet, double fi){
        this.P = P;
        this.Tet = Tet;
        this.fi = fi;
    }

    /**
     * finding the X coordinate
     * @return the X coordinate
     */
    public double cordX(){
        double x =  P * Math.cos(Tet) * Math.sin(fi);
        return Math.round(x);
    }
    /**
     * finding the Y coordinate
     * @return the Y coordinate
     */
    public double cordY() {
        double y = P * Math.sin(Tet) * Math.sin(fi);
        return Math.round(y);
    }
    /**
     * finding the Z coordinate
     * @return the Z coordinate
     */
    public double cordZ() {
        double z = P * Math.cos(Tet);
        return Math.round(z);
    }

    /**
     * In this function we can calculate the distance between two points in a Spherical diagram
     * using the 3D coordination we got from the previous part;
     * @param kore
     * @return the distance between 2 points
     */
    public double distance(Spherical kore){
        double dis = Math.sqrt(Math.pow(this.cordX() - kore.cordX() , 2) + Math.pow(this.cordY() - kore.cordY(),2) + Math.pow(this.cordZ() - kore.cordZ(),2));
        return Math.round(dis);
    }

}
