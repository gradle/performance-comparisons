package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49280 {
    private final Productionnull_49280 production = new Productionnull_49280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}