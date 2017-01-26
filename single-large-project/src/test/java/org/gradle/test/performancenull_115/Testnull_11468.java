package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11468 {
    private final Productionnull_11468 production = new Productionnull_11468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}