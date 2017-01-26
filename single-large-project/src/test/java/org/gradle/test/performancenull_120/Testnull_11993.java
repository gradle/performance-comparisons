package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11993 {
    private final Productionnull_11993 production = new Productionnull_11993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}