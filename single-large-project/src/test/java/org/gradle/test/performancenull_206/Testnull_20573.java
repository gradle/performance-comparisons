package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20573 {
    private final Productionnull_20573 production = new Productionnull_20573("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}