package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31200 {
    private final Productionnull_31200 production = new Productionnull_31200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}