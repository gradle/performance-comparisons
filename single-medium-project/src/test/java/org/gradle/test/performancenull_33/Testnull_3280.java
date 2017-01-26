package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3280 {
    private final Productionnull_3280 production = new Productionnull_3280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}