package pricing;

import com.pricing.enums.CustomerType;
import com.pricing.enums.DiscountCode;
import com.pricing.model.Order;
import com.pricing.service.PricingService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PricingServiceTest {

    @Test
    void shouldCalculateFinalPriceCorrectly() {
        PricingService service = new PricingService();

        Order order = new Order(
                List.of(100.0),
                List.of(1),
                CustomerType.VIP,
                DiscountCode.SAVE10
        );

        double result = service.calculate(order);

        assertEquals(101.745, result, 0.01);
    }
}