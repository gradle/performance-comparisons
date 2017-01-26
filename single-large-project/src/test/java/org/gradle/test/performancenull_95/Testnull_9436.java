package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9436 {
    private final Productionnull_9436 production = new Productionnull_9436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}