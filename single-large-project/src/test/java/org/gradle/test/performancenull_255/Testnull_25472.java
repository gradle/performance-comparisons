package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25472 {
    private final Productionnull_25472 production = new Productionnull_25472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}