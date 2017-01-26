package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48454 {
    private final Productionnull_48454 production = new Productionnull_48454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}