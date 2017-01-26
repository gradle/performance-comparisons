package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9986 {
    private final Productionnull_9986 production = new Productionnull_9986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}