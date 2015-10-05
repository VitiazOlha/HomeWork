package vitiazolha.lecture5;

import java.util.Scanner;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class TriangleSideHeight extends Triangle {
    private double sideA, height;

    @Override
    public void setInfo() throws ValueException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the side of triangle: ");
            double sideA = Double.parseDouble(scanner.nextLine());
            if (sideA > 0) setSideA(sideA);
            else throw new ValueException();
            System.out.print("Enter the height of triangle: ");
            double height = Double.parseDouble(scanner.nextLine());
            if (height > 0) setHeight(height);
            else throw new ValueException();
        }
        catch (NumberFormatException e) {
            throw new ValueException();
        }
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
        return String.format("|   Triangle [a,h]   | %20.2f ; %10.2f | %10.2f |%n", this.sideA, this.height, this.getSquare());
    }
}
