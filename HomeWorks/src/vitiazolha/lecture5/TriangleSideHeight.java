package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 10.09.15.
 */
public class TriangleSideHeight extends Triangle {
    private double sideA, height;

    public TriangleSideHeight(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    public double getSquare(){//if you have side and holding to her height
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
}
