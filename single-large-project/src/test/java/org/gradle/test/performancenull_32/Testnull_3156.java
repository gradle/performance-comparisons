package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3156 {
    private final Productionnull_3156 production = new Productionnull_3156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}