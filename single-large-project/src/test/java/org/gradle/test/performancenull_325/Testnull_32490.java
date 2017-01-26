package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32490 {
    private final Productionnull_32490 production = new Productionnull_32490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}