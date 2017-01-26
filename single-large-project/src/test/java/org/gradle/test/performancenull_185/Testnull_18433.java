package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18433 {
    private final Productionnull_18433 production = new Productionnull_18433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}