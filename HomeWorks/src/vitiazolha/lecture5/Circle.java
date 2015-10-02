package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 09.09.15.
 */
public class Circle extends Shape {
    private double ray;

    public Circle(double ray) throws ValueException {
            if ( ray > 0) this.ray = ray;
            else throw new ValueException();
    }

    @Override
    public double getSquare() {
        return Math.PI * this.ray * this.ray;
    }

    @Override
    public String toString() {
        System.out.format("|     Circle [R]     | %33.2f | %10.2f |%n", this.ray, this.getSquare());
        return "|   Circle   |\t\t\t" + this.ray + " |\t" + this.getSquare() + "|" ;
    }

    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
    }
}
