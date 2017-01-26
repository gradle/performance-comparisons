package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9843 {
    private final Productionnull_9843 production = new Productionnull_9843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}