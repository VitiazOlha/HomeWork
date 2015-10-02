package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class Triangle3Side extends Triangle {
    private double sideA, sideB, sideC;

    public Triangle3Side(double sideA, double sideB, double sideC) throws ValueException {
            if ( sideA > 0 && sideB > 0 && sideC > 0)
            {
                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;
            }
            else throw new ValueException();
    }

    @Override
    public double getSquare()  {
        double halfPer = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPer * (halfPer - sideA) * (halfPer - sideB) * (halfPer - sideC));
    }


    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        System.out.format("|  Triangle [a,b,c]  | %9.2f ; %8.2f ; %10.2f | %10.2f |%n", this.sideA, this.sideB, this.sideC, this.getSquare());
        return "|  Triangle  |\t" + this.sideA + " |\t" + this.sideB + " |\t" + this.sideC + " |\t" + this.getSquare() + "|" ;
    }
}
