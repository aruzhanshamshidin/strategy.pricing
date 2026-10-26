/**
 * Concrete strategy for regular customers with no discount applied.
 */
public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice;
    }
}
