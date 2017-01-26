package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10280 {
    private final Productionnull_10280 production = new Productionnull_10280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}