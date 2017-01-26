package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36916 {
    private final Productionnull_36916 production = new Productionnull_36916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}