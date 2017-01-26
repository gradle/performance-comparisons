package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36979 {
    private final Productionnull_36979 production = new Productionnull_36979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}