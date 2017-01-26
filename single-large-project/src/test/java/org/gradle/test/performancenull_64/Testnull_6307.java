package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6307 {
    private final Productionnull_6307 production = new Productionnull_6307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}