public class ExCurrencyExchange {
    public static void main(String[] args) {
        System.out.println(exchangeCurrency("USD", 100));
    }

    public static double exchangeCurrency (String currencyID, double value){
        double converted = 0;
        if (currencyID.equalsIgnoreCase("HUF")){
            converted = value * 328.61;
        } else if (currencyID.equalsIgnoreCase("SEK")){
            converted = value * 10.76;
        } else if (currencyID.equalsIgnoreCase("USD")){
            converted = value * 1.12;
        } else if (currencyID.equalsIgnoreCase("CAD")){
            converted = 1.47;
        } else {
            System.out.println("Invalid Currency");
        }

        return converted;
    }
}
