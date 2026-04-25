package pricing;

import org.junit.jupiter.api.Test;
import pricing.pricing.PricingEngine;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PricingEngineTest {

    @Test
    void testBasicCalculation() {
        PricingEngine engine = new PricingEngine();

        double result = engine.calculate(
                List.of(100.0),
                List.of(1),
                "REGULAR",
                "SAVE10"
        );

        assertTrue(result > 0);
    }
}