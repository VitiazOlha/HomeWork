package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 09.09.15.
 */
public class Square extends Shape {
    private double sideA, sideB;

    public Square(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSquare(){
        return sideA * sideB;
    }
}
