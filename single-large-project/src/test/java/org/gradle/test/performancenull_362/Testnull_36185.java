package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36185 {
    private final Productionnull_36185 production = new Productionnull_36185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}