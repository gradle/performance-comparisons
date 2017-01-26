package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25483 {
    private final Productionnull_25483 production = new Productionnull_25483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}