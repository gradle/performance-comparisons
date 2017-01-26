package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46123 {
    private final Productionnull_46123 production = new Productionnull_46123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}