public class Discount {
    public static double applyDiscount(double amount, double percentage) {
        return amount - (amount * percentage / 100);
    }
}

