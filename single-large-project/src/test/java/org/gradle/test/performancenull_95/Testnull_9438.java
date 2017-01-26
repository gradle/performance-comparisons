package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9438 {
    private final Productionnull_9438 production = new Productionnull_9438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}