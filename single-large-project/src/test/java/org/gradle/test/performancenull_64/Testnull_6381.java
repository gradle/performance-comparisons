package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6381 {
    private final Productionnull_6381 production = new Productionnull_6381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}