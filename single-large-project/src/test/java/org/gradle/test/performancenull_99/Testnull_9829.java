package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9829 {
    private final Productionnull_9829 production = new Productionnull_9829("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}