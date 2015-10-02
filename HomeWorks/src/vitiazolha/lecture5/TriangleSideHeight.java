package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class TriangleSideHeight extends Triangle {
    private double sideA, height;

    public TriangleSideHeight(double sideA, double height) throws ValueException {
            if ( sideA > 0 && height > 0 )
            {
                this.sideA = sideA;
                this.height = height;
            }
            else throw new ValueException();
    }

    @Override
    public double getSquare() {
        return sideA * height / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        System.out.format("|   Triangle [a,h]   | %20.2f ; %10.2f | %10.2f |%n", this.sideA, this.height, this.getSquare());
        return "|  Triangle  |\t\t" + this.sideA +  " |\t" + this.height + " |\t" + this.getSquare() + "|" ;
    }
}
