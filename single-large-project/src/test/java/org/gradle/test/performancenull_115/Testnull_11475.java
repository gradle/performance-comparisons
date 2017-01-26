package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11475 {
    private final Productionnull_11475 production = new Productionnull_11475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}