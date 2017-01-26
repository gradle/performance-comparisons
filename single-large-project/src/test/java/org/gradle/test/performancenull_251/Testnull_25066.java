package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25066 {
    private final Productionnull_25066 production = new Productionnull_25066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}