package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9874 {
    private final Productionnull_9874 production = new Productionnull_9874("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}