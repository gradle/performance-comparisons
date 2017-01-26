package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25491 {
    private final Productionnull_25491 production = new Productionnull_25491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}