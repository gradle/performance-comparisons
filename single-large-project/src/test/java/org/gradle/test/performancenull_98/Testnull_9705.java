package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9705 {
    private final Productionnull_9705 production = new Productionnull_9705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}