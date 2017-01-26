package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32454 {
    private final Productionnull_32454 production = new Productionnull_32454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}