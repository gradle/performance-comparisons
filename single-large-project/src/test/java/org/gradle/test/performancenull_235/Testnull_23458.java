package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23458 {
    private final Productionnull_23458 production = new Productionnull_23458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}