public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment1 = service.calculate(12);
        double payment2 = service.calculate(24);
        double payment3 = service.calculate(36);
        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
    }
}