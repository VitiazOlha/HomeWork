package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class Triangle2SideSin extends Triangle {
    private double sideA, sideB, degrees;

    public Triangle2SideSin(double sideA, double sideB, double degrees) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.degrees = degrees;
    }

    public double getSquare(){//if you have side and holding to her height
        return sideA * sideB * Math.sin(Math.toRadians(degrees)) / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }
}
