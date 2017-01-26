package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1823 {
    private final Productionnull_1823 production = new Productionnull_1823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}