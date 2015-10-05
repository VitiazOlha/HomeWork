package vitiazolha.lecture5;

import java.util.Scanner;

/**
 * Created by vitiazolha on 09.09.15.
 */
public class Rectangle extends Shape {
    private double sideA, sideB;

    @Override
    public void setInfo() throws ValueException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the side A of rectangle: ");
            double sideA = Double.parseDouble(scanner.nextLine());
            if (sideA > 0) setSideA(sideA);
            else throw new ValueException();
            System.out.print("Enter the side B of rectangle: ");
            double sideB = Double.parseDouble(scanner.nextLine());
            if (sideB > 0) setSideB(sideB);
            else throw new ValueException();
        }
        catch (NumberFormatException e) {
            throw new ValueException();
        }
    }

    @Override
    public double getSquare() {
         return sideA * sideB;
    }

    @Override
    public String toString() {
        return String.format("|   Rectangle [a,b]  | %20.2f ; %10.2f | %10.2f |%n", this.sideA, this.sideB, this.getSquare());
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
