package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41385 {
    private final Productionnull_41385 production = new Productionnull_41385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}