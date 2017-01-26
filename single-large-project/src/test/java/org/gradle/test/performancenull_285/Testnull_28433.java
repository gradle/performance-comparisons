package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28433 {
    private final Productionnull_28433 production = new Productionnull_28433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}