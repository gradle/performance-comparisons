package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24045 {
    private final Productionnull_24045 production = new Productionnull_24045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}