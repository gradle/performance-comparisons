package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36392 {
    private final Productionnull_36392 production = new Productionnull_36392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}