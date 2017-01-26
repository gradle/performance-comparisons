package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11092 {
    private final Productionnull_11092 production = new Productionnull_11092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}