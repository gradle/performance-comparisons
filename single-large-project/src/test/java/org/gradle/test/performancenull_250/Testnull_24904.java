package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24904 {
    private final Productionnull_24904 production = new Productionnull_24904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}