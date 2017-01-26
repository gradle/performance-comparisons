package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_132 {
    private final Productionnull_132 production = new Productionnull_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}