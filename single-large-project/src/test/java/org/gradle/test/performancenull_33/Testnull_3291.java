package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3291 {
    private final Productionnull_3291 production = new Productionnull_3291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}