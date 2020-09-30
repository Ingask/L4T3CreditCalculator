public class CreditPaymentService {
    public double calculate(double amount, double rate, double terminyears) {

        double r = 12 * terminyears;
        double i = rate / 100 / 12;
        double k = 1 + i;
        double t = Math.pow(k, r);
        double P = amount * (i + i / (t - 1));
        return P;
    }
}
