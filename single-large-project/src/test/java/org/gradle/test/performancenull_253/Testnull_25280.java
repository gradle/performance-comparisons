package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25280 {
    private final Productionnull_25280 production = new Productionnull_25280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}