package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_393 {
    private final Production6_393 production = new Production6_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}