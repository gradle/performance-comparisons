package org.gradle.test.performancenull_159;

import static org.junit.Assert.*;

public class Testnull_15823 {
    private final Productionnull_15823 production = new Productionnull_15823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}