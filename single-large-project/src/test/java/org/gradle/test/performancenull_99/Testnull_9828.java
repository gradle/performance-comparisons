package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9828 {
    private final Productionnull_9828 production = new Productionnull_9828("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}