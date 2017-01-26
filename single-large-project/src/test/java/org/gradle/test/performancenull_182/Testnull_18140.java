package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18140 {
    private final Productionnull_18140 production = new Productionnull_18140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}