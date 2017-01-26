package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9477 {
    private final Productionnull_9477 production = new Productionnull_9477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}