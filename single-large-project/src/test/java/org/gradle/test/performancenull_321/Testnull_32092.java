package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32092 {
    private final Productionnull_32092 production = new Productionnull_32092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}