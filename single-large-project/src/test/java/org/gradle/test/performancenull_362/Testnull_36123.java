package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36123 {
    private final Productionnull_36123 production = new Productionnull_36123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}