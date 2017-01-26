package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11972 {
    private final Productionnull_11972 production = new Productionnull_11972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}