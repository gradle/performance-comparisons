package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25441 {
    private final Productionnull_25441 production = new Productionnull_25441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}