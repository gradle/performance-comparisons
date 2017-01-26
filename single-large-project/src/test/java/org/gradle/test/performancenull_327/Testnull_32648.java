package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32648 {
    private final Productionnull_32648 production = new Productionnull_32648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}