package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23381 {
    private final Productionnull_23381 production = new Productionnull_23381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}