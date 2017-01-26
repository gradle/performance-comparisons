package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9403 {
    private final Productionnull_9403 production = new Productionnull_9403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}