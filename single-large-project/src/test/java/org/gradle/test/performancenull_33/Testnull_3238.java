package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3238 {
    private final Productionnull_3238 production = new Productionnull_3238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}