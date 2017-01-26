package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_460 {
    private final Production6_460 production = new Production6_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}