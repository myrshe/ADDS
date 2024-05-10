package org.example;
import java.lang.Math;
import static java.lang.Float.NaN;

/**
 * A class representing a geometric vector.
 */
public class Vector {
    protected int x, y;

    /**
     * Constructs a vector with the given components.
     * @param x the first component.
     * @param y the second component.
     */

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Prints vector parameters.
     */
    public void printVec() {
        System.out.print("( " + x + ", " + y + " )");
    }

    /**
     * Returns vector parameters into a string.
     * @return String parameters.
     */

    public String toString() {
        return "( " + x + ", " + y + " )";
    }

    /**
     * Returns the length/modulus of a vector
     * @return
     */

    public double lenght() {
        double sum = x * x + y * y;
        return Math.sqrt(sum);
    }

    /**
     * Calculates the angle between this vector and another vector
     * @param other the other 2D vector
     * @return the angle between this vector and another vector
     */

    public double getAngle(Vector other) {
        double num = this.x * other.x + this.y * other.y;
        double lenA = this.lenght();
        double lenB = other.lenght();
        if (lenA == 0 || lenB == 0) {
            throw new ArithmeticException("One or two vectors are zero");
        }
        double Angle = num / (lenA * lenB);
        if (Float.isNaN((float) Math.acos(Angle))) {
            return 0;
        } else {
            return Math.acos(Angle);
        }
    }
}
