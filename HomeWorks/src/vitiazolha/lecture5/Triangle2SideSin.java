package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class Triangle2SideSin extends Triangle {
    private double sideA, sideB, degrees;

    public Triangle2SideSin(double sideA, double sideB, double degrees) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.degrees = Math.toRadians(degrees);
    }


    public double getSquare(){//if you have side and holding to her height
        return sideA * sideB * Math.sin(degrees) / 2;
    }
}
