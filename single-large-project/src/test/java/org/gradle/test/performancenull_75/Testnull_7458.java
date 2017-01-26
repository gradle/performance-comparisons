package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7458 {
    private final Productionnull_7458 production = new Productionnull_7458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}