package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13248 {
    private final Productionnull_13248 production = new Productionnull_13248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}