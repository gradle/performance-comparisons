package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43916 {
    private final Productionnull_43916 production = new Productionnull_43916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}