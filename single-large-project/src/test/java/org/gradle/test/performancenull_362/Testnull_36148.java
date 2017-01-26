package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36148 {
    private final Productionnull_36148 production = new Productionnull_36148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}