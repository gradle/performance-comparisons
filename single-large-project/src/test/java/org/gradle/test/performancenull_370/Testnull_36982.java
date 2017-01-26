package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36982 {
    private final Productionnull_36982 production = new Productionnull_36982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}