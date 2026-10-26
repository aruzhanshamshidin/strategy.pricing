/**
 * Concrete strategy for holiday sales offering a 15% discount.
 */
public class HolidaySalePricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 0.85; // 15% discount
    }
}
