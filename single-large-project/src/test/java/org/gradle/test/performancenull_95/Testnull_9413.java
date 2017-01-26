package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9413 {
    private final Productionnull_9413 production = new Productionnull_9413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}