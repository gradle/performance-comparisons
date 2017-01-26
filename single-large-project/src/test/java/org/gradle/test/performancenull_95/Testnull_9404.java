package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9404 {
    private final Productionnull_9404 production = new Productionnull_9404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}