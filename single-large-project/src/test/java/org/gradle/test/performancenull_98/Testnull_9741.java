package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9741 {
    private final Productionnull_9741 production = new Productionnull_9741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}