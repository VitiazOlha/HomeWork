package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 09.09.15.
 */
public class Rectangle extends Shape {
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) throws ValueException {
            if ( sideA > 0 && sideB > 0)
            {
                this.sideA = sideA;
                this.sideB = sideB;
            }
            else throw new ValueException();
    }

    @Override
    public double getSquare() {
         return sideA * sideB;
    }

    @Override
    public String toString() {
        System.out.format("|   Rectangle [a,b]  | %20.2f ; %10.2f | %10.2f |%n", this.sideA, this.sideB, this.getSquare());
        return "|  Rectangle |\t\t" + this.sideA + " |\t " + this.sideB + " |\t" + this.getSquare() + "|" ;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
