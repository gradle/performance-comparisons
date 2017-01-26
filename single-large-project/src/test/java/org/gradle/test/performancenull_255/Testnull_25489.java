package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25489 {
    private final Productionnull_25489 production = new Productionnull_25489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}