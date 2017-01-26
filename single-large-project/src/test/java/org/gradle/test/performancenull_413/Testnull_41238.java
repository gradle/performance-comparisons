package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41238 {
    private final Productionnull_41238 production = new Productionnull_41238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}