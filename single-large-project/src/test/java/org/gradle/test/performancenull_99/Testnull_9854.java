package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9854 {
    private final Productionnull_9854 production = new Productionnull_9854("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}