package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25421 {
    private final Productionnull_25421 production = new Productionnull_25421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}