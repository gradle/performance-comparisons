package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25405 {
    private final Productionnull_25405 production = new Productionnull_25405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}