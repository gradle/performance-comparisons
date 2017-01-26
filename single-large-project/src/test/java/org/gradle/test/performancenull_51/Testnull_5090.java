package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5090 {
    private final Productionnull_5090 production = new Productionnull_5090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}