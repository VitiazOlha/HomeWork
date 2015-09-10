package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class Triangle3Side extends Triangle {
    private double sideA, sideB, sideC;

    public Triangle3Side(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSquare(){//if you have side and holding to her height
        double halfPer = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPer * (halfPer - sideA) * (halfPer - sideB) * (halfPer - sideB));
    }
}
