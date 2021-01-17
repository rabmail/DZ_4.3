public class CreditPaymentService {

    public double calculate(double totalSum, double procent, double periodInMonths) {

        double procentInMonths = procent / 12 / 100;
        double result = procentInMonths * (Math.pow((procentInMonths + 1), (periodInMonths)));
        double result2 = Math.pow((procentInMonths + 1), periodInMonths);
        double result3 = result / (result2 - 1);
        double paymentAmount = result3 * totalSum;


        return paymentAmount; // возвращаем сумму платежа
    }
}
