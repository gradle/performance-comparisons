package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36198 {
    private final Productionnull_36198 production = new Productionnull_36198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}