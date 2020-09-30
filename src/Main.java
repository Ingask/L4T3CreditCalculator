public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double P1 = service.calculate(1_000_000, 9.99, 1);
        System.out.println((int) P1);

        double P2 = service.calculate(1_000_000.00, 9.99, 2);
        System.out.println((int) P2);

        double P3 = service.calculate(1_000_000, 9.99, 3);
        System.out.println((int) P3);

    }
}
