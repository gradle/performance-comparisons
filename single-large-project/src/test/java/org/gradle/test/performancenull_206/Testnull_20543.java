package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20543 {
    private final Productionnull_20543 production = new Productionnull_20543("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}