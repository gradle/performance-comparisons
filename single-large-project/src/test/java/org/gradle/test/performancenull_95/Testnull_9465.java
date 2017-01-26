package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9465 {
    private final Productionnull_9465 production = new Productionnull_9465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}