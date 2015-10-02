package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class Triangle2SideSin extends Triangle {
    private double sideA, sideB, degrees;

    public Triangle2SideSin(double sideA, double sideB, double degrees) throws ValueException {
            if ( sideA > 0 && sideB > 0 && (degrees > 0 && degrees < 180))
            {
                this.sideA = sideA;
                this.sideB = sideB;
                this.degrees = degrees;
            }
            else throw new ValueException();
    }

    @Override
    public double getSquare() {
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

    @Override
    public String toString() {
        System.out.format("| Triangle [a,b,sin] | %9.2f ; %8.2f ; %9.1f° | %10.2f |%n", this.sideA, this.sideB, this.degrees, this.getSquare());
        return "|  Triangle  |\t" + this.sideA + " |\t" + this.sideB + " |\t" + this.degrees + " |\t" + this.getSquare() + "|" ;
    }
}
