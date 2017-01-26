package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11832 {
    private final Productionnull_11832 production = new Productionnull_11832("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}