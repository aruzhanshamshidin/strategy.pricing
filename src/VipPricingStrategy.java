/**
 * Concrete strategy for VIP customers offering a 20% discount.
 */
public class VipPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 0.80; // 20% discount
    }
}