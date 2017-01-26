package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31823 {
    private final Productionnull_31823 production = new Productionnull_31823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}