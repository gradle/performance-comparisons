package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25484 {
    private final Productionnull_25484 production = new Productionnull_25484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}