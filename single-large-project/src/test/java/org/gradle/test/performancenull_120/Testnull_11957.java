package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11957 {
    private final Productionnull_11957 production = new Productionnull_11957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}