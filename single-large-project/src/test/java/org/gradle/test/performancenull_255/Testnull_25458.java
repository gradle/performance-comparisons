package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25458 {
    private final Productionnull_25458 production = new Productionnull_25458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}