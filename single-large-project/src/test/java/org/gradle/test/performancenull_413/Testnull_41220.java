package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41220 {
    private final Productionnull_41220 production = new Productionnull_41220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}