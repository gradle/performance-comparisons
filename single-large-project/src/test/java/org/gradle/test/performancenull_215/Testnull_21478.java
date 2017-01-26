package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21478 {
    private final Productionnull_21478 production = new Productionnull_21478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}