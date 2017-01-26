package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12682 {
    private final Productionnull_12682 production = new Productionnull_12682("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}