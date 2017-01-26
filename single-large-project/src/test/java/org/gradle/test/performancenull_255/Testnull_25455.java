package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25455 {
    private final Productionnull_25455 production = new Productionnull_25455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}