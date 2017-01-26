package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42136 {
    private final Productionnull_42136 production = new Productionnull_42136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}