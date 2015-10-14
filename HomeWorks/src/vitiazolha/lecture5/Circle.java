package vitiazolha.lecture5;

import java.util.Scanner;

/**
 * Created by vitiazolha on 09.09.15.
 */
public class Circle extends Shape {
    private double radius;

    @Override
    public void setInfo() throws ValueException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        try {
            double radius = Double.parseDouble(scanner.nextLine());
            if (radius > 0) setRadius(radius);
            else throw new ValueException();
        }
        catch (NumberFormatException e) {
            throw new ValueException();
        }
    }

    @Override
    public double getSquare() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return String.format("|     Circle [R]     | %33.2f | %10.2f |%n", this.radius, this.getSquare());
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
