package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23280 {
    private final Productionnull_23280 production = new Productionnull_23280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}