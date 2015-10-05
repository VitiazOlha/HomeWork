package vitiazolha.lecture5;

import java.util.Scanner;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class Triangle3Side extends Triangle {
    private double sideA, sideB, sideC;

    @Override
    public double getSquare()  {
        double halfPer = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPer * (halfPer - sideA) * (halfPer - sideB) * (halfPer - sideC));
    }

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
            System.out.print("Enter the side C of triangle:");
            double sideC = Double.parseDouble(scanner.nextLine());
            if (sideC > 0) setSideC(sideC);
            else throw new ValueException();
        }
        catch (NumberFormatException e) {
            throw new ValueException();
        }
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
        return String.format("|  Triangle [a,b,c]  | %9.2f ; %8.2f ; %10.2f | %10.2f |%n", this.sideA, this.sideB, this.sideC, this.getSquare());
    }
}
