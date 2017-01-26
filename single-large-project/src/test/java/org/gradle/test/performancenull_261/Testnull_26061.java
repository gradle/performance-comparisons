package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26061 {
    private final Productionnull_26061 production = new Productionnull_26061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}