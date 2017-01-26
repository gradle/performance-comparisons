package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40090 {
    private final Productionnull_40090 production = new Productionnull_40090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}