package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24958 {
    private final Productionnull_24958 production = new Productionnull_24958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}