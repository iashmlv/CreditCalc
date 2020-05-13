public class CreditPaymentService {
    public double calculate(double creditPeriod) {
        //узнаем помесячную процентную ставку кредита
        double interest = 0.0999/12;
        long amount = 1000000;
        //возьмем за x сумму 1 и помесячной ставки, возведенную в степень количества месяцев
        double x = Math.pow(1 + interest, creditPeriod);
        //узнаем коэффицент аннуитета
        double annuity = (interest * x)/(x - 1);
        //возвращаем округленную сумму платежа
        return Math.round((double) amount * annuity);
    }

}