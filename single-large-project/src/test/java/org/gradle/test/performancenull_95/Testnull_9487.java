package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9487 {
    private final Productionnull_9487 production = new Productionnull_9487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}