import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double paymentAmount = service.calculate(1000000.00, 9.99, 12);
        System.out.println("Первый вариант");
        System.out.println("Сумма платежв:" + Math.round(paymentAmount));

        double paymentAmount24 = service.calculate(1000000.00, 9.99, 24);
        System.out.println("Второй вариант");
        System.out.println("Сумма платежв:" + Math.round(paymentAmount24));

        double paymentAmount36 = service.calculate(1000000.00, 9.99, 36);
        System.out.println("Третий вариант");
        System.out.println("Сумма платежв:" + Math.round(paymentAmount36));

    }
}
