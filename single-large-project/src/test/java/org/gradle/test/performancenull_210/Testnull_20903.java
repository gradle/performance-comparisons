package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20903 {
    private final Productionnull_20903 production = new Productionnull_20903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}