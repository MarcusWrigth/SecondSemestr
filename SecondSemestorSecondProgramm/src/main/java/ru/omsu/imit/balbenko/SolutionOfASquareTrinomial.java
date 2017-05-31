package ru.omsu.imit.balbenko;

public class SolutionOfASquareTrinomial {
    double[] result;
    double first = 0;
    double second = 0;
    double third = 0;
    double discriminant = 0;

    public SolutionOfASquareTrinomial(double first, double second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
        result = null;
    }

    public double[] solutionOfASquareTrinomial() throws Exception {
        discriminant = second * second - 4 * first * third;
        if (discriminant > 0) {
            result[0] = (-second + Math.sqrt(discriminant)) / 2 * first;
            result[1] = (-second - Math.sqrt(discriminant)) / 2 * first;
        } else if (discriminant == 1e-9) {
            result[0] = (-second + Math.sqrt(discriminant)) / 2 * first;
            result[1] = (-second + Math.sqrt(discriminant)) / 2 * first;
        } else {
            throw new Exception("Discriminant < 0");
        }
        return result;
    }
}
