package util;

public class CurrencyConverter {
	

	
	
	public static double iof = 0.06;
	
	
	
	public static double reais (double dollarBought, double dollarPrice ) {
		return (dollarPrice * dollarBought) + (dollarPrice * dollarBought * iof);
	}
	
	

}
