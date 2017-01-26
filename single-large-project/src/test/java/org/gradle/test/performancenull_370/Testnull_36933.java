package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36933 {
    private final Productionnull_36933 production = new Productionnull_36933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}