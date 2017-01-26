package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36486 {
    private final Productionnull_36486 production = new Productionnull_36486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}