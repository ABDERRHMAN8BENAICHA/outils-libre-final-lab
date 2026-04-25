package pricing;

import org.junit.jupiter.api.Test;
import pricing.pricing.PricingEngine;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PricingEngineTest {

    @Test
    void testDiscountApplied() {
        PricingEngine engine = new PricingEngine();

        double result = engine.calculate(
                List.of(100.0),
                List.of(1),
                "REGULAR",
                "SAVE10"
        );

        assertEquals(107.1, result, 0.01);
    }
}