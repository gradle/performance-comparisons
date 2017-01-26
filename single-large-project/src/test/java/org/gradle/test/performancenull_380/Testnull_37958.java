package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37958 {
    private final Productionnull_37958 production = new Productionnull_37958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}