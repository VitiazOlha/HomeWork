package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 09.09.15.
 */
public class Circle extends Shape {
    private double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    public double getSquare() {
        return Math.PI * ray * ray;
    }

    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
    }
}
