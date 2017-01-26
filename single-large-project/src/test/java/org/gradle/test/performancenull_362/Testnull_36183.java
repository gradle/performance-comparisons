package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36183 {
    private final Productionnull_36183 production = new Productionnull_36183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}