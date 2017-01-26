package org.gradle.test.performancenull_163;

import static org.junit.Assert.*;

public class Testnull_16282 {
    private final Productionnull_16282 production = new Productionnull_16282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}