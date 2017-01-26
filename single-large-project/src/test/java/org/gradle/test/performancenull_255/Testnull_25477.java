package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25477 {
    private final Productionnull_25477 production = new Productionnull_25477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}