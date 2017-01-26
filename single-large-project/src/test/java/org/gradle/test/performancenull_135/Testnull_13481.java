package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13481 {
    private final Productionnull_13481 production = new Productionnull_13481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}