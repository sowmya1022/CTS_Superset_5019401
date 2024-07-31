package Finance;

public class FinancialForecasting {

    // Iterative method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        double futureValue = initialValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Starting value
        double growthRate = 0.05; // 5% growth rate per year
        int years = 10; // Number of years to forecast

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: $" + futureValue);
    }
}
