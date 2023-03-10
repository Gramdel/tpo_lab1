package first;

public class ArcTangentSeries {

    public double decomposeToSeries(double x, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += calculateStep(x, i);
        }
        return sum;
    }

    public double calculateStep(double x, int n) {
        return (Math.pow(-1, n - 1) * Math.pow(x, 2 * n - 1)) / (2 * n - 1);
    }
}
