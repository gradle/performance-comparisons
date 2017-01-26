package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9475 {
    private final Productionnull_9475 production = new Productionnull_9475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}