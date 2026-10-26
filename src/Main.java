// Client class that configures the context with concrete
// strategies and demonstrates runtime strategy switching

public class Main {
    public static void main(String[] args) {
        double basePrice = 200.0;
        System.out.println("Base product price: $" + basePrice);

        // 1. Using Regular Pricing Strategy
        ShoppingCart cart = new ShoppingCart(new RegularPricingStrategy());
        double regularTotal = cart.calculateFinalPrice(basePrice);
        System.out.println("Regular Customer Price: $" + regularTotal);

        // 2. Switching to VIP Pricing Strategy at runtime
        cart.setPricingStrategy(new VipPricingStrategy());
        double vipTotal = cart.calculateFinalPrice(basePrice);
        System.out.println("VIP Customer Price (20% off): $" + vipTotal);

        // 3. Switching to Holiday Sale Pricing Strategy at runtime
        cart.setPricingStrategy(new HolidaySalePricingStrategy());
        double holidayTotal = cart.calculateFinalPrice(basePrice);
        System.out.println("Holiday Sale Price (15% off): $" + holidayTotal);
    }
}
