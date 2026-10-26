/**
 * Strategy interface declaring the pricing algorithm contract.
 * All concrete discount pricing strategies must implement this interface.
 */
public interface PricingStrategy {
    double calculatePrice(double basePrice);
}