package vitiazolha.lecture5;

import java.util.Scanner;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class Triangle2SideSin extends Triangle {
    private double sideA, sideB, degrees;

    @Override
    public void setInfo() throws ValueException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the side A of triangle: ");
            double sideA = Double.parseDouble(scanner.nextLine());
            if (sideA > 0) setSideA(sideA);
            else throw new ValueException();
            System.out.print("Enter the side B of triangle: ");
            double sideB = Double.parseDouble(scanner.nextLine());
            if (sideB > 0) setSideB(sideB);
            else throw new ValueException();
            System.out.print("Enter the degrees between that sides: ");
            double degrees = Double.parseDouble(scanner.nextLine());
            if (degrees > 0 && degrees < 180) setDegrees(degrees);
            else throw new ValueException();
        }
        catch (NumberFormatException e) {
            throw new ValueException();
        }
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
        return String.format("| Triangle [a,b,sin] | %9.2f ; %8.2f ; %9.1f° | %10.2f |%n", this.sideA, this.sideB, this.degrees, this.getSquare());
    }
}
