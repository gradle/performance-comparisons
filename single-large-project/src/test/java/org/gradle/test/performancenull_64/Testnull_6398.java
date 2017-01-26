package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6398 {
    private final Productionnull_6398 production = new Productionnull_6398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}