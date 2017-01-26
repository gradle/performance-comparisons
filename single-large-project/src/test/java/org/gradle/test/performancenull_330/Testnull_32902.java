package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32902 {
    private final Productionnull_32902 production = new Productionnull_32902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}