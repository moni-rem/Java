package selfStudy.Encapsulation;

public class Calculator {
    public static int EXCHANGE_SELL_RATE_TODAY = 4100;
    public static int EXCHANGE_BUY_RATE_TODAY = 4050;

    public static String USD_CCY = "USD";
    public static String KHR_CCY = "KHR";

    private int sellRate;
    private int buyRate;
    private int creditAmount;

    public int getSellRate() {
        return sellRate;
    }
    public void setSellRate(int sellRate) {
        this.sellRate = sellRate;
    }
    public int getBuyRate() {
        return buyRate;
    }
    public void setBuyRate(int buyRate){
        this.buyRate = buyRate;
    }

    public int getCreditAmount() {
        return creditAmount;
    }
    public void setCreditAmount(int creditAmount){
        this.creditAmount = creditAmount;
    }
}
