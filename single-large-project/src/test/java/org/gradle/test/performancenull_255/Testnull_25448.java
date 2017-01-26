package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25448 {
    private final Productionnull_25448 production = new Productionnull_25448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}