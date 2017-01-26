package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9904 {
    private final Productionnull_9904 production = new Productionnull_9904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}