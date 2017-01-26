package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9823 {
    private final Productionnull_9823 production = new Productionnull_9823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}