package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25497 {
    private final Productionnull_25497 production = new Productionnull_25497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}