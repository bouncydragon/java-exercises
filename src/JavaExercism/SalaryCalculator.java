package JavaExercism;

public class SalaryCalculator {
    int threshold = 5;
    double baseSalary = 1000.00;
    double salaryCapped = 2000.00;

    public static void main(String[] args) {
        SalaryCalculator sal = new SalaryCalculator();
        sal.finalSalary(7, 0);
    }

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < threshold ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold == 0 ? 0 : productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * (int)bonusForProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double totalSalary = (baseSalary + bonusForProductsSold(productsSold)) * salaryMultiplier(daysSkipped);
        return Math.min(totalSalary, salaryCapped);
    }
}
