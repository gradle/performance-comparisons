package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9831 {
    private final Productionnull_9831 production = new Productionnull_9831("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}