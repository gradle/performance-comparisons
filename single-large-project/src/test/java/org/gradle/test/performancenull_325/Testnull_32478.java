package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32478 {
    private final Productionnull_32478 production = new Productionnull_32478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}