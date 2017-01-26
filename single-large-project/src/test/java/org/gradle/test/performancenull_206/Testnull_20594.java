package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20594 {
    private final Productionnull_20594 production = new Productionnull_20594("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}