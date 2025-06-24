package projeto_6.util;

public class CurrencyConverter {

    public static double reais(double dollarPrice, double boughtDollars){
        return dollarPrice * boughtDollars * 1.06;
    }
}
