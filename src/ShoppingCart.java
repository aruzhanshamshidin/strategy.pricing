    /**
 * Context class that maintains a reference to a PricingStrategy
 * and delegates price calculation to it. Supports runtime strategy switching.
 */
public class ShoppingCart {
    private PricingStrategy pricingStrategy;

    // Constructor injection for the initial strategy
    public ShoppingCart(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    // Setter to switch strategy at runtime
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    // Delegates calculation to the current strategy (algorithm-agnostic context)
    public double calculateFinalPrice(double basePrice) {
        if (basePrice < 0) {
            throw new IllegalArgumentException("Base price cannot be negative.");
        }
        return pricingStrategy.calculatePrice(basePrice);
    }
}
