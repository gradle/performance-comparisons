package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9900 {
    private final Productionnull_9900 production = new Productionnull_9900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}