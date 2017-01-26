package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9476 {
    private final Productionnull_9476 production = new Productionnull_9476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}