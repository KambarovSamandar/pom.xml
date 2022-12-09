import java.util.Scanner;

public class Discriminant {
    private double radicalX1;

    private double radicalX2;

    private double discriminant;

    public int coeffA, coeffB, coeffC;

    public Discriminant(int coeffA, int coeffB, int coeffC) {
        this.coeffA = coeffA;
        this.coeffB = coeffB;
        this.coeffC = coeffC;
    }

    private void countDiscriminant() {
        discriminant = Math.pow(2, coeffB) - 4 * coeffA * coeffC;
    }

    public void countRadicals() {

        if(discriminant > 0) {
            radicalX1 = -coeffB - Math.sqrt(discriminant) / (2 * coeffA);
            radicalX2 = -coeffB + Math.sqrt(discriminant) / (2 * coeffA);

        }
        else if(discriminant == 0) {
            radicalX1 = (-coeffB) / (2 * coeffA);

        }
        else if ( discriminant < 0) {
            System.out.println("не имеет корней");
        }
    }



}
