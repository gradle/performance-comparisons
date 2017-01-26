package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9805 {
    private final Productionnull_9805 production = new Productionnull_9805("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}