package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25592 {
    private final Productionnull_25592 production = new Productionnull_25592("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}