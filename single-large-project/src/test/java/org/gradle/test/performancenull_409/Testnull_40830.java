package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40830 {
    private final Productionnull_40830 production = new Productionnull_40830("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}