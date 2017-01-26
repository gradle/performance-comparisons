package org.gradle.test.performancenull_92;

import static org.junit.Assert.*;

public class Testnull_9150 {
    private final Productionnull_9150 production = new Productionnull_9150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}