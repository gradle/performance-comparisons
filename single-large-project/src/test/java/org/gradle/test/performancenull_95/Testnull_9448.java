package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9448 {
    private final Productionnull_9448 production = new Productionnull_9448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}