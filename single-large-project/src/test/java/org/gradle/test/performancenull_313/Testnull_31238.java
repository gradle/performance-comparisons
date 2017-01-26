package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31238 {
    private final Productionnull_31238 production = new Productionnull_31238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}