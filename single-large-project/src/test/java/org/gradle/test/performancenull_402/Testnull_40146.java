package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40146 {
    private final Productionnull_40146 production = new Productionnull_40146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}