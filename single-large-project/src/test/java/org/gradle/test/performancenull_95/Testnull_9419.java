package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9419 {
    private final Productionnull_9419 production = new Productionnull_9419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}