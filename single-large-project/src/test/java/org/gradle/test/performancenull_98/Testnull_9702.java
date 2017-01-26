package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9702 {
    private final Productionnull_9702 production = new Productionnull_9702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}