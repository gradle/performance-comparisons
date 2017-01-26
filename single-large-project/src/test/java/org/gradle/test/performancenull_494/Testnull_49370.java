package org.gradle.test.performancenull_494;

import static org.junit.Assert.*;

public class Testnull_49370 {
    private final Productionnull_49370 production = new Productionnull_49370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}