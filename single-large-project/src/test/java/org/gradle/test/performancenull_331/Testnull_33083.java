package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33083 {
    private final Productionnull_33083 production = new Productionnull_33083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}