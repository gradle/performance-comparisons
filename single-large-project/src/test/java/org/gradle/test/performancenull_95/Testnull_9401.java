package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9401 {
    private final Productionnull_9401 production = new Productionnull_9401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}