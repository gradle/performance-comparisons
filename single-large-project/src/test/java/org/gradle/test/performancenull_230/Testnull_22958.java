package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22958 {
    private final Productionnull_22958 production = new Productionnull_22958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}