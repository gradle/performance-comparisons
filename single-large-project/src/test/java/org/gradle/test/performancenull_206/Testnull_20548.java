package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20548 {
    private final Productionnull_20548 production = new Productionnull_20548("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}