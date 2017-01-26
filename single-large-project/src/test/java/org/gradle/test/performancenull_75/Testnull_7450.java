package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7450 {
    private final Productionnull_7450 production = new Productionnull_7450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}